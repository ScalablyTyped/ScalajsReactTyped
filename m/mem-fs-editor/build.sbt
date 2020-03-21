organization := "org.scalablytyped.japgolly"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-ff3fb9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ejs" % "3.0-dt-20200219Z-fab7da",
  "org.scalablytyped.japgolly" %%% "glob" % "7.1-dt-20200226Z-d017c7",
  "org.scalablytyped.japgolly" %%% "mem-fs" % "1.1-dt-20181203Z-be6368",
  "org.scalablytyped.japgolly" %%% "minimatch" % "3.0-dt-20200226Z-7b8745",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "vinyl" % "2.0-dt-20200225Z-f5c4f1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
