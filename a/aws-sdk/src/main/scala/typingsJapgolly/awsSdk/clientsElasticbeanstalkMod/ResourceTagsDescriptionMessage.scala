package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTagsDescriptionMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which a tag list was requested.
    */
  var ResourceArn: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.ResourceArn] = js.undefined
  
  /**
    * A list of tag key-value pairs.
    */
  var ResourceTags: js.UndefOr[TagList] = js.undefined
}
object ResourceTagsDescriptionMessage {
  
  inline def apply(): ResourceTagsDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagsDescriptionMessage]
  }
  
  extension [Self <: ResourceTagsDescriptionMessage](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceTags(value: TagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: Tag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
  }
}
