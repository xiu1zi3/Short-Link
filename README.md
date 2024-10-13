
<p align="center">
   <img width="280" src="https://ice2604-navi.github.io/img/shortUrl.png" alt="logo">
</p>


<h4 align="center">短链跟踪系统</h4>
<p align="center">
   <img width="180" src="https://img2024.cnblogs.com/blog/3387348/202409/3387348-20240929005749151-551569963.jpg" alt="logo">
</p>
短链接经常出现在日常生活中，可以注意到营销短信当中常常是短链接，节省了文本长度

更重要的是，短链接跟踪记录的数据还可以用来识别用户行为、点击率等关键信息，这是很有意义的

> 如果当前图片 **不显示** 或 **加载缓慢**，请移步下面的 **博客文档** 📖

欢迎体验ShortLink ! 🔗 [cnblogs.com/xiu1zi3/p/18438747](https://www.cnblogs.com/xiu1zi3/p/18438747)

---


## 本地开始

### 🚀 启动后端


#### 数据库配置适应本地

全局搜索数据库密码配置，改为你自己用户名和密码
> 注意 redis 和 mysql的信息不仅在 `application.yaml`，由于用到了分表中间件，
> 还需要考虑到`shardingsphere-config-dev.yaml`和`shardingsphere-config-prod.yaml`

#### 快速创建表
`resources/database`目录下，依次执行2个sql文件：`link.sql`和`link-sql.sql`

#### 准备 Nacos
短链跟踪系统包含了微服务，需要安装启动 Nacos
推荐版本 `2.3.0`
下载地址：[github.com/alibaba/nacos/releases](https://github.com/alibaba/nacos/releases)

> 本地部署各方面条件你的电脑往往可以满足，直接干就行。
> 但如果用的是云服务器，一定在部署前先考虑机器的内存，具体参考：[部署文档](https://nacos.io/docs/v2/guide/admin/deployment/)

进入 `/nacos/bin` 目录，执行：

Windows
```
cmd startup.cmd -m standalone
```

Linux/Mac
```
sh startup.sh -m standalone
```

#### 配置本地 hosts
找到 你的设备当中的 hosts 文件，加上一行配置
```
127.0.0.1 nurl.ink
```
Mac 通常是 `/etc`目录下， Windows 通常是`C:\Windows\System32\drivers\etc`

#### 运行Spring Boot 项目
推荐语言版本 Java 17 ，通过IDEA J 依次运行
`shortlink-aggregation`和`shortlink-gateway`

### 启动前端

需要  `Nodejs`，建议`16.20.1`

进入 shortlink/console-vue 目录执行

```
npm run dev
```
顺利启动后，打开 Local: 后所接的链接即可进入～
<br>
<img src="https://img2024.cnblogs.com/blog/3387348/202409/3387348-20240929023141570-1316637928.png" alt="图片alt" title="图片title">

<img src="https://img2024.cnblogs.com/blog/3387348/202409/3387348-20240929023324944-1075527243.png" alt="图片alt" title="图片title">
<br>
如果你进一步开发，那么启动前需要再次安装依赖

```
npm install
npm run dev
```
