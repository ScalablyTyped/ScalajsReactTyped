package typingsJapgolly.cordovaSqliteStorage

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var length: Double
  def item(i: Double): js.Any
}

object AnonItem {
  @scala.inline
  def apply(item: Double => CallbackTo[js.Any], length: Double): AnonItem = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.asInstanceOf[AnonItem]
  }
}

