package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodoComment extends StObject {
  
  var descriptor: TodoCommentDescriptor
  
  var message: java.lang.String
  
  var position: Double
}
object TodoComment {
  
  inline def apply(descriptor: TodoCommentDescriptor, message: java.lang.String, position: Double): TodoComment = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodoComment]
  }
  
  extension [Self <: TodoComment](x: Self) {
    
    inline def setDescriptor(value: TodoCommentDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
