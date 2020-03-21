organization := "org.scalablytyped.japgolly"
name := "promise-sftp"
version := "1.3-dt-20190819Z-1ededb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bluebird" % "3.5-dt-20200302Z-b175b6",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "promise-ftp-common" % "1.1-dt-20180709Z-708c5d",
  "org.scalablytyped.japgolly" %%% "ssh2" % "v0.5.x-dt-20200227Z-6cfff1",
  "org.scalablytyped.japgolly" %%% "ssh2-streams" % "v0.1.9-dt-20200227Z-a60879",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
