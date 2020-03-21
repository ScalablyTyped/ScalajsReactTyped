package typingsJapgolly.activexInterop

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem[T] extends js.Object {
  def Item(index: js.Any): T
}

object AnonItem {
  @scala.inline
  def apply[T](Item: js.Any => CallbackTo[T]): AnonItem[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: js.Any) => Item(t0).runNow()))
    __obj.asInstanceOf[AnonItem[T]]
  }
}

