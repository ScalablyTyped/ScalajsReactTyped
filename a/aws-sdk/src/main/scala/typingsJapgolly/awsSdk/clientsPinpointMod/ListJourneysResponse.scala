package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJourneysResponse extends StObject {
  
  var JourneysResponse: typingsJapgolly.awsSdk.clientsPinpointMod.JourneysResponse
}
object ListJourneysResponse {
  
  inline def apply(JourneysResponse: JourneysResponse): ListJourneysResponse = {
    val __obj = js.Dynamic.literal(JourneysResponse = JourneysResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJourneysResponse]
  }
  
  extension [Self <: ListJourneysResponse](x: Self) {
    
    inline def setJourneysResponse(value: JourneysResponse): Self = StObject.set(x, "JourneysResponse", value.asInstanceOf[js.Any])
  }
}
