package typingsJapgolly.documentdb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserScriptable
  extends StObject
     with UniqueId {
  
  /** The user function. Must set one of body or serverscript */
  var body: js.UndefOr[UserFunction] = js.undefined
  
  /** The user function. Must set one of body or serverscript */
  var serverScript: js.UndefOr[UserFunction] = js.undefined
}
object UserScriptable {
  
  inline def apply(id: String): UserScriptable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptable]
  }
  
  extension [Self <: UserScriptable](x: Self) {
    
    inline def setBody(value: UserFunction): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyFunction1(value: /* repeated */ Any => Callback): Self = StObject.set(x, "body", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setServerScript(value: UserFunction): Self = StObject.set(x, "serverScript", value.asInstanceOf[js.Any])
    
    inline def setServerScriptFunction1(value: /* repeated */ Any => Callback): Self = StObject.set(x, "serverScript", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setServerScriptUndefined: Self = StObject.set(x, "serverScript", js.undefined)
  }
}
