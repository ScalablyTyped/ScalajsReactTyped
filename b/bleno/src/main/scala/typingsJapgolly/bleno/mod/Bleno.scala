package typingsJapgolly.bleno.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.bleno.TypeofCharacteristic
import typingsJapgolly.bleno.blenoStrings.accept
import typingsJapgolly.bleno.blenoStrings.advertisingStart
import typingsJapgolly.bleno.blenoStrings.advertisingStartError
import typingsJapgolly.bleno.blenoStrings.advertisingStop
import typingsJapgolly.bleno.blenoStrings.disconnect
import typingsJapgolly.bleno.blenoStrings.mtuChange
import typingsJapgolly.bleno.blenoStrings.rssiUpdate
import typingsJapgolly.bleno.blenoStrings.servicesSet
import typingsJapgolly.bleno.blenoStrings.servicesSetError
import typingsJapgolly.bleno.blenoStrings.stateChange
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bleno extends EventEmitter {
  val Characteristic: TypeofCharacteristic = js.native
  val Descriptor: Instantiable1[/* options */ DescriptorOptions, typingsJapgolly.bleno.mod.Descriptor] = js.native
  val PrimaryService: Instantiable1[/* options */ PrimaryServiceOptions, typingsJapgolly.bleno.mod.PrimaryService] = js.native
  val address: String = js.native
  val mtu: Double = js.native
  val platform: String = js.native
  val rssi: Double = js.native
  val state: State = js.native
  def disconnect(): Unit = js.native
  @JSName("on")
  def on_accept(event: accept, cb: js.Function1[/* address */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_advertisingStart(event: advertisingStart, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
  @JSName("on")
  def on_advertisingStartError(event: advertisingStartError, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_advertisingStop(event: advertisingStop, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, cb: js.Function1[/* clientAddress */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_mtuChange(event: mtuChange, cb: js.Function1[/* mtu */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_rssiUpdate(event: rssiUpdate, cb: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_servicesSet(event: servicesSet, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
  @JSName("on")
  def on_servicesSetError(event: servicesSetError, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_stateChange(event: stateChange, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  def setServices(services: js.Array[typingsJapgolly.bleno.mod.PrimaryService]): Unit = js.native
  def setServices(
    services: js.Array[typingsJapgolly.bleno.mod.PrimaryService],
    callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def startAdvertising(name: String): Unit = js.native
  def startAdvertising(name: String, serviceUuids: js.Array[String]): Unit = js.native
  def startAdvertising(
    name: String,
    serviceUuids: js.Array[String],
    callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def startAdvertisingIBeacon(uuid: String, major: Double, minor: Double, measuredPower: Double): Unit = js.native
  def startAdvertisingIBeacon(
    uuid: String,
    major: Double,
    minor: Double,
    measuredPower: Double,
    callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def startAdvertisingWithEIRData(advertisementData: Buffer): Unit = js.native
  def startAdvertisingWithEIRData(advertisementData: Buffer, callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def startAdvertisingWithEIRData(advertisementData: Buffer, scanData: Buffer): Unit = js.native
  def startAdvertisingWithEIRData(
    advertisementData: Buffer,
    scanData: Buffer,
    callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def stopAdvertising(): Unit = js.native
  def stopAdvertising(callback: js.Function0[Unit]): Unit = js.native
  def updateRssi(): Unit = js.native
  def updateRssi(callback: js.Function2[/* err */ Null, /* rssi */ Double, Unit]): Unit = js.native
}

