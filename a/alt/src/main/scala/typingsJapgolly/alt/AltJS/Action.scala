package typingsJapgolly.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[T] extends js.Object {
  def apply(args: T): Unit = js.native
  def defer(data: js.Any): Unit = js.native
}

