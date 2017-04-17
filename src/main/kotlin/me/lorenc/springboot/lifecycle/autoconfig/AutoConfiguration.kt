package me.lorenc.springboot.lifecycle.autoconfig

import org.springframework.boot.autoconfigure.AutoConfigureBefore
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.context.annotation.Configuration

@Configuration
@AutoConfigureBefore(DataSourceAutoConfiguration::class)
class AutoConfiguration {

    init {
        println(">>>>>>>>>>AutoConfiguration:init")
    }
}