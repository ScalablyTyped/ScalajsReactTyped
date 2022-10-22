organization := "org.scalablytyped.japgolly"
name := "ethersproject__abi"
version := "5.7.0-ed9e5f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ethersproject__bignumber" % "5.7.0-d7bef1",
  "org.scalablytyped.japgolly" %%% "ethersproject__bytes" % "5.7.0-44783d",
  "org.scalablytyped.japgolly" %%% "ethersproject__properties" % "5.7.0-84449c",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
