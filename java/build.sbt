//
// Licensed to the Apache Software Foundation (ASF) under one or more
// contributor license agreements.  See the NOTICE file distributed with
// this work for additional information regarding copyright ownership.
// The ASF licenses this file to You under the Apache License, Version 2.0
// (the "License"); you may not use this file except in compliance with
// the License.  You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.19"

lazy val root = (project in file("."))
  .settings(
    name := "SparkConnectGoRunner"
  )

libraryDependencies += "org.apache.spark" %% "spark-sql-api" % "3.5.4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.4"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.4"
libraryDependencies += "org.apache.spark" %% "spark-connect-common" % "3.5.4"
libraryDependencies += "org.apache.spark" %% "spark-connect" % "3.5.4"