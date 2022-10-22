package typingsJapgolly.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typingsJapgolly.awsSdk.clientsElbv2Mod.ResourceArns
  
  /**
    * The tags.
    */
  var Tags: TagList
}
object AddTagsInput {
  
  inline def apply(ResourceArns: ResourceArns, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
  
  extension [Self <: AddTagsInput](x: Self) {
    
    inline def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
