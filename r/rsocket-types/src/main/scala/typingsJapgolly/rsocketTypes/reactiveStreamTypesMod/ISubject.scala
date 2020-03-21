package typingsJapgolly.rsocketTypes.reactiveStreamTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubject[T] extends js.Object {
  def onComplete(): Unit
  def onError(error: js.Error): Unit
  def onNext(value: T): Unit
}

object ISubject {
  @scala.inline
  def apply[T](onComplete: Callback, onError: js.Error => Callback, onNext: T => Callback): ISubject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: T) => onNext(t0).runNow()))
    __obj.asInstanceOf[ISubject[T]]
  }
}

