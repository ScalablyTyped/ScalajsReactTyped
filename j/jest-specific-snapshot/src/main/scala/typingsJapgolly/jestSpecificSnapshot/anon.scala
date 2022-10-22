package typingsJapgolly.jestSpecificSnapshot

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    def message(): String
    
    var pass: Boolean
  }
  object Message {
    
    inline def apply(message: CallbackTo[String], pass: Boolean): Message = {
      val __obj = js.Dynamic.literal(message = message.toJsFn, pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: CallbackTo[String]): Self = StObject.set(x, "message", value.toJsFn)
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
}
