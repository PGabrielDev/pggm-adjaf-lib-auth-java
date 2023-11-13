package com.pggm.authlib.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public record RequestPathModel(
        String path,
        String method,

        AuthPermissions authPermissions
) {

}
