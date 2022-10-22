package typingsJapgolly.winrtUwp.Windows.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Opens a custom device asynchronously, and with the object returned from the open operation send asynchronous IOCTLs to the device. */
object Custom {
  
  @js.native
  sealed trait DeviceAccessMode extends StObject
  /** The device access mode. */
  @JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
  @js.native
  object DeviceAccessMode extends StObject {
    
    /** Read access. */
    @js.native
    sealed trait read
      extends StObject
         with DeviceAccessMode
    
    /** Read/write access. */
    @js.native
    sealed trait readWrite
      extends StObject
         with DeviceAccessMode
    
    /** Write access. */
    @js.native
    sealed trait write
      extends StObject
         with DeviceAccessMode
  }
  
  @js.native
  sealed trait DeviceSharingMode extends StObject
  /** The device sharing mode. */
  @JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
  @js.native
  object DeviceSharingMode extends StObject {
    
    /** The device is exclusive. */
    @js.native
    sealed trait exclusive
      extends StObject
         with DeviceSharingMode
    
    /** The device is shared. */
    @js.native
    sealed trait shared
      extends StObject
         with DeviceSharingMode
  }
  
  @js.native
  sealed trait IOControlAccessMode extends StObject
  /** Identifies the access mode. */
  @JSGlobal("Windows.Devices.Custom.IOControlAccessMode")
  @js.native
  object IOControlAccessMode extends StObject {
    
    /** Any mode. */
    @js.native
    sealed trait any
      extends StObject
         with IOControlAccessMode
    
    /** Read mode. */
    @js.native
    sealed trait read
      extends StObject
         with IOControlAccessMode
    
    /** Read/write mode. */
    @js.native
    sealed trait readWrite
      extends StObject
         with IOControlAccessMode
    
    /** Write mode. */
    @js.native
    sealed trait write
      extends StObject
         with IOControlAccessMode
  }
  
  @js.native
  sealed trait IOControlBufferingMethod extends StObject
  /** Identifies the buffering method. */
  @JSGlobal("Windows.Devices.Custom.IOControlBufferingMethod")
  @js.native
  object IOControlBufferingMethod extends StObject {
    
    /** Buffered. */
    @js.native
    sealed trait buffered
      extends StObject
         with IOControlBufferingMethod
    
    /** Direct input. */
    @js.native
    sealed trait directInput
      extends StObject
         with IOControlBufferingMethod
    
    /** Direct output. */
    @js.native
    sealed trait directOutput
      extends StObject
         with IOControlBufferingMethod
    
    /** Neither. */
    @js.native
    sealed trait neither
      extends StObject
         with IOControlBufferingMethod
  }
  
  /** Represents a custom device. */
  trait CustomDevice extends StObject {
    
    /** The input stream. */
    var inputStream: IInputStream
    
    /** The output stream. */
    var outputStream: IOutputStream
    
    /**
      * Sends an IO control code.
      * @param ioControlCode The IO control code.
      * @param inputBuffer The input buffer.
      * @param outputBuffer The output buffer.
      * @return The result of the async operation.
      */
    def sendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Double]
    
    /**
      * Sends an IO control code. A return value indicates whether the operation succeeded.
      * @param ioControlCode The IO control code.
      * @param inputBuffer The input buffer.
      * @param outputBuffer The output buffer.
      * @return true if the operation is successful; otherwise, false.
      */
    def trySendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Boolean]
  }
  object CustomDevice {
    
    inline def apply(
      inputStream: IInputStream,
      outputStream: IOutputStream,
      sendIOControlAsync: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Double],
      trySendIOControlAsync: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Boolean]
    ): CustomDevice = {
      val __obj = js.Dynamic.literal(inputStream = inputStream.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], sendIOControlAsync = js.Any.fromFunction3(sendIOControlAsync), trySendIOControlAsync = js.Any.fromFunction3(trySendIOControlAsync))
      __obj.asInstanceOf[CustomDevice]
    }
    
    extension [Self <: CustomDevice](x: Self) {
      
      inline def setInputStream(value: IInputStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
      
      inline def setOutputStream(value: IOutputStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setSendIOControlAsync(value: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Double]): Self = StObject.set(x, "sendIOControlAsync", js.Any.fromFunction3(value))
      
      inline def setTrySendIOControlAsync(value: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "trySendIOControlAsync", js.Any.fromFunction3(value))
    }
  }
  
  /** Represents IO control code. */
  trait IIOControlCode extends StObject {
    
    /** The access mode. */
    var accessMode: IOControlAccessMode
    
    /** The buffering method. */
    var bufferingMethod: IOControlBufferingMethod
    
    /** The control code. */
    var controlCode: Double
    
    /** The device type. */
    var deviceType: Double
    
    /** The function. */
    var function: Double
  }
  object IIOControlCode {
    
    inline def apply(
      accessMode: IOControlAccessMode,
      bufferingMethod: IOControlBufferingMethod,
      controlCode: Double,
      deviceType: Double,
      function: Double
    ): IIOControlCode = {
      val __obj = js.Dynamic.literal(accessMode = accessMode.asInstanceOf[js.Any], bufferingMethod = bufferingMethod.asInstanceOf[js.Any], controlCode = controlCode.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIOControlCode]
    }
    
    extension [Self <: IIOControlCode](x: Self) {
      
      inline def setAccessMode(value: IOControlAccessMode): Self = StObject.set(x, "accessMode", value.asInstanceOf[js.Any])
      
      inline def setBufferingMethod(value: IOControlBufferingMethod): Self = StObject.set(x, "bufferingMethod", value.asInstanceOf[js.Any])
      
      inline def setControlCode(value: Double): Self = StObject.set(x, "controlCode", value.asInstanceOf[js.Any])
      
      inline def setDeviceType(value: Double): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: Double): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the control code. */
  trait IOControlCode extends StObject {
    
    /** The access mode. */
    var accessMode: IOControlAccessMode
    
    /** The buffering method. */
    var bufferingMethod: IOControlBufferingMethod
    
    /** The control code. */
    var controlCode: Double
    
    /** The device type. */
    var deviceType: Double
    
    /** The function. */
    var function: Double
  }
  object IOControlCode {
    
    inline def apply(
      accessMode: IOControlAccessMode,
      bufferingMethod: IOControlBufferingMethod,
      controlCode: Double,
      deviceType: Double,
      function: Double
    ): IOControlCode = {
      val __obj = js.Dynamic.literal(accessMode = accessMode.asInstanceOf[js.Any], bufferingMethod = bufferingMethod.asInstanceOf[js.Any], controlCode = controlCode.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOControlCode]
    }
    
    extension [Self <: IOControlCode](x: Self) {
      
      inline def setAccessMode(value: IOControlAccessMode): Self = StObject.set(x, "accessMode", value.asInstanceOf[js.Any])
      
      inline def setBufferingMethod(value: IOControlBufferingMethod): Self = StObject.set(x, "bufferingMethod", value.asInstanceOf[js.Any])
      
      inline def setControlCode(value: Double): Self = StObject.set(x, "controlCode", value.asInstanceOf[js.Any])
      
      inline def setDeviceType(value: Double): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: Double): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents know device types. */
  trait KnownDeviceTypes extends StObject
}
