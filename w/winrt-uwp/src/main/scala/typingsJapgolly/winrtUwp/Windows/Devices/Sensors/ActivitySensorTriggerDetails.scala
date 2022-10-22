package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents details about the sensor triggering. */
trait ActivitySensorTriggerDetails extends StObject {
  
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  def readReports(): IVectorView[ActivitySensorReadingChangeReport]
}
object ActivitySensorTriggerDetails {
  
  inline def apply(readReports: CallbackTo[IVectorView[ActivitySensorReadingChangeReport]]): ActivitySensorTriggerDetails = {
    val __obj = js.Dynamic.literal(readReports = readReports.toJsFn)
    __obj.asInstanceOf[ActivitySensorTriggerDetails]
  }
  
  extension [Self <: ActivitySensorTriggerDetails](x: Self) {
    
    inline def setReadReports(value: CallbackTo[IVectorView[ActivitySensorReadingChangeReport]]): Self = StObject.set(x, "readReports", value.toJsFn)
  }
}
