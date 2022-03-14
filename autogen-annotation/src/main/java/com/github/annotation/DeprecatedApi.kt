package com.github.annotation


/**
 * apt获取的Deprecated过期注解是java.lang下的注解，不是kotlin Annotations中的过期注解，所以用DeprecatedApi来替代
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class DeprecatedApi(
    val message: String,
    val replaceWith: ReplaceWith = ReplaceWith(""),
    val level: DeprecationLevel = DeprecationLevel.WARNING
)
