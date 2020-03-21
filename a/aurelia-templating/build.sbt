organization := "org.scalablytyped.japgolly"
name := "aurelia-templating"
version := "1.10.2-3e6a2b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "aurelia-binding" % "2.5.0-90c83b",
  "org.scalablytyped.japgolly" %%% "aurelia-dependency-injection" % "1.5.1-96236e",
  "org.scalablytyped.japgolly" %%% "aurelia-loader" % "1.0.2-8861b5",
  "org.scalablytyped.japgolly" %%% "aurelia-metadata" % "1.0.6-54ac56",
  "org.scalablytyped.japgolly" %%% "aurelia-task-queue" % "1.3.3-87f507",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
