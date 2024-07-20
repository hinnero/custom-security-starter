package com.example.securitystarter.grpc;

import com.example.token.Token;
import com.example.token.TokenServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenServiceClient {

    @GrpcClient("tokenService")
    private TokenServiceGrpc.TokenServiceBlockingStub tokenServiceBlockingStub;

    public Token.ValidateTokenResponse validateToken(String token) {
        Token.ValidateTokenRequest request = Token.ValidateTokenRequest.newBuilder()
                .setToken(token)
                .build();
        return tokenServiceBlockingStub.validateToken(request);
    }
}
