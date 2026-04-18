plugins {
    id("kotlin-conventions")
    id("spring-conventions")
}

tasks.bootJar {
    enabled = false
}