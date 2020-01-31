# origami-archetype
maven archetype for origami/java

Use with:

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate \
-DarchetypeArtifactId=maven-archetype \
-DarchetypeGroupId=origami \
-DarchetypeVersion=4.2 \
-DarchetypeCatalog=https://repository.hellonico.info/repository/hellonico/ \
-Dversion=1.0-SNAPSHOT \
-DgroupId=hello \
-DartifactId=cvj
```

Upload with

```
 mvn -U compile deploy 
```