#!/bin/bash
main="src/com/i42/jdb/*.java"
orm="src/com/i42/jdb/orm/*.java"
dao="src/com/i42/jdb/orm/dao/*.java"

javac -d bin $main $orm $dao -classpath lib/ormlite-core.jar:lib/ormlite-jdbc.jar
