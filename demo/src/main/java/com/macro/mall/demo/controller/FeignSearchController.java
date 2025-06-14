package com.macro.mall.demo.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.demo.service.FeignSearchService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Feign调用mall-search接口示例
 */
@Tag(name = "FeignSearchController", description = "Feign调用mall-search接口示例")
@RestController
@RequestMapping("/feign/search")
public class FeignSearchController {

    @Autowired
    private FeignSearchService feignSearchService;

    @Operation(summary = "简单商品搜索")
    @RequestMapping(value = "/justSearch", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult search(@RequestParam(required = false) String keyword,
                               @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                               @RequestParam(required = false, defaultValue = "5") Integer pageSize) {

        return feignSearchService.search(keyword, pageNum, pageSize);
    }
}
