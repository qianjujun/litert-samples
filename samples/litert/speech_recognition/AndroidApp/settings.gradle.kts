pluginManagement {
  repositories {
    google {
      content {
        includeGroupByRegex("com\\.android.*")
        includeGroupByRegex("com\\.google.*")
        includeGroupByRegex("androidx.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins { id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0" }

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    maven { url = uri("https://chaquo.com/maven") }
  }
}

rootProject.name = "Asr"

include(":app")

// NPU feature modules are optional. The CPU/GPU APK does not include them.
// To enable a vendor NPU, install litert_npu_runtime_libraries (see
// https://developers.googleblog.com/unlocking-peak-performance-on-qualcomm-npu-with-litert/),
// uncomment the matching dynamicFeatures line in app/build.gradle.kts, and include the
// modules here:
// include(":litert_npu_runtime_libraries:runtime_strings")
// include(":litert_npu_runtime_libraries:google_tensor_runtime")
// include(":litert_npu_runtime_libraries:mediatek_runtime_v8")
// include(":litert_npu_runtime_libraries:mediatek_runtime_v9")
// include(":litert_npu_runtime_libraries:qualcomm_runtime_v69")
// include(":litert_npu_runtime_libraries:qualcomm_runtime_v73")
// include(":litert_npu_runtime_libraries:qualcomm_runtime_v75")
// include(":litert_npu_runtime_libraries:qualcomm_runtime_v79")
// include(":litert_npu_runtime_libraries:qualcomm_runtime_v81")
