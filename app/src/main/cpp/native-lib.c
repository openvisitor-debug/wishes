#include <jni.h>
#include <string.h>

JNIEXPORT jstring JNICALL
Java_com_example_wishes_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    const char *native_message = "Hello from Native Code!";
    return (*env)->NewStringUTF(env, native_message);
}