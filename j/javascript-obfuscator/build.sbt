organization := "org.scalablytyped.japgolly"
name := "javascript-obfuscator"
version := "0.18.8-8edbdc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.5.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped.japgolly" %%% "chance" % "1.0-dt-20200226Z-99ea41",
  "org.scalablytyped.japgolly" %%% "estraverse" % "0.0-unknown-dt-20200225Z-e350c2",
  "org.scalablytyped.japgolly" %%% "estree" % "0.0-unknown-dt-20200225Z-8345da",
  "org.scalablytyped.japgolly" %%% "inversify" % "5.0.1-4052f8",
  "org.scalablytyped.japgolly" %%% "node" % "13.7-dt-20200228Z-e4cd2e",
  "org.scalablytyped.japgolly" %%% "std" % "3.8-8884a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
