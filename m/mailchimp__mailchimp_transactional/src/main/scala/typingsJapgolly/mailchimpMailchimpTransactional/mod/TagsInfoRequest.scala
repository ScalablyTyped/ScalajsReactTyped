package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsInfoRequest
  extends StObject
     with BaseRequest {
  
  /** an existing tag name */
  var tag: String
}
object TagsInfoRequest {
  
  inline def apply(tag: String): TagsInfoRequest = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsInfoRequest]
  }
  
  extension [Self <: TagsInfoRequest](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
