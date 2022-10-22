package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.serial.ConnectionInfo
import typingsJapgolly.chrome.chrome.serial.ConnectionOptions
import typingsJapgolly.chrome.chrome.serial.DeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofserial extends StObject {
  
  val DataBits: EIGHT
  
  val ParityBit: EVEN
  
  val StopBits: ONE
  
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
  
  val onReceive: TypeofonReceive
  
  val onReceiveError: TypeofonReceiveError
  
  def send(
    connectionId: Double,
    data: js.typedarray.ArrayBuffer,
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
  
  inline def apply(
    DataBits: EIGHT,
    ParityBit: EVEN,
    StopBits: ONE,
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
    send: (Double, js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Callback,
    setBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback,
    setControlSignals: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Callback,
    setPaused: (Double, Boolean, js.Function0[Unit]) => Callback,
    update: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Callback
  ): Typeofserial = {
    val __obj = js.Dynamic.literal(DataBits = DataBits.asInstanceOf[js.Any], ParityBit = ParityBit.asInstanceOf[js.Any], StopBits = StopBits.asInstanceOf[js.Any], clearBreak = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (clearBreak(t0, t1)).runNow()), connect = js.Any.fromFunction3((t0: String, t1: ConnectionOptions, t2: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => (connect(t0, t1, t2)).runNow()), disconnect = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (disconnect(t0, t1)).runNow()), flush = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (flush(t0, t1)).runNow()), getConnections = js.Any.fromFunction1((t0: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]) => getConnections(t0).runNow()), getControlSignals = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* signals */ js.Object, Unit]) => (getControlSignals(t0, t1)).runNow()), getDevices = js.Any.fromFunction1((t0: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]) => getDevices(t0).runNow()), getInfo = js.Any.fromFunction1((t0: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]) => getInfo(t0).runNow()), onReceive = onReceive.asInstanceOf[js.Any], onReceiveError = onReceiveError.asInstanceOf[js.Any], send = js.Any.fromFunction3((t0: Double, t1: js.typedarray.ArrayBuffer, t2: js.Function1[/* sendInfo */ js.Object, Unit]) => (send(t0, t1, t2)).runNow()), setBreak = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (setBreak(t0, t1)).runNow()), setControlSignals = js.Any.fromFunction3((t0: Double, t1: js.Object, t2: js.Function1[/* result */ Boolean, Unit]) => (setControlSignals(t0, t1, t2)).runNow()), setPaused = js.Any.fromFunction3((t0: Double, t1: Boolean, t2: js.Function0[Unit]) => (setPaused(t0, t1, t2)).runNow()), update = js.Any.fromFunction3((t0: Double, t1: ConnectionOptions, t2: js.Function1[/* result */ Boolean, Unit]) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Typeofserial]
  }
  
  extension [Self <: Typeofserial](x: Self) {
    
    inline def setClearBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback): Self = StObject.set(x, "clearBreak", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setConnect(
      value: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Callback
    ): Self = StObject.set(x, "connect", js.Any.fromFunction3((t0: String, t1: ConnectionOptions, t2: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDataBits(value: EIGHT): Self = StObject.set(x, "DataBits", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback): Self = StObject.set(x, "disconnect", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setFlush(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback): Self = StObject.set(x, "flush", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetConnections(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Callback): Self = StObject.set(x, "getConnections", js.Any.fromFunction1((t0: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]) => value(t0).runNow()))
    
    inline def setGetControlSignals(value: (Double, js.Function1[/* signals */ js.Object, Unit]) => Callback): Self = StObject.set(x, "getControlSignals", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* signals */ js.Object, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetDevices(value: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Callback): Self = StObject.set(x, "getDevices", js.Any.fromFunction1((t0: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]) => value(t0).runNow()))
    
    inline def setGetInfo(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Callback): Self = StObject.set(x, "getInfo", js.Any.fromFunction1((t0: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]) => value(t0).runNow()))
    
    inline def setOnReceive(value: TypeofonReceive): Self = StObject.set(x, "onReceive", value.asInstanceOf[js.Any])
    
    inline def setOnReceiveError(value: TypeofonReceiveError): Self = StObject.set(x, "onReceiveError", value.asInstanceOf[js.Any])
    
    inline def setParityBit(value: EVEN): Self = StObject.set(x, "ParityBit", value.asInstanceOf[js.Any])
    
    inline def setSend(
      value: (Double, js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Callback
    ): Self = StObject.set(x, "send", js.Any.fromFunction3((t0: Double, t1: js.typedarray.ArrayBuffer, t2: js.Function1[/* sendInfo */ js.Object, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Callback): Self = StObject.set(x, "setBreak", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* result */ Boolean, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSetControlSignals(value: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Callback): Self = StObject.set(x, "setControlSignals", js.Any.fromFunction3((t0: Double, t1: js.Object, t2: js.Function1[/* result */ Boolean, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetPaused(value: (Double, Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setPaused", js.Any.fromFunction3((t0: Double, t1: Boolean, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setStopBits(value: ONE): Self = StObject.set(x, "StopBits", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Double, t1: ConnectionOptions, t2: js.Function1[/* result */ Boolean, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
