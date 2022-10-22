organization := "org.scalablytyped.japgolly"
name := "octokit__core"
version := "4.1.0-772344"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "before-after-hook" % "3.0.2-1743ac",
  "org.scalablytyped.japgolly" %%% "octokit__graphql" % "5.0.3-1e3f65",
  "org.scalablytyped.japgolly" %%% "octokit__openapi-types" % "14.0.0-106969",
  "org.scalablytyped.japgolly" %%% "octokit__request-error" % "3.0.2-b62292",
  "org.scalablytyped.japgolly" %%% "octokit__types" % "8.0.0-2349ec",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
