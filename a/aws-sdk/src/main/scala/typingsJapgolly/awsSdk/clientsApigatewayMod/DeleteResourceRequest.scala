package typingsJapgolly.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceRequest extends StObject {
  
  /**
    * The identifier of the Resource resource.
    */
  var resourceId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object DeleteResourceRequest {
  
  inline def apply(resourceId: String, restApiId: String): DeleteResourceRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceRequest]
  }
  
  extension [Self <: DeleteResourceRequest](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
