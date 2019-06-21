package io.fsbg.inochi.dm1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Inochidemo 1.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
