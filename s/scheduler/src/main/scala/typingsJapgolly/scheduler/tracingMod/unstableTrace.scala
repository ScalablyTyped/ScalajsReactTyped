package typingsJapgolly.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scheduler/tracing", "unstable_trace")
@js.native
object unstableTrace extends js.Object {
  def apply[T](name: String, timestamp: Double, callback: js.Function0[T]): T = js.native
  def apply[T](name: String, timestamp: Double, callback: js.Function0[T], threadID: Double): T = js.native
}

