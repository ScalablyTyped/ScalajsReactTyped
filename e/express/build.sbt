organization := "org.gulliblytyped.japgolly"
name := "express"
version := "4.17-dt-20191101Z-989aa3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.gulliblytyped.japgolly" %%% "body-parser" % "1.17-dt-20190819Z-8441db",
  "org.gulliblytyped.japgolly" %%% "connect" % "v3.4.0-dt-20190322Z-a7fbcd",
  "org.gulliblytyped.japgolly" %%% "express-serve-static-core" % "4.16-dt-20191101Z-843e4c",
  "org.gulliblytyped.japgolly" %%% "mime" % "2.0-dt-20190205Z-59d0db",
  "org.gulliblytyped.japgolly" %%% "node" % "12.12-dt-20191108Z-7fec91",
  "org.gulliblytyped.japgolly" %%% "range-parser" % "1.2-dt-20181016Z-05fc21",
  "org.gulliblytyped.japgolly" %%% "serve-static" % "1.13-dt-20190819Z-154b0a",
  "org.gulliblytyped.japgolly" %%% "std" % "3.7-c9d0d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalajsReactTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
        