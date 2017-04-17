package me.lorenc.springboot.lifecycle.runner

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class CommandLineRunner(
        @Value("\${config.prop}") private var configProp: String
) : CommandLineRunner {

    override fun run(vararg args: String) {
        println(">>>>>>>>>>CommandLineRunner:run")
        println(">>>>>>>>>> - args: ${args.toList()}")
        println(">>>>>>>>>> - config property: $configProp")
    }
}
