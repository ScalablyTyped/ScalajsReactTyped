package typingsJapgolly.meteor.Tracker

import typingsJapgolly.meteor.AnonOnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker.autorun")
@js.native
object autorun extends js.Object {
  def apply(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def apply(runFunc: js.Function1[/* computation */ Computation, Unit], options: AnonOnError): Computation = js.native
}

