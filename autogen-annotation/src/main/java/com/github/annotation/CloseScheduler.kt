package com.github.annotation

/**
 * 关闭线程调度器，
 * 不回调至mainThread
 *  @param  handleResult 是否处理结果
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class CloseScheduler(val handleResult: Boolean = false)
