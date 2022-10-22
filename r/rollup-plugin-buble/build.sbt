organization := "org.scalablytyped.japgolly"
name := "rollup-plugin-buble"
version := "0.19-dt-20211202Z-4631a2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "buble" % "0.20-dt-20211202Z-787f6d",
  "org.scalablytyped.japgolly" %%% "magic-string" % "0.26.7-a42afe",
  "org.scalablytyped.japgolly" %%% "rollup" % "3.2.2-3943b7",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
