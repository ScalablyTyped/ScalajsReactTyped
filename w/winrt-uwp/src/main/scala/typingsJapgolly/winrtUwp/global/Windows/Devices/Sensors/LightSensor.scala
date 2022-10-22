package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient-light sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
open class LightSensor ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.LightSensor
object LightSensor {
  
  @JSGlobal("Windows.Devices.Sensors.LightSensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default ambient-light sensor.
    * @return The default ambient-light sensor or null if no integrated light sensors are found.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.LightSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.LightSensor]
}
