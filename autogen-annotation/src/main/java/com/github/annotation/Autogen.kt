package com.github.annotation


/**
 * 自动生成ApiRequest和ApiRepository
 * 返回值类型默认操作:
 * 1. io.reactivex.Observable<?> 回调至mainThread
 * 2. io.reactivex.Observable<BaseResponse<?>> 解析BaseResponse返回他的泛型类型，并回调至mainThread
 * 3. 如果不使用 io.reactivex.Observable<?>，则不处理结果
 * 4. 也可以使用 {@link ThreadScheduler} 选择
 *
 * @param host:域名地址，不写则默认使用网络框架的BASE_URL
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class Autogen(val host: String = "")
