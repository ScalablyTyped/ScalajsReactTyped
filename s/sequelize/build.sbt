organization := "org.scalablytyped.japgolly"
name := "sequelize"
version := "4.28.0-dt-20220819Z-9df01b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20220923Z-dde6a1",
  "org.scalablytyped.japgolly" %%% "continuation-local-storage" % "3.2-dt-20211223Z-68717d",
  "org.scalablytyped.japgolly" %%% "lodash" % "4.14-dt-20220928Z-eb2108",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "validator" % "13.7-dt-20221015Z-c84548")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
