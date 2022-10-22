package typingsJapgolly.winrtUwp.global.Windows.Devices.Enumeration

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about the device updates that invoked the trigger. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceWatcherTriggerDetails")
@js.native
open class DeviceWatcherTriggerDetails ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherTriggerDetails {
  
  /** Gets the events that activated the trigger. */
  /* CompleteClass */
  var deviceWatcherEvents: IVectorView[typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherEvent] = js.native
}
