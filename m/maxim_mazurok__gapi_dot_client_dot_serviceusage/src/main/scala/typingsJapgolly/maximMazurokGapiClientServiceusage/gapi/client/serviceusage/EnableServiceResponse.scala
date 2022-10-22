package typingsJapgolly.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableServiceResponse extends StObject {
  
  /** The new state of the service after enabling. */
  var service: js.UndefOr[GoogleApiServiceusageV1Service] = js.undefined
}
object EnableServiceResponse {
  
  inline def apply(): EnableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableServiceResponse]
  }
  
  extension [Self <: EnableServiceResponse](x: Self) {
    
    inline def setService(value: GoogleApiServiceusageV1Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
