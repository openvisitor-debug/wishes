# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# signingConfigs blocks in the android block.

-keep class com.example.wishes.** { *; }
-keepclasseswithmembernames class * {
    native <methods>;
}