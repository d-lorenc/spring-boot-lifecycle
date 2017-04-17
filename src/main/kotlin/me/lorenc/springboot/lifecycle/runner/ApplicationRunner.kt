package me.lorenc.springboot.lifecycle.runner

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApplicationRunner(
        @Value("\${config.prop}") private var configProp: String
) : ApplicationRunner {

    override fun run(applicationArguments: ApplicationArguments) {
        println(">>>>>>>>>>ApplicationRunner:run")
        println(">>>>>>>>>> - application args: ${applicationArguments.sourceArgs.toList()}")
        println(">>>>>>>>>> - config property: $configProp")
    }
}
