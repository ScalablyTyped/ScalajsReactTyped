package typingsJapgolly.i18nJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: typingsJapgolly.i18nJs.mod.Message
  }
  object Message {
    
    inline def apply(message: typingsJapgolly.i18nJs.mod.Message): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: typingsJapgolly.i18nJs.mod.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* scope */ typingsJapgolly.i18nJs.mod.Scope => String | js.Object): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    }
  }
  
  trait Scope extends StObject {
    
    var scope: typingsJapgolly.i18nJs.mod.Scope
  }
  object Scope {
    
    inline def apply(scope: typingsJapgolly.i18nJs.mod.Scope): Scope = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setScope(value: typingsJapgolly.i18nJs.mod.Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
}
