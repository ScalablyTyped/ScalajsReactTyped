package typingsJapgolly.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTime extends StObject {
  
  var cancelTime: js.UndefOr[String] = js.undefined
  
  var currentReleaseInfo: js.UndefOr[AmountInMicros] = js.undefined
  
  var nextReleaseInfo: js.UndefOr[AmountInMicros] = js.undefined
  
  var seriesSubscriptionType: js.UndefOr[String] = js.undefined
}
object CancelTime {
  
  inline def apply(): CancelTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelTime]
  }
  
  extension [Self <: CancelTime](x: Self) {
    
    inline def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setCurrentReleaseInfo(value: AmountInMicros): Self = StObject.set(x, "currentReleaseInfo", value.asInstanceOf[js.Any])
    
    inline def setCurrentReleaseInfoUndefined: Self = StObject.set(x, "currentReleaseInfo", js.undefined)
    
    inline def setNextReleaseInfo(value: AmountInMicros): Self = StObject.set(x, "nextReleaseInfo", value.asInstanceOf[js.Any])
    
    inline def setNextReleaseInfoUndefined: Self = StObject.set(x, "nextReleaseInfo", js.undefined)
    
    inline def setSeriesSubscriptionType(value: String): Self = StObject.set(x, "seriesSubscriptionType", value.asInstanceOf[js.Any])
    
    inline def setSeriesSubscriptionTypeUndefined: Self = StObject.set(x, "seriesSubscriptionType", js.undefined)
  }
}
