package com.github.annotation

/**
 *
 *  用来处理请求结果线程以及解析操作
 *  @param  threadScheduler 线程调度
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class ThreadScheduler(val threadScheduler: ThreadSchedulerType = ThreadSchedulerType.DO_NOT_HANDLE)
