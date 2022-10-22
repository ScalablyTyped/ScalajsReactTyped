package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyDailyCycle extends StObject {
  
  /** Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle. */
  var daysInCycle: js.UndefOr[Double] = js.undefined
  
  /** [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid. */
  var startTime: js.UndefOr[String] = js.undefined
}
object ResourcePolicyDailyCycle {
  
  inline def apply(): ResourcePolicyDailyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyDailyCycle]
  }
  
  extension [Self <: ResourcePolicyDailyCycle](x: Self) {
    
    inline def setDaysInCycle(value: Double): Self = StObject.set(x, "daysInCycle", value.asInstanceOf[js.Any])
    
    inline def setDaysInCycleUndefined: Self = StObject.set(x, "daysInCycle", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
