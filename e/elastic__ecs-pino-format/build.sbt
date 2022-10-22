organization := "org.scalablytyped.japgolly"
name := "elastic__ecs-pino-format"
version := "1.3.0-278a4a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "pino" % "8.6.1-61c2d1",
  "org.scalablytyped.japgolly" %%% "pino-pretty" % "4.7-dt-20220624Z-ef32bb",
  "org.scalablytyped.japgolly" %%% "pino-std-serializers" % "6.0.0-dc906e",
  "org.scalablytyped.japgolly" %%% "sonic-boom" % "3.2.0-670545",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
