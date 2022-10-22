organization := "org.scalablytyped.japgolly"
name := "ng-facebook"
version := "0.0-unknown-dt-20220818Z-6a3a04"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "angular" % "1.8-dt-20220525Z-7a68e1",
  "org.scalablytyped.japgolly" %%% "facebook-js-sdk" % "3.3-dt-20221005Z-fa1c91",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
