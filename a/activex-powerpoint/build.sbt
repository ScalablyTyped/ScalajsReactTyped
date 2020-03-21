organization := "org.scalablytyped.japgolly"
name := "activex-powerpoint"
version := "14.0-dt-20200225Z-06afe5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "activex-office" % "16.0-dt-20200225Z-8289c0",
  "org.scalablytyped.japgolly" %%% "activex-outlook" % "14.0-dt-20200225Z-46571c",
  "org.scalablytyped.japgolly" %%% "activex-stdole" % "2.0-dt-20200225Z-4aef11",
  "org.scalablytyped.japgolly" %%% "activex-vbide" % "14.0-dt-20200225Z-c6095d",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
