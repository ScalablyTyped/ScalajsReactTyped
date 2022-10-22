package typingsJapgolly.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponseDataTo extends StObject {
  
  val Email: String
  
  val MessageHref: String
  
  val MessageID: Double
  
  val MessageUUID: String
}
object PostResponseDataTo {
  
  inline def apply(Email: String, MessageHref: String, MessageID: Double, MessageUUID: String): PostResponseDataTo = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MessageHref = MessageHref.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageUUID = MessageUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataTo]
  }
  
  extension [Self <: PostResponseDataTo](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setMessageHref(value: String): Self = StObject.set(x, "MessageHref", value.asInstanceOf[js.Any])
    
    inline def setMessageID(value: Double): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
    
    inline def setMessageUUID(value: String): Self = StObject.set(x, "MessageUUID", value.asInstanceOf[js.Any])
  }
}
