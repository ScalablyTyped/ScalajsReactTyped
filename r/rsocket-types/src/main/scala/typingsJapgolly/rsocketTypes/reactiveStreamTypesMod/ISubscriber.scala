package typingsJapgolly.rsocketTypes.reactiveStreamTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriber[T] extends js.Object {
  def onComplete(): Unit
  def onError(error: js.Error): Unit
  def onNext(value: T): Unit
  def onSubscribe(subscription: ISubscription): Unit
}

object ISubscriber {
  @scala.inline
  def apply[T](
    onComplete: Callback,
    onError: js.Error => Callback,
    onNext: T => Callback,
    onSubscribe: ISubscription => Callback
  ): ISubscriber[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: T) => onNext(t0).runNow()))
    __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscription) => onSubscribe(t0).runNow()))
    __obj.asInstanceOf[ISubscriber[T]]
  }
}

