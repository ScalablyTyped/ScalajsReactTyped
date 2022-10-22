package typingsJapgolly.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// fetch time
trait FetchTimeResponse extends StObject {
  
  var timetoken: Double
}
object FetchTimeResponse {
  
  inline def apply(timetoken: Double): FetchTimeResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTimeResponse]
  }
  
  extension [Self <: FetchTimeResponse](x: Self) {
    
    inline def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
