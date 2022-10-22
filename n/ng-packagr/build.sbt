organization := "org.scalablytyped.japgolly"
name := "ng-packagr"
version := "14.2.1-353581"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "angular__compiler" % "14.2.6-9e8e56",
  "org.scalablytyped.japgolly" %%% "angular__compiler-cli" % "14.2.2-422122",
  "org.scalablytyped.japgolly" %%% "ansi-colors" % "4.1.3-88caf4",
  "org.scalablytyped.japgolly" %%% "anymatch" % "3.1.2-1a8878",
  "org.scalablytyped.japgolly" %%% "babel__core" % "7.1-dt-20220624Z-70ea58",
  "org.scalablytyped.japgolly" %%% "babel__generator" % "7.6-dt-20211223Z-d287e9",
  "org.scalablytyped.japgolly" %%% "babel__parser" % "7.19.4-03fc7e",
  "org.scalablytyped.japgolly" %%% "babel__template" % "7.4-dt-20211202Z-a6f3ab",
  "org.scalablytyped.japgolly" %%% "babel__traverse" % "7.18-dt-20220923Z-12cca0",
  "org.scalablytyped.japgolly" %%% "babel__types" % "7.19.4-3aab9c",
  "org.scalablytyped.japgolly" %%% "chokidar" % "3.5.3-996cd7",
  "org.scalablytyped.japgolly" %%% "convert-source-map" % "1.5-dt-20211202Z-11da11",
  "org.scalablytyped.japgolly" %%% "dependency-graph" % "0.11.0-c491e6",
  "org.scalablytyped.japgolly" %%% "esbuild" % "0.15.8-e36f4d",
  "org.scalablytyped.japgolly" %%% "glob" % "8.0-dt-20220830Z-dae710",
  "org.scalablytyped.japgolly" %%% "injection-js" % "2.4.0-fb5d15",
  "org.scalablytyped.japgolly" %%% "magic-string" % "0.26.7-a42afe",
  "org.scalablytyped.japgolly" %%% "minimatch" % "5.1-dt-20220831Z-eb11ff",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rollup" % "3.2.2-3943b7",
  "org.scalablytyped.japgolly" %%% "rxjs" % "7.5.7-c83f26",
  "org.scalablytyped.japgolly" %%% "semver" % "7.3-dt-20220811Z-25b2d2",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "typescript" % "4.8.4-7a2e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
