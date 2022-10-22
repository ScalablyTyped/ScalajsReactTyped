package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties, commands and events for handling calls on a telephony related device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.CallControl")
@js.native
open class CallControl ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl
object CallControl {
  
  @JSGlobal("Windows.Media.Devices.CallControl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a CallControl class that represents the audio communications device specified by the DeviceInformation ID being passed.
    * @param deviceId The DeviceInformation ID of the specified audio communications device.
    * @return A class that represents the specified audio communications device.
    */
  /* static member */
  inline def fromId(deviceId: String): typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl]
  
  /**
    * Returns a CallControl class that represents the default audio communications device.
    * @return A class that represents the default audio communications device.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl]
}
