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

