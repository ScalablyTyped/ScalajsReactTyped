organization := "org.scalablytyped.japgolly"
name := "intl-messageformat"
version := "7.8.4-6ff6db"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-unified-numberformat" % "3.2.0-a76012",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-utils" % "2.2.0-fa6139",
  "org.scalablytyped.japgolly" %%% "intl-messageformat-parser" % "3.6.4-6aae72",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
