package typingsJapgolly.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsResponse extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resource tags.
    */
  var ResourceTagList: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.ResourceTagList] = js.undefined
}
object ListTagsResponse {
  
  inline def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  extension [Self <: ListTagsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceTagList(value: ResourceTagList): Self = StObject.set(x, "ResourceTagList", value.asInstanceOf[js.Any])
    
    inline def setResourceTagListUndefined: Self = StObject.set(x, "ResourceTagList", js.undefined)
    
    inline def setResourceTagListVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTagList", js.Array(value*))
  }
}
