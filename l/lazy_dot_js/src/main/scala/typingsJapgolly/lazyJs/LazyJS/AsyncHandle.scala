package typingsJapgolly.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHandle[T] extends js.Object {
  def cancel(): Unit
  def onComplete(callback: Callback): Unit
  def onError(callback: ErrorCallback): Unit
}

object AsyncHandle {
  @scala.inline
  def apply[T](
    cancel: japgolly.scalajs.react.Callback,
    onComplete: Callback => japgolly.scalajs.react.Callback,
    onError: ErrorCallback => japgolly.scalajs.react.Callback
  ): AsyncHandle[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: typingsJapgolly.lazyJs.LazyJS.Callback) => onComplete(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.lazyJs.LazyJS.ErrorCallback) => onError(t0).runNow()))
    __obj.asInstanceOf[AsyncHandle[T]]
  }
}

