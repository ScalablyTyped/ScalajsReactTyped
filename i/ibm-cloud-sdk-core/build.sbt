organization := "org.scalablytyped.japgolly"
name := "ibm-cloud-sdk-core"
version := "3.1.0-7accdc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "axios" % "1.1.3-dbbef5",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20211202Z-7cd5bd",
  "org.scalablytyped.japgolly" %%% "ms" % "v0.7.1-dt-20220818Z-ed60be",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tough-cookie" % "4.0-dt-20220414Z-f938b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
