package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotStartTimeRangeRequest extends StObject {
  
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start.
    */
  var LatestTime: js.UndefOr[js.Date] = js.undefined
}
object SlotStartTimeRangeRequest {
  
  inline def apply(): SlotStartTimeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotStartTimeRangeRequest]
  }
  
  extension [Self <: SlotStartTimeRangeRequest](x: Self) {
    
    inline def setEarliestTime(value: js.Date): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestTimeUndefined: Self = StObject.set(x, "EarliestTime", js.undefined)
    
    inline def setLatestTime(value: js.Date): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
    
    inline def setLatestTimeUndefined: Self = StObject.set(x, "LatestTime", js.undefined)
  }
}
