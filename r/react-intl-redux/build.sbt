organization := "org.scalablytyped.japgolly"
name := "react-intl-redux"
version := "v0.1.0-dt-20200225Z-edd7cb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "csstype" % "2.6.6-ec7cc3",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-listformat" % "1.4.1-e4bfe5",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-relativetimeformat" % "4.5.9-cd4cd7",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-unified-numberformat" % "3.2.0-a76012",
  "org.scalablytyped.japgolly" %%% "formatjs__intl-utils" % "2.2.0-fa6139",
  "org.scalablytyped.japgolly" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-069f66",
  "org.scalablytyped.japgolly" %%% "intl-messageformat" % "7.8.4-6ff6db",
  "org.scalablytyped.japgolly" %%% "intl-messageformat-parser" % "3.6.4-6aae72",
  "org.scalablytyped.japgolly" %%% "prop-types" % "15.7-dt-20190924Z-d18e40",
  "org.scalablytyped.japgolly" %%% "react" % "16.9-dt-20200227Z-a90427",
  "org.scalablytyped.japgolly" %%% "react-intl" % "3.12.0-eb4772",
  "org.scalablytyped.japgolly" %%% "react-redux" % "7.1-dt-20200225Z-36e80a",
  "org.scalablytyped.japgolly" %%% "redux" % "4.0.5-1a2be6",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
