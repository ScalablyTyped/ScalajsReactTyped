organization := "org.scalablytyped.japgolly"
name := "hexo-fs"
version := "0.2-dt-20190524Z-5d4fc5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20200302Z-b175b6",
  "org.scalablytyped.japgolly" %%% "chokidar" % "3.3.1-5b0ac8",
  "org.scalablytyped.japgolly" %%% "graceful-fs" % "4.1-dt-20190212Z-94db1e",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
