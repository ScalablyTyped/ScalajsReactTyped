package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a gyrometer sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
open class Gyrometer ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Gyrometer
object Gyrometer {
  
  @JSGlobal("Windows.Devices.Sensors.Gyrometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default gyrometer.
    * @return The default gyrometer or null if no integrated gyrometers are found.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Gyrometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Gyrometer]
}
