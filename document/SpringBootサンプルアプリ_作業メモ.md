# SpringBootサンプルアプリ_作業メモ

Spring initializrでテンプレートを作成。

依存関係は以下のものをとりあえずいれる。後から追加するかも

![image-20220414164212309](https://github.com/hawkskf/springboot-app-practice/blob/master/document/images/image-20220414164212309.png)

MavenでSQLite-jdbcを追加する。

pom.xml

```xml
<dependency>
    <groupId>org.xerial</groupId>
    <artifactId>sqlite-jdbc</artifactId>
    <version>3.36.0.3</version>
</dependency>
```







参考

[VScodeでSpringBoot + MyBatisプロジェクトを作成する](https://zenn.dev/s_t_pool/articles/486dfaa7c2e5fb7a6a03)