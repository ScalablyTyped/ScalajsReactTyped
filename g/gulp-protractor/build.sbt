organization := "org.scalablytyped.japgolly"
name := "gulp-protractor"
version := "v1.0.0-dt-20200226Z-d8f6de"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "chokidar" % "3.3.1-5b0ac8",
  "org.scalablytyped.japgolly" %%% "glob" % "7.1-dt-20200226Z-d017c7",
  "org.scalablytyped.japgolly" %%% "glob-stream" % "v6.1.0-dt-20200226Z-e2dcd5",
  "org.scalablytyped.japgolly" %%% "gulp" % "4.0-dt-20200225Z-05ce3f",
  "org.scalablytyped.japgolly" %%% "minimatch" % "3.0-dt-20200226Z-7b8745",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5",
  "org.scalablytyped.japgolly" %%% "undertaker" % "1.2-dt-20200225Z-5dfe5d",
  "org.scalablytyped.japgolly" %%% "undertaker-registry" % "1.0-dt-20200225Z-a5ebe9",
  "org.scalablytyped.japgolly" %%% "vinyl" % "2.0-dt-20200225Z-f5c4f1",
  "org.scalablytyped.japgolly" %%% "vinyl-fs" % "2.4-dt-20200227Z-dbf64a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
