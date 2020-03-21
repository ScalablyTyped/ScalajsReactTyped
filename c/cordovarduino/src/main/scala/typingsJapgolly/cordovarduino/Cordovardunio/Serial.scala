package typingsJapgolly.cordovarduino.Cordovardunio

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serial extends js.Object {
  /**
    * Close connection.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def close(successCallback: js.Function, errorCallback: js.Function): Unit
  /**
    * Open a connection.
    *
    * @param opts            SerialOptions object
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def open(opts: SerialOptions, successCallback: js.Function, errorCallback: js.Function): Unit
  /**
    * Read from the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def read(successCallback: js.Function, errorCallback: js.Function): Unit
  /**
    * Register a callback for the driver reading incoming data from the serial device
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def registerReadCallback(successCallback: js.Function, errorCallback: js.Function): Unit
  /**
    * Request permission to interact with the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def requestPermission(successCallback: js.Function, errorCallback: js.Function): Unit
  /**
    * Write to the serial port.
    *
    * @param data            String data to write to serial port
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def write(data: String, successCallback: js.Function, errorCallback: js.Function): Unit
}

object Serial {
  @scala.inline
  def apply(
    close: (js.Function, js.Function) => Callback,
    open: (SerialOptions, js.Function, js.Function) => Callback,
    read: (js.Function, js.Function) => Callback,
    registerReadCallback: (js.Function, js.Function) => Callback,
    requestPermission: (js.Function, js.Function) => Callback,
    write: (String, js.Function, js.Function) => Callback
  ): Serial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction2((t0: js.Function, t1: js.Function) => close(t0, t1).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction3((t0: typingsJapgolly.cordovarduino.Cordovardunio.SerialOptions, t1: js.Function, t2: js.Function) => open(t0, t1, t2).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction2((t0: js.Function, t1: js.Function) => read(t0, t1).runNow()))
    __obj.updateDynamic("registerReadCallback")(js.Any.fromFunction2((t0: js.Function, t1: js.Function) => registerReadCallback(t0, t1).runNow()))
    __obj.updateDynamic("requestPermission")(js.Any.fromFunction2((t0: js.Function, t1: js.Function) => requestPermission(t0, t1).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function, t2: js.Function) => write(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Serial]
  }
}

