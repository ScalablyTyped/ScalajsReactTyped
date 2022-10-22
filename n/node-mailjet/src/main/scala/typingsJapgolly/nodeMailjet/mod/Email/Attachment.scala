package typingsJapgolly.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var Base64Content: String
  
  var ContentType: String
  
  var Filename: String
}
object Attachment {
  
  inline def apply(Base64Content: String, ContentType: String, Filename: String): Attachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setBase64Content(value: String): Self = StObject.set(x, "Base64Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "Filename", value.asInstanceOf[js.Any])
  }
}
