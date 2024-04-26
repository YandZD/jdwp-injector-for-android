package com.wuyr.jdwp_injector.exception

/**
 * @author wuyr
 * @github https://github.com/wuyr/jdwp-injector-for-android
 * @since 2024-04-21 8:45 PM
 */
class ProcessNotFoundException : RuntimeException("target process not found, please open it first")