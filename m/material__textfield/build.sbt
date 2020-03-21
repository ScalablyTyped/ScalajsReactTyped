organization := "org.scalablytyped.japgolly"
name := "material__textfield"
version := "0.35-dt-20191126Z-4a1378"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "material__base" % "0.35-dt-20191126Z-8f84c1",
  "org.scalablytyped.japgolly" %%% "material__floating-label" % "0.35-dt-20191126Z-c9fd30",
  "org.scalablytyped.japgolly" %%% "material__line-ripple" % "0.35-dt-20191126Z-2129f0",
  "org.scalablytyped.japgolly" %%% "material__notched-outline" % "0.35-dt-20191126Z-d44ac4",
  "org.scalablytyped.japgolly" %%% "material__ripple" % "0.35-dt-20191126Z-69d8fb",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
