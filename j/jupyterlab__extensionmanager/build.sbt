organization := "org.scalablytyped.japgolly"
name := "jupyterlab__extensionmanager"
version := "1.2.2-434018"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "jupyterlab__apputils" % "1.2.1-8edd43",
  "org.scalablytyped.japgolly" %%% "jupyterlab__coreutils" % "3.2.0-706227",
  "org.scalablytyped.japgolly" %%% "jupyterlab__observables" % "2.4.0-ead621",
  "org.scalablytyped.japgolly" %%% "jupyterlab__services" % "4.2.0-cb5b24",
  "org.scalablytyped.japgolly" %%% "phosphor__algorithm" % "1.2.0-436d64",
  "org.scalablytyped.japgolly" %%% "phosphor__commands" % "1.7.2-682fd6",
  "org.scalablytyped.japgolly" %%% "phosphor__coreutils" % "1.3.1-166b65",
  "org.scalablytyped.japgolly" %%% "phosphor__disposable" % "1.3.1-d69c6d",
  "org.scalablytyped.japgolly" %%% "phosphor__messaging" % "1.3.0-e44f58",
  "org.scalablytyped.japgolly" %%% "phosphor__signaling" % "1.3.1-ccc341",
  "org.scalablytyped.japgolly" %%% "phosphor__virtualdom" % "1.2.0-f29c88",
  "org.scalablytyped.japgolly" %%% "phosphor__widgets" % "1.9.3-f2fc8d",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
