.\00_postgre.md


﻿PostgreSQL
----------

* http://www.postgresql.org - основной сайт
* http://www.postgresql.org/download/ - для скачивания
* Реально скачиваем с: http://www.enterprisedb.com/products-services-training/pgdownload#windows - выбираем разрядность своей ОС
* Утилита для администрирования: pgAdmin III: http://www.postgresql.org/ftp/pgadmin3/release/v1.20.0/win32/

``` xml
<groupId>com.github.spring-mvc-archetypes</groupId>
<artifactId>spring-mvc-quickstart</artifactId>
<version>1.0.0</version>
```

.\99_homework.md


﻿Домашнее задание
----------------
* Сохранение в файл и загрузка объекта из файла
** object.txt **
```
MyClass
str: Строчка
i: 23
d: 1.2
b: true
```
* Дополнить в FileStorage реализацию методов save/load.
* Дополнить реализацию FileStorage методами delete, update, getList.
* Загрузить и настроить Tomcat.
**tomcat\conf\tomcat-users.xml**

``` xml
  <role rolename="manager-gui"/>
  <user username="admin" password="123" roles="manager-gui"/>
```
* Изучить примеры к Tomcat
  * tomcat\webapps\examples\jsp\jsp2\el\composite.jsp - путь к примеру в папке.
  * http://localhost:8080/examples/jsp/jsp2/el/composite.jsp - путь к примеру в браузере.




Литература
----------
* JMM
* Java Concurrency in Practice - http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601
* JDK concurrent package
* Обзор java.util.concurrent.
* Синхронизация потоков

.\PostgreDemo\pom.xml

.\PostgreDemo\src\main\java\A.java

.\PostgreDemo\src\main\java\java_06\Application.java

.\PostgreDemo\src\main\java\java_06\account\Account.java

.\PostgreDemo\src\main\java\java_06\account\AccountController.java

.\PostgreDemo\src\main\java\java_06\account\AccountRepository.java

.\PostgreDemo\src\main\java\java_06\account\UserService.java

.\PostgreDemo\src\main\java\java_06\config\ApplicationConfig.java

.\PostgreDemo\src\main\java\java_06\config\JpaConfig.java

.\PostgreDemo\src\main\java\java_06\config\MongoConfig.java

.\PostgreDemo\src\main\java\java_06\config\SecurityConfig.java

.\PostgreDemo\src\main\java\java_06\config\WebAppInitializer.java

.\PostgreDemo\src\main\java\java_06\config\WebMvcConfig.java

.\PostgreDemo\src\main\java\java_06\error\CustomErrorController.java

retrieve some useful information from the request
String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
.\PostgreDemo\src\main\java\java_06\error\ExceptionHandler.java

.\PostgreDemo\src\main\java\java_06\home\HomeController.java

.\PostgreDemo\src\main\java\java_06\signin\SigninController.java

.\PostgreDemo\src\main\java\java_06\signup\SignupController.java

see /WEB-INF/i18n/messages.properties and /WEB-INF/views/homeSignedIn.html
.\PostgreDemo\src\main\java\java_06\signup\SignupForm.java

.\PostgreDemo\src\main\java\java_06\support\web\Message.java

.\PostgreDemo\src\main\java\java_06\support\web\MessageHelper.java

.\PostgreDemo\src\test\java\java_06\account\UserAuthenticationIntegrationTest.java

.\PostgreDemo\src\test\java\java_06\account\UserServiceTest.java

act
assert
arrange
act
arrange
act
assert
.\PostgreDemo\src\test\java\java_06\config\EmbeddedDataSourceConfig.java

.\PostgreDemo\src\test\java\java_06\config\NoCsrfSecurityConfig.java

.\PostgreDemo\src\test\java\java_06\config\WebAppConfigurationAware.java

.\PostgreDemo\src\test\java\java_06\config\WebSecurityConfigurationAware.java

.\PostgreDemo\src\test\java\java_06\signup\SignupControllerTest.java

.\SpringHibernateMySQL\README.md


Использование Hibernate
=======================

1. Скачать MySQL: http://dev.mysql.com/downloads/mysql/5.5.html#downloads
2. Скачать dbForge Studio for MySQL: http://www.devart.com/ru/dbforge/mysql/studio/download.html
3. Установить MySQL Server
4. Установить dbForge Studio for MySQL



.\SpringHibernateMySQL\pom.xml

.\SpringHibernateMySQL\src\main\java\controller\DataController.java

.\SpringHibernateMySQL\src\main\java\dao\DataDao.java

.\SpringHibernateMySQL\src\main\java\dao\DataDaoImpl.java

.\SpringHibernateMySQL\src\main\java\model\Employee.java

.\SpringHibernateMySQL\src\main\java\services\DataService.java

.\SpringHibernateMySQL\src\main\java\services\DataServiceImpl.java

.\SpringHibernateMySQL\src\test\java\EmployeeTest.java

.\SpringHibernatePostgeSQL\pom.xml

.\WebServiceDemo\pom.xml

.\WebServiceDemo\src\main\java\example\HelloWorld.java

.\pom.xml

.\spring-mvc-quickstart-archetype\README.md


Spring MVC 4 Quickstart Maven Archetype
=========================================

Summary
-------
The project is a Maven archetype for Spring MVC 4 web application.

Generated project characteristics
-------------------------
* No-xml Spring MVC 4 web application for Servlet 3.0 environment
* Thymeleaf, Bootstrap
* JPA 2.0 (Hibernate/HSQLDB/Spring Data JPA)
* MongoDB (Spring Data Mongo)
* JUnit/Mockito
* Spring Security 3.2

Installation
------------

To install the archetype in your local repository execute following commands:

```bash
    git clone https://github.com/kolorobot/spring-mvc-quickstart-archetype.git
    cd spring-mvc-quickstart-archetype
    mvn clean install
```


Create a project
----------------

```bash
    mvn archetype:generate \
        -DarchetypeGroupId=com.github.spring-mvc-archetypes \
        -DarchetypeArtifactId=spring-mvc-quickstart \
        -DarchetypeVersion=1.0.0-SNAPSHOT \
        -DgroupId=my.groupid \
        -DartifactId=my-artifactId \
        -Dversion=version
```

Run the project
----------------

```bash
	mvn test tomcat7:run
```

Test on the browser
-------------------

	http://localhost:8080/my-artifactId/

Note: No additional services are required in order to start the application. Mongo DB configuration is in place but it is not used in the code.

Creating a new project in Eclipse
----------------------------------

* Import archetype URI by `Import ... > Projects from Git > Clone URI`
* Install the archetype in local repository with `mvn install`
* Go to `Preferences > Maven > Archetypes` and `Add Local Catalog`
* Select the catalog from file (`archetype-catalog.xml`)
* Create new Maven project and select the archetype (remember so select `Include snapshot archetypes`)

.\spring-mvc-quickstart-archetype\pom.xml

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\pom.xml

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\Application.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\account\Account.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\account\AccountController.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\account\AccountRepository.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\account\UserService.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\ApplicationConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\DataSourceConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\DefaultDataSourceConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\JpaConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\MongoConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\SecurityConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\WebAppInitializer.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\config\WebMvcConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\error\CustomErrorController.java

retrieve some useful information from the request
String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\error\ExceptionHandler.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\home\HomeController.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\signin\SigninController.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\signup\SignupController.java

see /WEB-INF/i18n/messages.properties and /WEB-INF/views/homeSignedIn.html
.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\signup\SignupForm.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\support\web\Message.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\main\java\support\web\MessageHelper.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\test\java\account\UserAuthenticationIntegrationTest.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\test\java\account\UserServiceTest.java

act
assert
arrange
act
arrange
act
assert
.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\test\java\config\EmbeddedDataSourceConfig.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\test\java\config\WebAppConfigurationAware.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\test\java\config\WebSecurityConfigurationAware.java

.\spring-mvc-quickstart-archetype\src\main\resources\archetype-resources\src\test\java\signup\SignupControllerTest.java

