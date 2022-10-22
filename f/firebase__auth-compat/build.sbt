organization := "org.scalablytyped.japgolly"
name := "firebase__auth-compat"
version := "0.2.23-9c46aa"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "firebase__app" % "0.8.2-bfba1f",
  "org.scalablytyped.japgolly" %%% "firebase__app-compat" % "0.1.37-31632b",
  "org.scalablytyped.japgolly" %%% "firebase__app-types" % "0.8.0-d25a07",
  "org.scalablytyped.japgolly" %%% "firebase__auth" % "0.20.10-2319c8",
  "org.scalablytyped.japgolly" %%% "firebase__auth-interop-types" % "0.1.6-bdd746",
  "org.scalablytyped.japgolly" %%% "firebase__auth-types" % "0.11.0-5ced60",
  "org.scalablytyped.japgolly" %%% "firebase__component" % "0.5.20-97e94a",
  "org.scalablytyped.japgolly" %%% "firebase__logger" % "0.3.3-2bcaf2",
  "org.scalablytyped.japgolly" %%% "firebase__util" % "1.7.2-2aee96",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "selenium-webdriver" % "4.1-dt-20220909Z-ba92c6",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
