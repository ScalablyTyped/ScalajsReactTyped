organization := "org.scalablytyped.japgolly"
name := "web3-shh"
version := "1.8.0-383766"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bignumber_dot_js" % "9.1.0-442d76",
  "org.scalablytyped.japgolly" %%% "bn_dot_js" % "5.1-dt-20220829Z-191285",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "web3-core" % "1.8.0-a86950",
  "org.scalablytyped.japgolly" %%% "web3-core-helpers" % "1.8.0-febfe4",
  "org.scalablytyped.japgolly" %%% "web3-core-method" % "1.8.0-c9058b",
  "org.scalablytyped.japgolly" %%% "web3-net" % "1.8.0-3c34cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
