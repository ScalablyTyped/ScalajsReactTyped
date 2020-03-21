package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandsEvents extends IEvents {
  var OnCustomCommand: js.UndefOr[js.Function1[/* commandID */ Double, Unit]] = js.undefined
}

object ICommandsEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnCustomCommand: /* commandID */ Double => Callback = null
  ): ICommandsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    if (OnCustomCommand != null) __obj.updateDynamic("OnCustomCommand")(js.Any.fromFunction1((t0: /* commandID */ scala.Double) => OnCustomCommand(t0).runNow()))
    __obj.asInstanceOf[ICommandsEvents]
  }
}

