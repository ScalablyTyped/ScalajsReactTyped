organization := "org.scalablytyped.japgolly"
name := "firebase__app-check-compat"
version := "0.2.15-fcf5f7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "firebase__app" % "0.8.2-bfba1f",
  "org.scalablytyped.japgolly" %%% "firebase__app-check" % "0.5.15-d8500a",
  "org.scalablytyped.japgolly" %%% "firebase__app-check-types" % "0.4.0-07b78c",
  "org.scalablytyped.japgolly" %%% "firebase__app-compat" % "0.1.37-31632b",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.8.0-d25a07",
  "org.scalablytyped.japgolly" %%% "firebase__component" % "0.5.20-97e94a",
  "org.scalablytyped.japgolly" %%% "firebase__logger" % "0.3.3-2bcaf2",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "1.7.2-2aee96",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
