package typingsJapgolly.cordovarduino

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cordovardunio {
  
  trait Serial extends StObject {
    
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
    
    inline def apply(
      close: (js.Function, js.Function) => Callback,
      open: (SerialOptions, js.Function, js.Function) => Callback,
      read: (js.Function, js.Function) => Callback,
      registerReadCallback: (js.Function, js.Function) => Callback,
      requestPermission: (js.Function, js.Function) => Callback,
      write: (String, js.Function, js.Function) => Callback
    ): Serial = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (close(t0, t1)).runNow()), open = js.Any.fromFunction3((t0: SerialOptions, t1: js.Function, t2: js.Function) => (open(t0, t1, t2)).runNow()), read = js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (read(t0, t1)).runNow()), registerReadCallback = js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (registerReadCallback(t0, t1)).runNow()), requestPermission = js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (requestPermission(t0, t1)).runNow()), write = js.Any.fromFunction3((t0: String, t1: js.Function, t2: js.Function) => (write(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Serial]
    }
    
    extension [Self <: Serial](x: Self) {
      
      inline def setClose(value: (js.Function, js.Function) => Callback): Self = StObject.set(x, "close", js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setOpen(value: (SerialOptions, js.Function, js.Function) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction3((t0: SerialOptions, t1: js.Function, t2: js.Function) => (value(t0, t1, t2)).runNow()))
      
      inline def setRead(value: (js.Function, js.Function) => Callback): Self = StObject.set(x, "read", js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setRegisterReadCallback(value: (js.Function, js.Function) => Callback): Self = StObject.set(x, "registerReadCallback", js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setRequestPermission(value: (js.Function, js.Function) => Callback): Self = StObject.set(x, "requestPermission", js.Any.fromFunction2((t0: js.Function, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setWrite(value: (String, js.Function, js.Function) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction3((t0: String, t1: js.Function, t2: js.Function) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait SerialOptions extends StObject {
    
    /**
      * @defaultValue 9600
      */
    var baudRate: js.UndefOr[Double] = js.undefined
    
    /**
      * @defaultValue 8
      */
    var dataBits: js.UndefOr[Double] = js.undefined
    
    /**
      * @defaultValue 0
      */
    var parity: js.UndefOr[Double] = js.undefined
    
    /**
      * @defaultValue 1
      */
    var stopBits: js.UndefOr[Double] = js.undefined
  }
  object SerialOptions {
    
    inline def apply(): SerialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerialOptions]
    }
    
    extension [Self <: SerialOptions](x: Self) {
      
      inline def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      inline def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      inline def setDataBits(value: Double): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      inline def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      inline def setParity(value: Double): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      inline def setStopBits(value: Double): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      inline def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
}
