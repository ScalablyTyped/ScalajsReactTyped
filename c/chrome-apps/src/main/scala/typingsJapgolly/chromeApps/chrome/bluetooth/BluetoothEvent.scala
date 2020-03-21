package typingsJapgolly.chromeApps.chrome.bluetooth

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothEvent[T] extends js.Object {
  def addListener(callback: js.Function1[/* event */ T, Unit]): Unit
}

object BluetoothEvent {
  @scala.inline
  def apply[T](addListener: js.Function1[/* event */ T, Unit] => Callback): BluetoothEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: js.Function1[/* event */ T, scala.Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[BluetoothEvent[T]]
  }
}

