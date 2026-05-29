cmake_minimum_required(VERSION 3.22.1)

project("wishes")

add_library(wishes-native SHARED
        src/main/cpp/native-lib.c)

target_link_libraries(wishes-native
        android
        log)