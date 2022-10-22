package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteCustomerId extends StObject {
  
  var customerId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteCustomerId {
  
  inline def apply(): AppsDynamiteCustomerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteCustomerId]
  }
  
  extension [Self <: AppsDynamiteCustomerId](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
