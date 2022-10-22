organization := "org.scalablytyped.japgolly"
name := "cheerio"
version := "1.0.0-rc.12-6dc683"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "dom-serializer" % "2.0.0-f49a6f",
  "org.scalablytyped.japgolly" %%% "domelementtype" % "2.3.0-05d680",
  "org.scalablytyped.japgolly" %%% "domhandler" % "5.0.3-0e13e3",
  "org.scalablytyped.japgolly" %%% "domutils" % "3.0.1-0bb572",
  "org.scalablytyped.japgolly" %%% "htmlparser2" % "8.0.1-7b149b",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
