package com.example.securitystarter.config;

import com.example.securitystarter.grpc.TokenServiceClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SecurityConfiguration.class, JwtAuthenticationFilter.class, TokenServiceClient.class})
public class SecurityAutoConfiguration {
}
