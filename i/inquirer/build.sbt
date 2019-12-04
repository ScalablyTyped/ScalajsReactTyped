organization := "org.gulliblytyped.japgolly"
name := "inquirer"
version := "6.5-dt-20190731Z-eb2a45"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191126Z-fec8d2",
  "org.gulliblytyped.japgolly" %%% "rxjs" % "6.5.3-1605a1",
  "org.gulliblytyped.japgolly" %%% "rxjs-compat" % "6.5.3-d48513",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-ed3398",
  "org.gulliblytyped.japgolly" %%% "through" % "0.0-unknown-dt-20190322Z-aa144b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        