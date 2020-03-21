package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var length: Double
  def Item(n: Double): java.lang.String
}

object AnonItem {
  @scala.inline
  def apply(Item: Double => CallbackTo[java.lang.String], length: Double): AnonItem = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[AnonItem]
  }
}

