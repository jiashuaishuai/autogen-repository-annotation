package com.github.annotation

/**
 * @property HANDLE_RESULT_TO_MAIN 处理结果到主线程
 * @property SWITCH_MAIN 直接切换到主线程
 * @property HANDLE_RESULT_TO_IO 处理结果到IO线程
 * @property SWITCH_IO 直接切换至IO线程
 * @property DO_NOT_HANDLE 不做任何处理，使用返回值默认操作
 * @property ONLY_HANDLE_RESULT 只处理结果不做线程操作
 */
enum class ThreadSchedulerType {

    HANDLE_RESULT_TO_MAIN, SWITCH_MAIN, HANDLE_RESULT_TO_IO, SWITCH_IO,DO_NOT_HANDLE,ONLY_HANDLE_RESULT


}