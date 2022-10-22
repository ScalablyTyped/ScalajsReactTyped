package typingsJapgolly.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about access to a device. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
open class DeviceAccessInformation ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation
object DeviceAccessInformation {
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initializes a DeviceAccessInformation object based on a given DeviceClass .
    * @param deviceClass Device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given DeviceClass .
    */
  /* static member */
  inline def createFromDeviceClass(deviceClass: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDeviceClass")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation]
  
  /**
    * Initializes a DeviceAccessInformation object based on a device class id.
    * @param deviceClassId Id of the device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device class id.
    */
  /* static member */
  inline def createFromDeviceClassId(deviceClassId: String): typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDeviceClassId")(deviceClassId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation]
  
  /**
    * Initializes a DeviceAccessInformation object based on a device id.
    * @param deviceId Id of the device to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device id.
    */
  /* static member */
  inline def createFromId(deviceId: String): typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation]
}
