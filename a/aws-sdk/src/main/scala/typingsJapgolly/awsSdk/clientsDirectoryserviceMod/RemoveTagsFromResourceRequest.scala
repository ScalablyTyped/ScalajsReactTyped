package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceRequest extends StObject {
  
  /**
    * Identifier (ID) of the directory from which to remove the tag.
    */
  var ResourceId: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.ResourceId
  
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.TagKeys
}
object RemoveTagsFromResourceRequest {
  
  inline def apply(ResourceId: ResourceId, TagKeys: TagKeys): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  
  extension [Self <: RemoveTagsFromResourceRequest](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
