organization := "org.scalablytyped.japgolly"
name := "ionic"
version := "5.4.16-25198f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "cookiejar" % "2.1-dt-20211202Z-fb8afa",
  "org.scalablytyped.japgolly" %%% "debug" % "4.1-dt-20211202Z-7cd5bd",
  "org.scalablytyped.japgolly" %%% "elementtree" % "0.1-dt-20211202Z-a50cd6",
  "org.scalablytyped.japgolly" %%% "inquirer" % "9.0-dt-20220928Z-55772e",
  "org.scalablytyped.japgolly" %%% "ionic__cli-framework" % "5.1.3-df498d",
  "org.scalablytyped.japgolly" %%% "ionic__cli-framework-output" % "2.2.5-c60503",
  "org.scalablytyped.japgolly" %%% "ionic__cli-framework-prompts" % "2.1.10-e6f4ab",
  "org.scalablytyped.japgolly" %%% "ionic__discover" % "3.1.5-5dc356",
  "org.scalablytyped.japgolly" %%% "ionic__utils-network" % "2.1.5-074479",
  "org.scalablytyped.japgolly" %%% "ionic__utils-object" % "2.1.5-a4933b",
  "org.scalablytyped.japgolly" %%% "ionic__utils-subprocess" % "2.1.11-f1ac76",
  "org.scalablytyped.japgolly" %%% "ionic__utils-terminal" % "2.3.3-c08904",
  "org.scalablytyped.japgolly" %%% "minimist" % "1.2-dt-20211202Z-6b7ca4",
  "org.scalablytyped.japgolly" %%% "ms" % "v0.7.1-dt-20220818Z-ed60be",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "rxjs" % "7.5.7-c83f26",
  "org.scalablytyped.japgolly" %%% "ssh-config" % "4.1.6-52017c",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7",
  "org.scalablytyped.japgolly" %%% "string-width" % "5.1.2-b3e063",
  "org.scalablytyped.japgolly" %%% "superagent" % "4.1-dt-20220125Z-805e24",
  "org.scalablytyped.japgolly" %%% "tar" % "6.1-dt-20220926Z-35632d",
  "org.scalablytyped.japgolly" %%% "through" % "0.0-unknown-dt-20220818Z-00ddf3",
  "org.scalablytyped.japgolly" %%% "ws" % "8.5-dt-20220624Z-5c45c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
