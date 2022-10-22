package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to delete.
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsSagemakerMod.ResourceArn
  
  /**
    * An array or one or more tag keys to delete.
    */
  var TagKeys: TagKeyList
}
object DeleteTagsInput {
  
  inline def apply(ResourceArn: ResourceArn, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsInput]
  }
  
  extension [Self <: DeleteTagsInput](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
