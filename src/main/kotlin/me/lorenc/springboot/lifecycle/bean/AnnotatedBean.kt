package me.lorenc.springboot.lifecycle.bean

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class AnnotatedBean(
        @Value("\${config.prop}") private var configProp: String
) {

    @PostConstruct
    fun init() {
        println(">>>>>>>>>>AnnotatedBean:PostConstruct")
        println(">>>>>>>>>> - config property: $configProp")
    }

    @PreDestroy
    fun destroy() {
        println(">>>>>>>>>>AnnotatedBean:PreDestroy")
    }
}
