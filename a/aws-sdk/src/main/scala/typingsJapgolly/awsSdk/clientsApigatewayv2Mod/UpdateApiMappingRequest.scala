package typingsJapgolly.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApiMappingRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: Id
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
  
  /**
    * The domain name.
    */
  var DomainName: string
  
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}
object UpdateApiMappingRequest {
  
  inline def apply(ApiId: Id, ApiMappingId: string, DomainName: string): UpdateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiMappingRequest]
  }
  
  extension [Self <: UpdateApiMappingRequest](x: Self) {
    
    inline def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiMappingId(value: string): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    inline def setApiMappingKey(value: SelectionKey): Self = StObject.set(x, "ApiMappingKey", value.asInstanceOf[js.Any])
    
    inline def setApiMappingKeyUndefined: Self = StObject.set(x, "ApiMappingKey", js.undefined)
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setStage(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
