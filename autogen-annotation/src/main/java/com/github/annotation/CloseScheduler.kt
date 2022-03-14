package com.github.annotation

/**
 * 关闭线程调度器，
 * 不回调至mainThread
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class CloseScheduler
