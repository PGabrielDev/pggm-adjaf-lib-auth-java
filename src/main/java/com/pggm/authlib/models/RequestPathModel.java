package com.pggm.authlib.models;



public record RequestPathModel(
        String path,
        String method,

        AuthPermissions authPermissions
) {

}
