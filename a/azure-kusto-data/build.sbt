organization := "org.scalablytyped.japgolly"
name := "azure-kusto-data"
version := "3.4.2-ac6e29"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "axios" % "1.1.3-dbbef5",
  "org.scalablytyped.japgolly" %%% "azure__abort-controller" % "1.1.0-21258e",
  "org.scalablytyped.japgolly" %%% "azure__core-auth" % "1.4.0-4e7c67",
  "org.scalablytyped.japgolly" %%% "azure__msal-common" % "7.4.1-18af68",
  "org.scalablytyped.japgolly" %%% "azure__msal-node" % "1.14.0-d3f6df",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
