# kata
kata coding

## 用法

* 生成 IDEA 工程

```shell
./gradlew idea
```

* 检查

```shell
./gradlew check
```
* 生成构建产物

```shell
./gradlew build
```

* 运行应用

```shell
./gradlew bootRun
```

# kata列表
## bankocr 
https://codingdojo.org/kata/BankOCR/  
- User Story 1：编写一个程序，该程序可以接收该文件并将其解析为实际的帐号
  - [X] Given 文件路径./scan1，When 解析账号，Then 返回账号列表，里面有1个000000000的账号
  - [ ] Given 文件路径./scan1，When 解析账号，Then 返回账号列表，里面有3个000000000，111111111，222222222的账号
  - [ ] Given 1个3\*27的字符串，When 按3\*3切割，Then 返回9个3\*3的数字块列表
  - [ ] Given 数字1，When 用一维数组保存关键点，Then 返回标准数字位图[000001001]
  - [ ] Given 代表0的3*3的数字块，When 与标准数字位图比较 Then 返回数字0
  - [ ] Given 代表1的3*3的数字块，When 与标准数字位图比较 Then 返回数字1
  - [ ] Given 3行0的字符串，When 按3*3的占位解析每个数组，Then 返回000000000
  - [ ] Given 3行1的字符串，When 按3*3的占位解析每个数组，Then 返回111111111

