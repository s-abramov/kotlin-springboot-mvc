package ru.sabramov.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWebMvcSpringBootApp

    fun main(args: Array<String>) {
        runApplication<KotlinWebMvcSpringBootApp>(*args)
    }