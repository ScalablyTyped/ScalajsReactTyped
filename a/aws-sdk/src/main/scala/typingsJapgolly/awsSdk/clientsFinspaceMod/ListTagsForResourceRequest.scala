package typingsJapgolly.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var resourceArn: EnvironmentArn
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: EnvironmentArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: EnvironmentArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
