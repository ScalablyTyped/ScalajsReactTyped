package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
open class OrientationSensor ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensor
object OrientationSensor {
  
  @JSGlobal("Windows.Devices.Sensors.OrientationSensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensor]
  
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  /* static member */
  inline def getDefaultForRelativeReadings(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultForRelativeReadings")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensor]
}
