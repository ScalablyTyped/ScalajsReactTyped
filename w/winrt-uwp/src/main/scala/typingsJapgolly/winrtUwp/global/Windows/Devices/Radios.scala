package typingsJapgolly.winrtUwp.global.Windows.Devices

import typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioAccessStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The members of this namespace allow your app to find and control radio adapters, like Wi-Fi and Bluetooth, on the device where your app runs, and to query those radios for certain attributes. */
object Radios {
  
  /** Represents a radio device on the system. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Radios.Radio")
  @js.native
  open class Radio ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Radios.Radio
  object Radio {
    
    @JSGlobal("Windows.Devices.Radios.Radio")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A static method that retrieves a Radio object corresponding to a device Id obtained through Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related APIs.
      * @param deviceId A string that identifies a particular radio device.
      * @return An asynchronous retrieval operation. On successful completion, it contains a Radio object that represents the specified radio device.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.Radios.Radio] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.Radios.Radio]]
    
    /**
      * A static method that returns an Advanced Query Syntax (AQS) string to be used to enumerate or monitor Radio devices with Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related methods.
      * @return An identifier to be used to enumerate radio devices.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    
    /**
      * A static, asynchronous method that retrieves a collection of Windows.Devices.Radios.Radio objects representing radio devices existing on the system.
      * @return An asynchronous retrieval operation. When the operation is complete, contains a list of Windows.Devices.Radios.Radio objects describing available radios.
      */
    /* static member */
    inline def getRadiosAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadiosAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * An asynchronous method that retrieves a value indicating what access the current user has to the radio represented by this object. In circumstances where user permission is required to access the radio, this method prompts the user for permission. Consequently, always call this method on the UI thread.
      * @return An asynchronous status retrieval operation. On successful completion, contains an enumeration value describing the current user's access to this radio.
      */
    /* static member */
    inline def requestAccessAsync(): IPromiseWithIAsyncOperation[RadioAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[RadioAccessStatus]]
  }
  
  /** Enumeration that describes possible access states that a user can have to a given radio. */
  @JSGlobal("Windows.Devices.Radios.RadioAccessStatus")
  @js.native
  object RadioAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioAccessStatus & Double] = js.native
    
    /* 1 */ val allowed: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.allowed & Double = js.native
    
    /* 3 */ val deniedBySystem: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.deniedBySystem & Double = js.native
    
    /* 2 */ val deniedByUser: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.deniedByUser & Double = js.native
    
    /* 0 */ val unspecified: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.unspecified & Double = js.native
  }
  
  /** Enumeration that represents the kinds of radio devices. */
  @JSGlobal("Windows.Devices.Radios.RadioKind")
  @js.native
  object RadioKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioKind & Double] = js.native
    
    /* 3 */ val bluetooth: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioKind.bluetooth & Double = js.native
    
    /* 4 */ val fm: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioKind.fm & Double = js.native
    
    /* 2 */ val mobileBroadband: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioKind.mobileBroadband & Double = js.native
    
    /* 0 */ val other: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioKind.other & Double = js.native
    
    /* 1 */ val wiFi: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioKind.wiFi & Double = js.native
  }
  
  /** Enumeration that describes possible radio states. */
  @JSGlobal("Windows.Devices.Radios.RadioState")
  @js.native
  object RadioState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioState & Double] = js.native
    
    /* 3 */ val disabled: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioState.disabled & Double = js.native
    
    /* 2 */ val off: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioState.off & Double = js.native
    
    /* 1 */ val on: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioState.on & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrtUwp.Windows.Devices.Radios.RadioState.unknown & Double = js.native
  }
}
