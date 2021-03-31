package com.m.jmvvmlibrary.base.net

class ApiException(var code: String, override var message: String) : RuntimeException()