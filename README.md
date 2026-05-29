# Wishes - Android App with Native Source

This is an Android application that demonstrates how to build an APK with native C source files using JNI (Java Native Interface).

## Project Structure

```
wishes/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── cpp/
│   │       │   └── native-lib.c          # Native C source code
│   │       ├── java/
│   │       │   └── com/example/wishes/
│   │       │       └── MainActivity.java  # Main Android Activity
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   └── values/
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       └── AndroidManifest.xml
│   ├── build.gradle
│   ├── CMakeLists.txt
│   └── proguard-rules.pro
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Requirements

- Android Studio 2022.1 or later
- Android SDK (API 34)
- Android NDK
- Java 8 or later
- Gradle 7.4.2 or later

## Building the APK

### Using Android Studio
1. Open the project in Android Studio
2. Wait for Gradle sync to complete
3. Go to **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
4. The APK will be generated in `app/build/outputs/apk/debug/`

### Using Command Line
```bash
./gradlew build
```

Or for debug APK only:
```bash
./gradlew assembleDebug
```

## Features

- **Native C Integration**: Demonstrates JNI binding with native C code
- **CMake Build System**: Uses CMake for compiling native libraries
- **Modern Android**: Targets API 34 with AndroidX support

## Output

The APK file will be located at:
- Debug: `app/build/outputs/apk/debug/app-debug.apk`
- Release: `app/build/outputs/apk/release/app-release.apk`

## Native Code

The native code in `app/src/main/cpp/native-lib.c` contains a simple JNI function that returns a string from native code, demonstrating the Java-Native interface.
