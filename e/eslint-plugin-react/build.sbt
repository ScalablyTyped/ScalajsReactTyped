organization := "org.scalablytyped.japgolly"
name := "eslint-plugin-react"
version := "7.18.3-3e2dc6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "eslint" % "6.1-dt-20200204Z-a81c2f",
  "org.scalablytyped.japgolly" %%% "estree" % "0.0-unknown-dt-20200225Z-8345da",
  "org.scalablytyped.japgolly" %%% "json-schema" % "7.0-dt-20200225Z-13aa46",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
