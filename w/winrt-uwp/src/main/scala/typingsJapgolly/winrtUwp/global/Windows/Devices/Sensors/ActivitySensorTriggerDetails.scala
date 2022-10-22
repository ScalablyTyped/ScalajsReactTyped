package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents details about the sensor triggering. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.ActivitySensorTriggerDetails")
@js.native
open class ActivitySensorTriggerDetails ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ActivitySensorTriggerDetails {
  
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  /* CompleteClass */
  override def readReports(): IVectorView[
    typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingChangeReport
  ] = js.native
}
