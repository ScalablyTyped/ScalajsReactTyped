organization := "org.scalablytyped.japgolly"
name := "data-urls"
version := "3.0-dt-20220913Z-f7c765"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "webidl-conversions" % "7.0-dt-20220829Z-cba18b",
  "org.scalablytyped.japgolly" %%% "whatwg-mimetype" % "3.0-dt-20220913Z-03f789",
  "org.scalablytyped.japgolly" %%% "whatwg-url" % "11.0-dt-20220829Z-e6e610")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
