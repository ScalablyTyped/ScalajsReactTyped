package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowEvents extends IEvents {
  var OnCloseWindow: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IWindowEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnCloseWindow: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): IWindowEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    OnCloseWindow.foreach(p => __obj.updateDynamic("OnCloseWindow")(p.toJsFn))
    __obj.asInstanceOf[IWindowEvents]
  }
}

