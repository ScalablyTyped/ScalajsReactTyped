package typingsJapgolly.tableResolver

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod[T] extends js.Object {
  var columns: js.Array[T]
  def method(args: AnonColumn[T]): T
}

object AnonMethod {
  @scala.inline
  def apply[T](columns: js.Array[T], method: AnonColumn[T] => CallbackTo[T]): AnonMethod[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("method")(js.Any.fromFunction1((t0: typingsJapgolly.tableResolver.AnonColumn[T]) => method(t0).runNow()))
    __obj.asInstanceOf[AnonMethod[T]]
  }
}

