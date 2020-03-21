organization := "org.scalablytyped.japgolly"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-6d8afc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "inquirer" % "6.5-dt-20200226Z-29a9c4",
  "org.scalablytyped.japgolly" %%% "mem-fs" % "1.1-dt-20181203Z-be6368",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "rxjs" % "6.5.4-a27765",
  "org.scalablytyped.japgolly" %%% "rxjs-compat" % "6.5.4-968493",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "through" % "0.0-unknown-dt-20200225Z-90fce9",
  "org.scalablytyped.japgolly" %%% "vinyl" % "2.0-dt-20200225Z-f5c4f1",
  "org.scalablytyped.japgolly" %%% "yeoman-generator" % "3.1-dt-20190731Z-1eeb48")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
