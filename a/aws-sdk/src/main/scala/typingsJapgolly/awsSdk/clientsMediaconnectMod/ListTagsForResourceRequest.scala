package typingsJapgolly.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the AWS Elemental MediaConnect resource for which to list the tags.
    */
  var ResourceArn: string
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceArn: string): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
