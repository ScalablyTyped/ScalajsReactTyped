package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateCallbacks[T] extends js.Object {
  def onComplete(): Unit
  def onMatch(item: T): Unit | EnumerateAction
}

object EnumerateCallbacks {
  @scala.inline
  def apply[T](onComplete: Callback, onMatch: T => CallbackTo[Unit | EnumerateAction]): EnumerateCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onMatch")(js.Any.fromFunction1((t0: T) => onMatch(t0).runNow()))
    __obj.asInstanceOf[EnumerateCallbacks[T]]
  }
}

