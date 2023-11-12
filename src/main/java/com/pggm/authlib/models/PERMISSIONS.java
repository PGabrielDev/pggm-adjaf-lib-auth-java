package com.pggm.authlib.models;

public enum PERMISSIONS {
    LIST("LIST"),
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    DELETE("DELETE");
    private final String permission;
    PERMISSIONS(String permission) {
        this.permission = permission;
    }
    public String getPermission() {
        return permission;
    }

}
