package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import typingsJapgolly.winrtUwp.anon.ReturnValueValue
import typingsJapgolly.winrtUwp.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets or sets a device setting on a camera. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.MediaDeviceControl")
@js.native
open class MediaDeviceControl ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl {
  
  /** Gets the capabilities of the camera for this camera setting. */
  /* CompleteClass */
  var capabilities: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControlCapabilities = js.native
  
  /**
    * Indicates whether automatic adjustment of the camera setting is enabled.
    */
  /* CompleteClass */
  override def tryGetAuto(): Value = js.native
  
  /**
    * Gets the value of the camera setting.
    */
  /* CompleteClass */
  override def tryGetValue(): ReturnValueValue = js.native
  
  /**
    * Enables or disables automatic adjustment of the camera setting.
    * @param value True to enable automatic adjustment; or false to disable automatic adjustment. If false, call TrySetValue to adjust the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  /* CompleteClass */
  override def trySetAuto(value: Boolean): Boolean = js.native
  
  /**
    * Sets the camera setting.
    * @param value The new value of the camera setting. The units depend on the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  /* CompleteClass */
  override def trySetValue(value: Double): Boolean = js.native
}
