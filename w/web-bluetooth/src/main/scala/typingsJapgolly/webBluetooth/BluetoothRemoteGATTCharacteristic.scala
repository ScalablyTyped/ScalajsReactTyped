package typingsJapgolly.webBluetooth

import typingsJapgolly.std.BufferSource
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Event_
import typingsJapgolly.webBluetooth.webBluetoothStrings.characteristicvaluechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTCharacteristic
  extends EventTarget
     with CharacteristicEventHandlers {
  val properties: BluetoothCharacteristicProperties = js.native
  val service: js.UndefOr[BluetoothRemoteGATTService] = js.native
  val uuid: String = js.native
  val value: js.UndefOr[scala.scalajs.js.typedarray.DataView] = js.native
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  def getDescriptor(descriptor: BluetoothDescriptorUUID): js.Promise[BluetoothRemoteGATTDescriptor] = js.native
  def getDescriptors(): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def getDescriptors(descriptor: BluetoothDescriptorUUID): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def readValue(): js.Promise[scala.scalajs.js.typedarray.DataView] = js.native
  def startNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def stopNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def writeValue(value: BufferSource): js.Promise[Unit] = js.native
}

