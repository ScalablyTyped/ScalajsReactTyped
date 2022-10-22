organization := "org.scalablytyped.japgolly"
name := "azure-arm-resource"
version := "7.4.0-59782c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "adal-node" % "0.2.3-3c3342",
  "org.scalablytyped.japgolly" %%% "ms-rest" % "2.5.6-2ca3ea",
  "org.scalablytyped.japgolly" %%% "ms-rest-azure" % "3.0.2-7889fc",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
