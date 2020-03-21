package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.serial.ConnectionInfo
import typingsJapgolly.chrome.chrome.serial.ConnectionOptions
import typingsJapgolly.chrome.chrome.serial.DeviceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofserial extends js.Object {
  val DataBits: AnonEIGHT
  val ParityBit: AnonEVEN
  val StopBits: AnonONE
  val onReceive: TypeofonReceive
  val onReceiveError: TypeofonReceiveError
  def clearBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  def connect(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit
  def disconnect(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  def flush(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit
  def getControlSignals(connectionId: Double, callback: js.Function1[/* signals */ js.Object, Unit]): Unit
  def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]): Unit
  def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit
  def send(
    connectionId: Double,
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, Unit]
  ): Unit
  def setBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  def setControlSignals(connectionId: Double, signals: js.Object, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  def setPaused(connectionId: Double, paused: Boolean, callback: js.Function0[Unit]): Unit
  def update(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit
}

object Typeofserial {
  @scala.inline
  def apply(
    DataBits: AnonEIGHT,
    ParityBit: AnonEVEN,
    StopBits: AnonONE,
    clearBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback,
    connect: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Callback,
    disconnect: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback,
    flush: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback,
    getConnections: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Callback,
    getControlSignals: (Double, js.Function1[/* signals */ js.Object, Unit]) => Callback,
    getDevices: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Callback,
    getInfo: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Callback,
    onReceive: TypeofonReceive,
    onReceiveError: TypeofonReceiveError,
    send: (Double, scala.scalajs.js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Callback,
    setBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback,
    setControlSignals: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Callback,
    setPaused: (Double, Boolean, js.Function0[Unit]) => Callback,
    update: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Callback
  ): Typeofserial = {
    val __obj = js.Dynamic.literal(DataBits = DataBits.asInstanceOf[js.Any], ParityBit = ParityBit.asInstanceOf[js.Any], StopBits = StopBits.asInstanceOf[js.Any], onReceive = onReceive.asInstanceOf[js.Any], onReceiveError = onReceiveError.asInstanceOf[js.Any])
    __obj.updateDynamic("clearBreak")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* result */ scala.Boolean, scala.Unit]) => clearBreak(t0, t1).runNow()))
    __obj.updateDynamic("connect")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.chrome.chrome.serial.ConnectionOptions, t2: js.Function1[
  /* connectionInfo */ typingsJapgolly.chrome.chrome.serial.ConnectionInfo, 
  scala.Unit]) => connect(t0, t1, t2).runNow()))
    __obj.updateDynamic("disconnect")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* result */ scala.Boolean, scala.Unit]) => disconnect(t0, t1).runNow()))
    __obj.updateDynamic("flush")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* result */ scala.Boolean, scala.Unit]) => flush(t0, t1).runNow()))
    __obj.updateDynamic("getConnections")(js.Any.fromFunction1((t0: js.Function1[
  /* connectionInfos */ js.Array[typingsJapgolly.chrome.chrome.serial.ConnectionInfo], 
  scala.Unit]) => getConnections(t0).runNow()))
    __obj.updateDynamic("getControlSignals")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* signals */ js.Object, scala.Unit]) => getControlSignals(t0, t1).runNow()))
    __obj.updateDynamic("getDevices")(js.Any.fromFunction1((t0: js.Function1[/* ports */ js.Array[typingsJapgolly.chrome.chrome.serial.DeviceInfo], scala.Unit]) => getDevices(t0).runNow()))
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: js.Function1[
  /* connectionInfos */ js.Array[typingsJapgolly.chrome.chrome.serial.ConnectionInfo], 
  scala.Unit]) => getInfo(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction3((t0: scala.Double, t1: scala.scalajs.js.typedarray.ArrayBuffer, t2: js.Function1[/* sendInfo */ js.Object, scala.Unit]) => send(t0, t1, t2).runNow()))
    __obj.updateDynamic("setBreak")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* result */ scala.Boolean, scala.Unit]) => setBreak(t0, t1).runNow()))
    __obj.updateDynamic("setControlSignals")(js.Any.fromFunction3((t0: scala.Double, t1: js.Object, t2: js.Function1[/* result */ scala.Boolean, scala.Unit]) => setControlSignals(t0, t1, t2).runNow()))
    __obj.updateDynamic("setPaused")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Boolean, t2: js.Function0[scala.Unit]) => setPaused(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.chrome.chrome.serial.ConnectionOptions, t2: js.Function1[/* result */ scala.Boolean, scala.Unit]) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofserial]
  }
}

