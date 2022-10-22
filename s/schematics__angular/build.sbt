organization := "org.scalablytyped.japgolly"
name := "schematics__angular"
version := "14.2.3-a922fc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "ajv" % "8.11.0-e04284",
  "org.scalablytyped.japgolly" %%% "angular-devkit__core" % "14.2.3-c5d746",
  "org.scalablytyped.japgolly" %%% "angular-devkit__schematics" % "14.2.3-0bd34c",
  "org.scalablytyped.japgolly" %%% "jsonc-parser" % "3.2.0-b0d53a",
  "org.scalablytyped.japgolly" %%% "magic-string" % "0.26.7-a42afe",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "re2" % "1.17.7-1eb746",
  "org.scalablytyped.japgolly" %%% "rxjs" % "7.5.7-c83f26",
  "org.scalablytyped.japgolly" %%% "source-map" % "0.7.4-4daf59",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "uri-js" % "4.4.1-ea7df5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
