package me.lorenc.springboot.lifecycle

import me.lorenc.springboot.lifecycle.listener.application.ApplicationEnvironmentPreparedListener
import me.lorenc.springboot.lifecycle.listener.application.ApplicationPreparedListener
import me.lorenc.springboot.lifecycle.listener.application.ApplicationReadyListener
import me.lorenc.springboot.lifecycle.listener.application.ApplicationStartingListener
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class SpringBootLifecycleApplication

fun main(args: Array<String>) {
    println(">>>>>>>>>>main function started")
    SpringApplicationBuilder(SpringBootLifecycleApplication::class.java)
            .listeners(
                    ApplicationStartingListener(),
                    ApplicationEnvironmentPreparedListener(),
                    ApplicationPreparedListener(),
                    ApplicationReadyListener()
            )
            .run(*args)
    println(">>>>>>>>>>main function finished")
}
