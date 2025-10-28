// patches/stub/build.gradle.kts
plugins {
    `java-library`
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
