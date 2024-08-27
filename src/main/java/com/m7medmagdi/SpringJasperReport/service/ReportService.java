package com.m7medmagdi.SpringJasperReport.service;


import com.m7medmagdi.SpringJasperReport.entity.SampleData;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {


    public byte[] generateReport() throws JRException, IOException {
        // Load the Jasper report from .jrxml file
        InputStream inputStream = new ClassPathResource("report.jrxml").getInputStream();
        JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);

        // Sample data
        Map<String, Object> parameters = new HashMap<>();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(getSampleData());

        // Fill the report
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

        // Export the report to PDF
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }

    private List<SampleData> getSampleData() {
        List<SampleData> dataList = new ArrayList<>();
        dataList.add(new SampleData(1, "Mohamed Magdy"));
        dataList.add(new SampleData(2, "Java Developer"));
        dataList.add(new SampleData(3, "Java Spring Boot"));
        return dataList;
    }
}
