package typingsJapgolly.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceResponse extends StObject {
  
  /**
    * The status of the operation.
    */
  var Status: String
}
object RemoveTagsFromResourceResponse {
  
  inline def apply(Status: String): RemoveTagsFromResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceResponse]
  }
  
  extension [Self <: RemoveTagsFromResourceResponse](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
