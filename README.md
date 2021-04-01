### maven常见命令
#### 清理
```
mvn clean
```
#### 打包 （跳过单元测试）
```
mvn install（mvn install -Dmaven.test.skip=true）
```
#### 编译打包（跳过单元测试）
```
mvn package（mvn package -Dmaven.test.skip=true）
```
#### 发布打包（跳过单元测试）
```
mvn deploy（mvn deploy -Dmaven.test.skip=true）
```
####指定环境打包（跳过单元测试）
```
mvn package -Pdev（mvn package -Pdev -Dmaven.test.skip=true）
```
### git常见命令
#### 初始化
```
git init
```
#### 把修改的文件加入缓冲区
```
git add .
```
#### 提交代码
```
git commit -m '注释'
```
#### 推送到远程仓库
```
git push
```
