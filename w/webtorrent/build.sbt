organization := "org.scalablytyped.japgolly"
name := "webtorrent"
version := "0.109-dt-20220103Z-41084f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "bittorrent-protocol" % "3.1-dt-20220101Z-204e83",
  "org.scalablytyped.japgolly" %%% "magnet-uri" % "5.1-dt-20211202Z-1fd410",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "parse-torrent" % "5.8-dt-20211202Z-e10d4b",
  "org.scalablytyped.japgolly" %%% "parse-torrent-file" % "4.0-dt-20211202Z-3fa684",
  "org.scalablytyped.japgolly" %%% "simple-peer" % "9.11-dt-20220810Z-0b0955",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
