package typingsJapgolly.aureliaPal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-pal", "AggregateError")
@js.native
object AggregateError extends js.Object {
  def apply(message: String): js.Error = js.native
  def apply(message: String, innerError: js.Error): js.Error = js.native
  def apply(message: String, innerError: js.Error, skipIfAlreadyAggregate: Boolean): js.Error = js.native
}

