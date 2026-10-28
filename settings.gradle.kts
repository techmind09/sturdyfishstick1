pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "sturdyfishstick1"

// Safely include subdirectories that contain a build.gradle.kts file
rootDir.listFiles { file -> file.isDirectory }?.forEach { dir ->
    if (File(dir, "build.gradle.kts").exists()) {
        include(":${dir.name}")
    }
}
