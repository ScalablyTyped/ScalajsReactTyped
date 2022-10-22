package typingsJapgolly.winrtUwp.global.Windows.Devices

import typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceAccessMode
import typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceSharingMode
import typingsJapgolly.winrtUwp.Windows.Devices.Custom.IIOControlCode
import typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlAccessMode
import typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Opens a custom device asynchronously, and with the object returned from the open operation send asynchronous IOCTLs to the device. */
object Custom {
  
  /** Represents a custom device. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Custom.CustomDevice")
  @js.native
  open class CustomDevice ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Custom.CustomDevice {
    
    /** The input stream. */
    /* CompleteClass */
    var inputStream: IInputStream = js.native
    
    /** The output stream. */
    /* CompleteClass */
    var outputStream: IOutputStream = js.native
    
    /**
      * Sends an IO control code.
      * @param ioControlCode The IO control code.
      * @param inputBuffer The input buffer.
      * @param outputBuffer The output buffer.
      * @return The result of the async operation.
      */
    /* CompleteClass */
    override def sendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Double] = js.native
    
    /**
      * Sends an IO control code. A return value indicates whether the operation succeeded.
      * @param ioControlCode The IO control code.
      * @param inputBuffer The input buffer.
      * @param outputBuffer The output buffer.
      * @return true if the operation is successful; otherwise, false.
      */
    /* CompleteClass */
    override def trySendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  object CustomDevice {
    
    @JSGlobal("Windows.Devices.Custom.CustomDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a CustomDevice object asynchronously for the specified DeviceInformation.Id .
      * @param deviceId The DeviceInformation.Id of the device .
      * @param desiredAccess The desired access.
      * @param sharingMode The sharing mode.
      * @return Returns a custom device.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String, desiredAccess: DeviceAccessMode, sharingMode: DeviceSharingMode): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.Custom.CustomDevice] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any], desiredAccess.asInstanceOf[js.Any], sharingMode.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.Custom.CustomDevice]]
    
    /**
      * Gets a device selector.
      * @param classGuid The Device Interface Class GUID of the device interface to create a device selector for.
      * @return The device selector.
      */
    /* static member */
    inline def getDeviceSelector(classGuid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(classGuid.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** The device access mode. */
  @JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
  @js.native
  object DeviceAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceAccessMode & Double] = js.native
    
    /* 0 */ val read: typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.read & Double = js.native
    
    /* 2 */ val readWrite: typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.readWrite & Double = js.native
    
    /* 1 */ val write: typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.write & Double = js.native
  }
  
  /** The device sharing mode. */
  @JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
  @js.native
  object DeviceSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceSharingMode & Double] = js.native
    
    /* 1 */ val exclusive: typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceSharingMode.exclusive & Double = js.native
    
    /* 0 */ val shared: typingsJapgolly.winrtUwp.Windows.Devices.Custom.DeviceSharingMode.shared & Double = js.native
  }
  
  /** Identifies the access mode. */
  @JSGlobal("Windows.Devices.Custom.IOControlAccessMode")
  @js.native
  object IOControlAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlAccessMode & Double] = js.native
    
    /* 0 */ val any: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.any & Double = js.native
    
    /* 1 */ val read: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.read & Double = js.native
    
    /* 3 */ val readWrite: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.readWrite & Double = js.native
    
    /* 2 */ val write: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.write & Double = js.native
  }
  
  /** Identifies the buffering method. */
  @JSGlobal("Windows.Devices.Custom.IOControlBufferingMethod")
  @js.native
  object IOControlBufferingMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod & Double
      ] = js.native
    
    /* 0 */ val buffered: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.buffered & Double = js.native
    
    /* 1 */ val directInput: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.directInput & Double = js.native
    
    /* 2 */ val directOutput: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.directOutput & Double = js.native
    
    /* 3 */ val neither: typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.neither & Double = js.native
  }
  
  /** Represents the control code. */
  @JSGlobal("Windows.Devices.Custom.IOControlCode")
  @js.native
  open class IOControlCode protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Custom.IOControlCode {
    /**
      * The control code.
      * @param deviceType The device type.
      * @param function The device function.
      * @param accessMode The access mode.
      * @param bufferingMethod The buffering method.
      */
    def this(
      deviceType: Double,
      func: Double,
      accessMode: IOControlAccessMode,
      bufferingMethod: IOControlBufferingMethod
    ) = this()
    
    /** The access mode. */
    /* CompleteClass */
    var accessMode: IOControlAccessMode = js.native
    
    /** The buffering method. */
    /* CompleteClass */
    var bufferingMethod: IOControlBufferingMethod = js.native
    
    /** The control code. */
    /* CompleteClass */
    var controlCode: Double = js.native
    
    /** The device type. */
    /* CompleteClass */
    var deviceType: Double = js.native
    
    /** The function. */
    /* CompleteClass */
    var function: Double = js.native
  }
  
  /** Represents know device types. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Custom.KnownDeviceTypes")
  @js.native
  open class KnownDeviceTypes ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Custom.KnownDeviceTypes
  object KnownDeviceTypes {
    
    @JSGlobal("Windows.Devices.Custom.KnownDeviceTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** Defined by the device vendor. */
    /* static member */
    @JSGlobal("Windows.Devices.Custom.KnownDeviceTypes.unknown")
    @js.native
    def unknown: Double = js.native
    inline def unknown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unknown")(x.asInstanceOf[js.Any])
  }
}
