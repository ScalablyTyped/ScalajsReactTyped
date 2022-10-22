package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceResponse extends StObject {
  
  /**
    * The full description of the deleted service.
    */
  var service: js.UndefOr[Service] = js.undefined
}
object DeleteServiceResponse {
  
  inline def apply(): DeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceResponse]
  }
  
  extension [Self <: DeleteServiceResponse](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
