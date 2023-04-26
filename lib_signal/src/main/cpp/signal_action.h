//
// Created by pika on 2023/1/5.
//

#ifndef SIGNAL_SIGNAL_ACTION_H
#define SIGNAL_SIGNAL_ACTION_H
#include <jni.h>
#define SIGNAL_CRASH_STACK_SIZE (1024 * 128)
#define TAG "hi_signal"
#define TAG_EDISON "edison_signal"
#define THREAD_NAME "signal_init"
#define THREAD_SIGNAL_READ "signal_read"

void init_with_signal(JNIEnv *env, jclass klass,
                      jintArray signals,void (*handler)(int));



#endif //SIGNAL_SIGNAL_ACTION_H

