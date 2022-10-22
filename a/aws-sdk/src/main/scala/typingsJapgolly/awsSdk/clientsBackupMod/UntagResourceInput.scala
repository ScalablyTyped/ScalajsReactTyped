package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN
  
  /**
    * A list of keys to identify which key-value tags to remove from a resource.
    */
  var TagKeyList: typingsJapgolly.awsSdk.clientsBackupMod.TagKeyList
}
object UntagResourceInput {
  
  inline def apply(ResourceArn: ARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    inline def setTagKeyListVarargs(value: String*): Self = StObject.set(x, "TagKeyList", js.Array(value*))
  }
}
