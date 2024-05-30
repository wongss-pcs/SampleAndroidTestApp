pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven {
            url = uri("https://10.73.249.1:8081/repository/maven-central")
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
       google()
       maven {
            url = uri("https://10.73.249.1:8081/repository/maven-central")
       }
     }
}

rootProject.name = "Sample Android TestApp"
include(":app")
 