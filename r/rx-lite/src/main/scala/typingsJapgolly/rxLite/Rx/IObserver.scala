package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
trait IObserver[T] extends js.Object {
  def onCompleted(): Unit
  def onError(exception: js.Any): Unit
  def onNext(value: T): Unit
}

object IObserver {
  @scala.inline
  def apply[T](onCompleted: Callback, onError: js.Any => Callback, onNext: T => Callback): IObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCompleted")(onCompleted.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Any) => onError(t0).runNow()))
    __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: T) => onNext(t0).runNow()))
    __obj.asInstanceOf[IObserver[T]]
  }
}

