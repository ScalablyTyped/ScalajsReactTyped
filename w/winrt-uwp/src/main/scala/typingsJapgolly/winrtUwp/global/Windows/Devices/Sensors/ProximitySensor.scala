package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a proximity sensor to determine whether or not an object is detected. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
open class ProximitySensor ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensor
object ProximitySensor {
  
  @JSGlobal("Windows.Devices.Sensors.ProximitySensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Obtains the proximity sensor from its identifier.
    * @param sensorId The sensor identifier.
    * @return Returns the ProximitySensor object from its identifier.
    */
  /* static member */
  inline def fromId(sensorId: String): typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(sensorId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensor]
  
  /**
    * Gets the device selector.
    * @return Returns the device selector. If no device selector is available, this method returns null.
    */
  /* static member */
  inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  
  /**
    * Gets readings from the trigger details in background task.
    * @param triggerDetails The trigger details received from the background task.
    * @return The collection of proximity data retrieved from the trigger details.
    */
  /* static member */
  inline def getReadingsFromTriggerDetails(triggerDetails: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.SensorDataThresholdTriggerDetails): IVectorView[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReadingsFromTriggerDetails")(triggerDetails.asInstanceOf[js.Any]).asInstanceOf[IVectorView[typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading]]
}
