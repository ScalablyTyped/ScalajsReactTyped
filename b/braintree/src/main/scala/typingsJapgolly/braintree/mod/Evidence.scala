package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evidence extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var createdAt: String
  
  var id: String
  
  var sendToProcessorAt: js.Date
  
  var url: js.UndefOr[String] = js.undefined
}
object Evidence {
  
  inline def apply(createdAt: String, id: String, sendToProcessorAt: js.Date): Evidence = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sendToProcessorAt = sendToProcessorAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evidence]
  }
  
  extension [Self <: Evidence](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSendToProcessorAt(value: js.Date): Self = StObject.set(x, "sendToProcessorAt", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
