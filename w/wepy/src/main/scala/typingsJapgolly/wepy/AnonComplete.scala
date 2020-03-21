package typingsJapgolly.wepy

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete[T] extends js.Object {
  def complete(): Unit
  def fail(): Unit
  def success(res: T): Unit
}

object AnonComplete {
  @scala.inline
  def apply[T](complete: Callback, fail: Callback, success: T => Callback): AnonComplete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("fail")(fail.toJsFn)
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: T) => success(t0).runNow()))
    __obj.asInstanceOf[AnonComplete[T]]
  }
}

