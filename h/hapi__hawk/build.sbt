organization := "org.scalablytyped.japgolly"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-cf3081"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "caseless" % "0.12-dt-20220624Z-a651cf",
  "org.scalablytyped.japgolly" %%% "crypto-js" % "4.1-dt-20220818Z-2bca2d",
  "org.scalablytyped.japgolly" %%% "form-data" % "4.0.0-06ff2d",
  "org.scalablytyped.japgolly" %%% "hapi__boom" % "10.0.0-5c8657",
  "org.scalablytyped.japgolly" %%% "hapi__catbox" % "10.2-dt-20211202Z-0c1ff3",
  "org.scalablytyped.japgolly" %%% "hapi__hapi" % "20.0-dt-20220525Z-1c9204",
  "org.scalablytyped.japgolly" %%% "hapi__iron" % "7.0.0-613230",
  "org.scalablytyped.japgolly" %%% "hapi__mimos" % "7.0.0-ed34ce",
  "org.scalablytyped.japgolly" %%% "hapi__shot" % "6.0.0-f7515a",
  "org.scalablytyped.japgolly" %%% "hapi__sntp" % "3.1-dt-20211202Z-92f4e2",
  "org.scalablytyped.japgolly" %%% "joi" % "17.6.3-89f02e",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "request" % "2.48-dt-20220101Z-0f0c35",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "tough-cookie" % "4.0-dt-20220414Z-f938b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
