# 微服务商城系统

## 项目简介

微服务商城系统是一个基于Spring Cloud Alibaba的分布式电商平台，采用前后端分离架构，涵盖商品、订单、促销、内容、用户等核心业务模块，支持高并发、易扩展、易维护。

## 主要功能

- 商品管理：商品的增删改查、分类、品牌、库存等管理
- 订单管理：订单创建、支付、发货、售后等流程
- 促销管理：优惠券、满减、限时购等促销活动
- 内容管理：广告、专题、文章等内容管理
- 用户管理：会员注册、登录、权限、积分等
- 搜索服务：基于Elasticsearch的商品搜索
- 监控中心：服务健康监控与告警
- 网关服务：统一API网关，路由与鉴权

## 系统架构与模块说明

- admin：后台管理服务，提供管理端接口
- portal：前台商城服务，提供用户端接口
- gateway：API网关服务，统一入口
- auth：认证服务，提供统一认证与授权
- search：搜索服务，基于Elasticsearch
- monitor：监控中心，服务监控与告警
- demo：测试与示例服务
- mbg：MyBatis代码生成模块
- common：通用工具与基础依赖

## 技术栈

- Spring Boot 3.2
- Spring Cloud 2023
- Spring Cloud Alibaba
- MyBatis/MyBatis-Plus
- MySQL、Redis、MongoDB、Elasticsearch、RabbitMQ
- Nacos（注册中心/配置中心）
- Sa-Token（权限认证）
- Knife4j（API文档）
- Docker、K8s（可选容器化部署）
