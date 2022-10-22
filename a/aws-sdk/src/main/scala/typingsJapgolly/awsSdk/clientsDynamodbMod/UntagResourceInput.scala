package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The DynamoDB resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
    */
  var ResourceArn: ResourceArnString
  
  /**
    * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the DynamoDB resource.
    */
  var TagKeys: TagKeyList
}
object UntagResourceInput {
  
  inline def apply(ResourceArn: ResourceArnString, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKeyString*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
