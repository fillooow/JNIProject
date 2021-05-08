#include <jni.h>
#include <stdlib.h>
#include <time.h>

jint randomize() {
    srand((unsigned int) time(0));
    int intrandom = (rand() % (990 - 101)) + 101;
    return intrandom;
}

extern "C" JNIEXPORT jint JNICALL Java_com_example_jni_1project_MainActivity_randomize(JNIEnv *env, jobject object)
{
return (jint) randomize();
}