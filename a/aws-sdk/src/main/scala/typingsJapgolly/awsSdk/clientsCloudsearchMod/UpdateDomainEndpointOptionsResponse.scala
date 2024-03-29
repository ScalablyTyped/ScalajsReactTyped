package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainEndpointOptionsResponse extends StObject {
  
  /**
    * The newly-configured domain endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
}
object UpdateDomainEndpointOptionsResponse {
  
  inline def apply(): UpdateDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainEndpointOptionsResponse]
  }
  
  extension [Self <: UpdateDomainEndpointOptionsResponse](x: Self) {
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
  }
}
