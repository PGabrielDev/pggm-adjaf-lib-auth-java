package com.pggm.authlib.models;

public record AuthPermissions(
        String product,
        PERMISSIONS permissions
) {
}
