package typingsJapgolly.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog resource.
    */
  var Tags: TagList
}
object TagResourceInput {
  
  inline def apply(ResourceARN: AmazonResourceName, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  extension [Self <: TagResourceInput](x: Self) {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
