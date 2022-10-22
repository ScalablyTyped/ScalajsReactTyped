package typingsJapgolly.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishResponse extends StObject {
  
  var timetoken: Double
}
object PublishResponse {
  
  inline def apply(timetoken: Double): PublishResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishResponse]
  }
  
  extension [Self <: PublishResponse](x: Self) {
    
    inline def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
