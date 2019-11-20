
package org.gulliblytyped.japgolly.sbt

import sbt._
import sbt.Keys._

object ScalajsReactTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  override def globalSettings = List(
    resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
  )

  object autoImport {
    object ScalajsReactTyped {
      object D {
        val `d3-ease` = "org.gulliblytyped.japgolly" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-a9b75d"
        val `d3-path` = "org.gulliblytyped.japgolly" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-3aa22c"
        val `d3-random` = "org.gulliblytyped.japgolly" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-c5b5c4"
        val `d3-timer` = "org.gulliblytyped.japgolly" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-d84639"
      }
      object E {
        val exenv = "org.gulliblytyped.japgolly" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-c98675"
      }
      object S {
        val shallowequal = "org.gulliblytyped.japgolly" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-5b0184"
        val `symbol-observable` = "org.gulliblytyped.japgolly" % "symbol-observable_sjs0.6_2.12" % "1.2.0-212c6e"
      }
    }
  }
}