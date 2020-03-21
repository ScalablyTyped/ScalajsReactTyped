package typingsJapgolly.rsocketFlowable.singleMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFutureSubscriber[T] extends js.Object {
  def onComplete(value: T): Unit
  def onError(error: js.Error): Unit
  def onSubscribe(cancel: CancelCallback): Unit
}

object IFutureSubscriber {
  @scala.inline
  def apply[T](onComplete: T => Callback, onError: js.Error => Callback, onSubscribe: CancelCallback => Callback): IFutureSubscriber[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: T) => onComplete(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketFlowable.singleMod.CancelCallback) => onSubscribe(t0).runNow()))
    __obj.asInstanceOf[IFutureSubscriber[T]]
  }
}

