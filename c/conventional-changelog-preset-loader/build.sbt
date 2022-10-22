organization := "org.scalablytyped.japgolly"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20220624Z-386e0c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-f314ad",
  "org.scalablytyped.japgolly" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-1e90c7",
  "org.scalablytyped.japgolly" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-ecc74d",
  "org.scalablytyped.japgolly" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-e5e2ac",
  "org.scalablytyped.japgolly" %%% "git-raw-commits" % "2.0-dt-20220624Z-92e5b4",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "normalize-package-data" % "2.4-dt-20211202Z-3e2bf6",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
