package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the reading–changed event of the proximity sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs")
@js.native
open class ProximitySensorReadingChangedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs {
  
  /** Gets or sets the most recent proximity sensor reading. */
  /* CompleteClass */
  var reading: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading = js.native
}
