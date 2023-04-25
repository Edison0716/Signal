package com.pika.lib_signal


/**
 *
 *#define SIGHUP 1
 *
 * #define SIGINT 2
 *
 * #define SIGQUIT 3
 *
 * #define SIGILL 4
 *
 * #define SIGTRAP 5
 *
 * #define SIGABRT 6
 *
 * #define SIGIOT 6
 *
 * #define SIGBUS 7
 *
 * #define SIGFPE 8
 *
 * #define SIGKILL 9
 *
 * #define SIGUSR1 10
 *
 * #define SIGSEGV 11
 *
 * #define SIGUSR2 12
 *
 * #define SIGPIPE 13
 *
 * #define SIGALRM 14
 *
 * #define SIGTERM 15
 *
 * #define SIGSTKFLT 16
 *
 * #define SIGCHLD 17
 *
 * #define SIGCONT 18
 *
 * #define SIGSTOP 19
 *
 * #define SIGTSTP 20
 *
 * #define SIGTTIN 21
 *
 * #define SIGTTOU 22
 *
 * #define SIGURG 23
 *
 * #define SIGXCPU 24
 *
 * #define SIGXFSZ 25
 *
 * #define SIGVTALRM 26
 *
 * #define SIGPROF 27
 *
 * #define SIGWINCH 28
 *
 * #define SIGIO 29
 *
 * #define SIGPOLL SIGIO
 *
 * #define SIGPWR 30
 *
 * #define SIGSYS 31
 *
 * SIGHUP：该信号表示终端挂起或控制进程终止时发出。
 *
 * SIGINT：该信号表示来自键盘的中断（例如 Ctrl+C）时发出。
 *
 * SIGQUIT：该信号表示来自键盘的退出命令（例如 Ctrl+\）时发出。
 *
 * SIGILL：该信号表示非法指令错误时发出。
 *
 * SIGTRAP：该信号都它们叫做breakpoint trap(中断陷阱)。cpu执行"int 3"就会触发这个trap.所以vs往往在函数头部插入一条三号中断，方便调试器“挂钩”
 *
 * SIGABRT：该信号表示由abort函数函數调用引起的放弃操作时发出。
 *
 * SIGBUS：该信号表示地址未对齐、硬件访问异常或者其他总线错误时发出。
 *
 * SIGSEGV：该信号表示无效内存引用或页面错误时发出。
 */
class SignalConst {
    companion object {
        const val SIGHUP = 1
        const val SIGINT = 2
        const val SIGQUIT = 3
        const val SIGILL = 4
        const val SIGTRAP = 5
        const val SIGABRT = 6
        const val SIGBUS = 7
        const val SIGSEGV = 11
    }
}