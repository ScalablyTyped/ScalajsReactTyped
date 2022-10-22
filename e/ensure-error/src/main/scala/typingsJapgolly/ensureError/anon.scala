package typingsJapgolly.ensureError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ensure-error.ensure-error.ErrorWithStack<std.Error> */
  trait ErrorWithStackError extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] & String
  }
  object ErrorWithStackError {
    
    inline def apply(message: String, name: String, stack: js.UndefOr[String] & String): ErrorWithStackError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithStackError]
    }
    
    extension [Self <: ErrorWithStackError](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.UndefOr[String] & String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stack extends StObject {
    
    var stack: String
  }
  object Stack {
    
    inline def apply(stack: String): Stack = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stack]
    }
    
    extension [Self <: Stack](x: Self) {
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
