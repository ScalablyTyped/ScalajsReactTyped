organization := "org.scalablytyped.japgolly"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20200225Z-86a213"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20200225Z-f0cc0f",
  "org.scalablytyped.japgolly" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20200225Z-79d63c",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
