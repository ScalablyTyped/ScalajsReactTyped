organization := "org.scalablytyped.japgolly"
name := "activex-infopath"
version := "3.0-dt-20220705Z-7762d7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "activex-adodb" % "6.1-dt-20220705Z-a827c7",
  "org.scalablytyped.japgolly" %%% "activex-mshtml" % "4.0-dt-20220705Z-88c470",
  "org.scalablytyped.japgolly" %%% "activex-msxml2" % "6.0-dt-20220705Z-51154a",
  "org.scalablytyped.japgolly" %%% "activex-stdole" % "2.0-dt-20220705Z-74843a",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
