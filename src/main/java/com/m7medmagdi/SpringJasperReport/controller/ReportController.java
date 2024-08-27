package com.m7medmagdi.SpringJasperReport.controller;


import com.m7medmagdi.SpringJasperReport.service.ReportService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/pdf")
    public HttpEntity<byte[]> getReport() throws Exception {
        byte[] reportContent = reportService.generateReport();

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, "application/pdf");
        headers.setContentDispositionFormData("attachment", "report.pdf");

        return new ResponseEntity<>(reportContent, headers, HttpStatus.OK);
    }
}