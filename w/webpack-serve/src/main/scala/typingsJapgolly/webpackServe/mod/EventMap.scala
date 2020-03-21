package typingsJapgolly.webpackServe.mod

import typingsJapgolly.webpackServe.AnonCompiler
import typingsJapgolly.webpackServe.AnonCompilerStats
import typingsJapgolly.webpackServe.AnonOptions
import typingsJapgolly.webpackServe.AnonStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var `build-finished`: AnonStats
  var `build-started`: AnonCompiler
  var `compiler-error`: AnonCompilerStats
  var `compiler-warning`: AnonCompilerStats
  var listening: AnonOptions
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: AnonStats,
    `build-started`: AnonCompiler,
    `compiler-error`: AnonCompilerStats,
    `compiler-warning`: AnonCompilerStats,
    listening: AnonOptions
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
    __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

