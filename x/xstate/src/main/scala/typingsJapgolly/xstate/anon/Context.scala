package typingsJapgolly.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[TContext] extends StObject {
  
  var context: TContext
  
  var value: Any
}
object Context {
  
  inline def apply[TContext](context: TContext, value: Any): Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TContext]]
  }
  
  extension [Self <: Context[?], TContext](x: Self & Context[TContext]) {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
