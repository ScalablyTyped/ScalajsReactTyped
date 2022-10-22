package typingsJapgolly.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The ARN of the canary or group that you're adding tags to. The ARN format of a canary is arn:aws:synthetics:Region:account-id:canary:canary-name . The ARN format of a group is arn:aws:synthetics:Region:account-id:group:group-name  
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsSyntheticsMod.ResourceArn
  
  /**
    * The list of key-value pairs to associate with the resource.
    */
  var Tags: TagMap
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
