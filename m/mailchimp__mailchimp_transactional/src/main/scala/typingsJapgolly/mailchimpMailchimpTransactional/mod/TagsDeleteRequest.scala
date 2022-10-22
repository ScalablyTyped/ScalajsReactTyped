package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** a tag name */
  var tag: String
}
object TagsDeleteRequest {
  
  inline def apply(tag: String): TagsDeleteRequest = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsDeleteRequest]
  }
  
  extension [Self <: TagsDeleteRequest](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
