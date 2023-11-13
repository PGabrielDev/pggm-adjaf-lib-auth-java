package com.pggm.authlib.middlewares;

import com.pggm.authlib.models.RequestPathModel;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;


@AllArgsConstructor
@Data
public class AuthenticatedRequestPath {
    private List<RequestPathModel> autenticatedPaths;
    public boolean verifyAuthenticatedRequest(final String path, final  String method) {
        final var request = autenticatedPaths.stream()
                .filter(r -> r.path().equals(path) && r.method().equals(method))
                .toList();
        return  !request.isEmpty();
    }
}
