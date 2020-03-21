organization := "org.scalablytyped.japgolly"
name := "webtorrent"
version := "0.107-dt-20191210Z-7eebec"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "bittorrent-protocol" % "2.2-dt-20200225Z-5bf97f",
  "org.scalablytyped.japgolly" %%% "magnet-uri" % "5.1-dt-20190212Z-1bbe7d",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "parse-torrent" % "5.8-dt-20200226Z-145866",
  "org.scalablytyped.japgolly" %%% "parse-torrent-file" % "4.0-dt-20190212Z-996c02",
  "org.scalablytyped.japgolly" %%% "simple-peer" % "9.6-dt-20191114Z-7d444a",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
