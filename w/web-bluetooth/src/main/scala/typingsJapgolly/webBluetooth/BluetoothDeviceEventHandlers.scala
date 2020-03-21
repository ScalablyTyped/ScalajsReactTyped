package typingsJapgolly.webBluetooth

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceEventHandlers extends js.Object {
  def onadvertisementreceived(ev: Event_): js.Any
  def ongattserverdisconnected(ev: Event_): js.Any
}

object BluetoothDeviceEventHandlers {
  @scala.inline
  def apply(
    onadvertisementreceived: Event_ => CallbackTo[js.Any],
    ongattserverdisconnected: Event_ => CallbackTo[js.Any]
  ): BluetoothDeviceEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onadvertisementreceived")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onadvertisementreceived(t0).runNow()))
    __obj.updateDynamic("ongattserverdisconnected")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => ongattserverdisconnected(t0).runNow()))
    __obj.asInstanceOf[BluetoothDeviceEventHandlers]
  }
}

