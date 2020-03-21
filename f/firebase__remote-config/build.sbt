organization := "org.scalablytyped.japgolly"
name := "firebase__remote-config"
version := "0.1.13-9048df"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.5.1-56434b",
  "org.scalablytyped.japgolly" %%% "firebase__installations-types" % "0.3.1-0ffe9f",
  "org.scalablytyped.japgolly" %%% "firebase__logger" % "0.1.35-90da9d",
  "org.scalablytyped.japgolly" %%% "firebase__remote-config-types" % "0.1.6-f1b4d1",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "0.2.40-0884a4",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
