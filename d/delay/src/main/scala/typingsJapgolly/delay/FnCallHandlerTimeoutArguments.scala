package typingsJapgolly.delay

import typingsJapgolly.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallHandlerTimeoutArguments extends js.Object {
  def apply(handler: TimerHandler): Double = js.native
  def apply(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}

