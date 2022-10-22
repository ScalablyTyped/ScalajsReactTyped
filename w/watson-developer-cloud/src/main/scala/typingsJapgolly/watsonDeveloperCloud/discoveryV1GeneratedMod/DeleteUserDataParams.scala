package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteUserData` operation. */
trait DeleteUserDataParams extends StObject {
  
  /** The customer ID for which all data is to be deleted. */
  var customer_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object DeleteUserDataParams {
  
  inline def apply(customer_id: String): DeleteUserDataParams = {
    val __obj = js.Dynamic.literal(customer_id = customer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserDataParams]
  }
  
  extension [Self <: DeleteUserDataParams](x: Self) {
    
    inline def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
