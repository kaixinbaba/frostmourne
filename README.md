# frostmourne
Help you to be real Arthas (https://github.com/alibaba/arthas), Pick up your Frostmourne！
成为真正的阿尔萨斯，拿起你的霜之哀伤!为了艾泽拉斯！
![arthas](https://www.google.com/imgres?imgurl=http%3A%2F%2Fimg4.18183.com%2Fuploads%2Fallimg%2F170417%2F21-1F41G12013.jpg%40q_80&imgrefurl=http%3A%2F%2Fhots.178.com%2F201704%2F286419895423.html&docid=hJmBWUF5zpGLKM&tbnid=w63ookoC2NK43M%3A&vet=10ahUKEwiluJL62erhAhWPGqYKHUsSC24QMwhOKBEwEQ..i&w=415&h=218&safe=strict&bih=824&biw=1476&q=%E9%98%BF%E5%B0%94%E8%90%A8%E6%96%AF%20%E5%9B%BE%E7%89%87&ved=0ahUKEwiluJL62erhAhWPGqYKHUsSC24QMwhOKBEwEQ&iact=mrc&uact=8)

## installment
推荐(下载jar)
```bash
wget https://alibaba.github.io/arthas/arthas-boot.jar
java -jar arthas-boot.jar
```
下载as.sh
```bash
curl -L https://alibaba.github.io/arthas/install.sh | sh
```
[官方文档地址](https://alibaba.github.io/arthas/install-detail.html)
## uninstallment
unix like
```bash
rm -rf ~/.arthas/
rm -rf ~/logs/arthas
```
windows
Windows平台直接删除user home下面的.arthas和logs/arthas目录

## quickstart
```bash
# 下载本demo
git clone https://github.com/kaixinbaba/frostmourne.git
用idea等工具打开直接运行Main.java中的main方法
# 切换到arthas下载的目录
java -jar arthas-boot.jar 
```
输入演示Main方法的进程编号
```bash
help # 直接查看帮助
```
```bash
# 子命令查看帮助以tt为例
tt -h
```
```bash
# 查看当前jvm进程仪表盘，有多少线程，运行的状态，堆内存使用占比等
dashboard # 按q退出，其他类似命令同
```
```bash
# 查看jvm参数
jvm
```
```bash
# 查看线程
thread 1 | grep 'main('
```
```bash
# 反编译指定类
jad frostmourne.Main
```
```bash
# 查看当前路径
pwd
```
```bash
# 清空当前屏幕
cls
```
```bash
# 查看会话信息
session
```
```bash
# 退出arthas客户端
quit
# 关闭arthas服务端
shutown
```
```bash
# 查看所有的系统和JVM属性
sysprop
# 查看某一个key的shuxing
sysprop java.home
# 设置属性
sysprop java.home /a/new/java/home/
```
```bash
# 查看所有环境变量
sysenv 
# 查看某一个环境变量
sysenv JAVA_HOME
```
```bash
# 查看类的静态成员变量
getstatic frostmourne.Main service
# public
getstatic frostmourne.Main publicInteger
# protected
getstatic frostmourne.Main protectedBoolean
# default
getstatic frostmourne.Main defaultDou
# private
getstatic frostmourne.Main privateFlo
```
```bash
# 查看类的信息
sc -d  frostmourne.ServiceImpl
```
```bash
# 查看类的方法信息
sm -d frostmourne.Main 
```
```bash
# 查看classloader已经加载类的数量
classloader
# 查看classloader继承树
classloader -t
```
```bash
# 每隔5秒输出 对该类的该方法的统计，调用次数，成功，失败次数, 平均耗时，失败率
monitor frostmourne.Main inputObject -c 5
```
```bash
# 监听该类该方法的返回值
watch frostmourne.Main inputObject returnObj
# 监听该类该方法的参数
watch frostmourne.Main inputObject params
# 监听该类该方法的第一个参数
watch frostmourne.Main inputObject params[0]
# 监听该类该方法的异常
watch frostmourne.Main throwMethod throwExp
# 组合记得加单引号
watch frostmourne.Main throwMethod '{params[0], target, returnObj}'
```
```bash
# 跟踪方法调用堆栈及耗时
trace frostmourne.ServiceImpl doService
```
```bash
# 输出调用堆栈
stack frostmourne.DaoImpl doDao 
```
```bash
# 开始方法调用记录, 按q退出
tt -t frostmourne.DaoImpl doDao 
# 查看已有记录列表
tt -l
# 查看某一条记录
tt -i 1000
# 对某一条记录进行replay
tt -i 1000 -p
# 删除某一条记录
tt -i 1006 -d
# 删除所有记录
tt --delete-all
```
## 后台任务
```bash
# 最后加上 & 就是异步job, >> 输出就会重定向到 joblog文件
trace frostmourne.Service doService >> joblog &
# 查看所有正在执行对job
jobs
# 停止某一个job, jobid 通过jobs查看
kill jobid
# 把后台到任务调到前台
```

## 使用docker
https://alibaba.github.io/arthas/docker.html


