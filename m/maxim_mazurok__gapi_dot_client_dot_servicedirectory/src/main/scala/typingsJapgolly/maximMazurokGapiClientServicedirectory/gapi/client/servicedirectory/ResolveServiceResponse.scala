package typingsJapgolly.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveServiceResponse extends StObject {
  
  var service: js.UndefOr[Service] = js.undefined
}
object ResolveServiceResponse {
  
  inline def apply(): ResolveServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveServiceResponse]
  }
  
  extension [Self <: ResolveServiceResponse](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
