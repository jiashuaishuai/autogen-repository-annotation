package com.github.annotation


/**
 * 自动生成ApiRequest和ApiRepository
 * 返回值类型:
 * 1. io.reactivex.Observable<?> 默认使用AbsRepository.applySchedulers()回调至mainThread
 * 2. io.reactivex.Observable<com.baselib.model.response.BaseResponse<?>>
 *    默认使用AbsRepository.handleResult() 解析BaseResponse返回他的泛型类型，并回调至mainThread
 * 3. 如果不使用 io.reactivex.Observable<?>，则不会自动切换线程
 * 4. 使用@CloseScheduler取消使用线程调度器
 * 5. 使用DeprecatedApi标注过期Api
 *
 *
 * host:域名地址，不写则默认使用网络框架的BASE_URL
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class Autogen(val host: String = "")
