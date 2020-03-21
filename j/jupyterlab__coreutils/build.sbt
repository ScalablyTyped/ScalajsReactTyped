organization := "org.scalablytyped.japgolly"
name := "jupyterlab__coreutils"
version := "3.2.0-706227"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "phosphor__algorithm" % "1.2.0-436d64",
  "org.scalablytyped.japgolly" %%% "phosphor__commands" % "1.7.2-682fd6",
  "org.scalablytyped.japgolly" %%% "phosphor__coreutils" % "1.3.1-166b65",
  "org.scalablytyped.japgolly" %%% "phosphor__disposable" % "1.3.1-d69c6d",
  "org.scalablytyped.japgolly" %%% "phosphor__signaling" % "1.3.1-ccc341",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
