package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvents extends js.Object {
  // tslint:disable-next-line ban-types
  def Register(eventToListen: Event, eventSink: js.Function): Double
  def Unregister(sinkHandle: Double): Unit
}

object IEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => CallbackTo[Double], Unregister: Double => Callback): IEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IEvents]
  }
}

