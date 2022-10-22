package typingsJapgolly.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayTestIamPermissionsResponse extends StObject {
  
  /** A subset of `TestPermissionsRequest.permissions` that the caller is allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object ApigatewayTestIamPermissionsResponse {
  
  inline def apply(): ApigatewayTestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayTestIamPermissionsResponse]
  }
  
  extension [Self <: ApigatewayTestIamPermissionsResponse](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
