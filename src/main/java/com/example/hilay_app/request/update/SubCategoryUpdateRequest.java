package com.example.hilay_app.request.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryUpdateRequest {


    private String subCategoryName;
    private long fkMainCategoryId;
}