plugins {
    id("java")
    id("application")
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

application {
    mainClass = "com.example.Main"
    applicationDefaultJvmArgs = listOf(
        "-Dlogging.encoder.console.pattern=%d{HH:mm:ss.SSS} - %msg%n"
    )
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.17")
    runtimeOnly("io.jstach.rainbowgum:rainbowgum-slf4j:0.8.2")
    runtimeOnly("io.jstach.rainbowgum:rainbowgum-pattern:0.8.2")
}
