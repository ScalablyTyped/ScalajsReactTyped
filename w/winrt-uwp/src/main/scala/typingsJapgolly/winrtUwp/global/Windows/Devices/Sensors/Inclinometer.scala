package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
open class Inclinometer ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Inclinometer
object Inclinometer {
  
  @JSGlobal("Windows.Devices.Sensors.Inclinometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Inclinometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Inclinometer]
  
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  /* static member */
  inline def getDefaultForRelativeReadings(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Inclinometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultForRelativeReadings")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Inclinometer]
}
