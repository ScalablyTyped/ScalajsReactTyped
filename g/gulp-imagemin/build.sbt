organization := "org.scalablytyped.japgolly"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-a524c1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped.japgolly" %%% "imagemin" % "8.0-dt-20211202Z-dec58c",
  "org.scalablytyped.japgolly" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-ca7bba",
  "org.scalablytyped.japgolly" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-3909c3",
  "org.scalablytyped.japgolly" %%% "imagemin-optipng" % "5.2-dt-20211202Z-26d4f8",
  "org.scalablytyped.japgolly" %%% "imagemin-svgo" % "10.0-dt-20220222Z-74dda5",
  "org.scalablytyped.japgolly" %%% "node" % "18.11-dt-20221015Z-288d1b",
  "org.scalablytyped.japgolly" %%% "std" % "4.8-608dc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
