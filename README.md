# origami-archetype
maven archetype for origami/java

Use with:

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate \
-DarchetypeArtifactId=maven-archetype \
-DarchetypeGroupId=origami \
-DarchetypeVersion=4.7.0-1 \
-DarchetypeCatalog=https://repository.hellonico.info/repository/hellonico/ \
-Dversion=1.0-SNAPSHOT \
-DgroupId=hello \
-DartifactId=cvj
```

Or:

```
curl -s http://repository.hellonico.info/repository/vendredi/origami/gen.sh | bash
```

Upload with

```
 mvn -U compile deploy 
```
