package typingsJapgolly.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorStatistics extends StObject {
  
  /**
    * The number of requests that failed with untracked 4xx Client Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The number of requests that failed with a 419 throttling status code.
    */
  var ThrottleCount: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The total number of requests that failed with a 4xx Client Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.undefined
}
object ErrorStatistics {
  
  inline def apply(): ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorStatistics]
  }
  
  extension [Self <: ErrorStatistics](x: Self) {
    
    inline def setOtherCount(value: NullableLong): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
    
    inline def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
    
    inline def setThrottleCount(value: NullableLong): Self = StObject.set(x, "ThrottleCount", value.asInstanceOf[js.Any])
    
    inline def setThrottleCountUndefined: Self = StObject.set(x, "ThrottleCount", js.undefined)
    
    inline def setTotalCount(value: NullableLong): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
