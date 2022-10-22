package typingsJapgolly.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointAccessResponse extends StObject {
  
  /**
    * The returned VPC endpoint.
    */
  var endpoint: js.UndefOr[EndpointAccess] = js.undefined
}
object GetEndpointAccessResponse {
  
  inline def apply(): GetEndpointAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEndpointAccessResponse]
  }
  
  extension [Self <: GetEndpointAccessResponse](x: Self) {
    
    inline def setEndpoint(value: EndpointAccess): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
