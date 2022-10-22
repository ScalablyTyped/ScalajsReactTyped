organization := "org.scalablytyped.japgolly"
name := "pkijs"
version := "3.0.8-4d1501"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "asn1js" % "3.0.5-2000ef",
  "org.scalablytyped.japgolly" %%% "bytestreamjs" % "2.0.1-8e05a5",
  "org.scalablytyped.japgolly" %%% "pvtsutils" % "1.3.2-56115d",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
