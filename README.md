# About
TopCode.Cloud open source project is a set of open source collection . Including the base package , toolkit , security package , token package , payment package , excel package and so on.

Open source project components to do out of the box, to facilitate more developers to save duplication of work, more focused on business logic code writing.

I am Jon, a developer who focuses on learning and spreading technical knowledge. I hope these toolkits can help you, and welcome any friends to join this open source project.

project homepage : https://topcode.cloud

project github : https://github.com/topcodecloud

Jon's blog : https://jon.wiki

e-mail: ijonso123@gmail.com

# About topcode-base-code
topcode-base-code is A standard result and exception information.

# Quick Start
## Step 1: setting the pom.xml add dependency
``` xml
<dependency>
    <groupId>cloud.topcode.open</groupId>
    <artifactId>topcode-base-code</artifactId>
    <version>1.0.0</version>
</dependency>
```
## Step 2 ：To turn on global error configuration, use the following annotation.
``` java
@EnableCodeException
public class SpringBootApplication{
...
}
```
## Step 3 : No more step. Enjoy it.

# Version Notes
```xml
<dependency>
    <groupId>cloud.topcode.open</groupId>
    <artifactId>topcode-base-code</artifactId>
    <version>1.0.0.x</version>
</dependency>
```

The x in 1.0.0.x indicates the jdk version. 

For example: 

1.0.0 indicates the version that is adapted to jdk8. (no x bit) 

1.0.0.17 means that it is compatible with jdk17.