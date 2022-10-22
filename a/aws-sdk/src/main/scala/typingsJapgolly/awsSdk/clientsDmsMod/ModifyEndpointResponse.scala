package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEndpointResponse extends StObject {
  
  /**
    * The modified endpoint.
    */
  var Endpoint: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.Endpoint] = js.undefined
}
object ModifyEndpointResponse {
  
  inline def apply(): ModifyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEndpointResponse]
  }
  
  extension [Self <: ModifyEndpointResponse](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
