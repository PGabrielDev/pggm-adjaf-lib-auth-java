package com.pggm.authlib.middlewares;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public record RequestPathModel(
        String path,
        String method
) {

}
