package typingsJapgolly.wonderFrp.observerIobserverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wonderFrp.disposableIdisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserver extends IDisposable {
  def completed(): js.Any
  def error(error: js.Any): js.Any
  def next(value: js.Any): js.Any
}

object IObserver {
  @scala.inline
  def apply(
    completed: CallbackTo[js.Any],
    dispose: Callback,
    error: js.Any => CallbackTo[js.Any],
    next: js.Any => CallbackTo[js.Any]
  ): IObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completed")(completed.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: js.Any) => next(t0).runNow()))
    __obj.asInstanceOf[IObserver]
  }
}

