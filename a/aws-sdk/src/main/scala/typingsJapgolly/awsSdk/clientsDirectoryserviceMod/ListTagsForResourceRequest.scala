package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * Reserved for future use.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * Identifier (ID) of the directory for which you want to retrieve tags.
    */
  var ResourceId: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.ResourceId
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceId: ResourceId): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
