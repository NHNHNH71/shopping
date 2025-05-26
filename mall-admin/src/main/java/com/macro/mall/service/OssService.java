package com.macro.mall.service;

import com.macro.mall.dto.OssCallbackResult;
import com.macro.mall.dto.OssPolicyResult;

import jakarta.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
