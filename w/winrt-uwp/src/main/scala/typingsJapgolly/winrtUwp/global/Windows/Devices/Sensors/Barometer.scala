package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
open class Barometer ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Barometer
object Barometer {
  
  @JSGlobal("Windows.Devices.Sensors.Barometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default barometer sensor.
    * @return The default barometer.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Barometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.Barometer]
}
