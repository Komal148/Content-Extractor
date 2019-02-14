package com.stackroute.domain;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Arrays;

@EntityScan
@Data
public class PdfDomain {

    private String documentId;
    private String documentText;
    private String[] documentMetaData;

}
