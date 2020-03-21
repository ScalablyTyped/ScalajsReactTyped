package typingsJapgolly.webBluetooth

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothRemoteGATTDescriptor extends js.Object {
  val characteristic: BluetoothRemoteGATTCharacteristic
  val uuid: String
  val value: js.UndefOr[scala.scalajs.js.typedarray.DataView] = js.undefined
  def readValue(): js.Promise[scala.scalajs.js.typedarray.DataView]
  def writeValue(value: BufferSource): js.Promise[Unit]
}

object BluetoothRemoteGATTDescriptor {
  @scala.inline
  def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: CallbackTo[js.Promise[scala.scalajs.js.typedarray.DataView]],
    uuid: String,
    writeValue: BufferSource => CallbackTo[js.Promise[Unit]],
    value: scala.scalajs.js.typedarray.DataView = null
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("readValue")(readValue.toJsFn)
    __obj.updateDynamic("writeValue")(js.Any.fromFunction1((t0: typingsJapgolly.std.BufferSource) => writeValue(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
}

