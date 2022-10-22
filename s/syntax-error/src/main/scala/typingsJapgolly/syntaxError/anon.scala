package typingsJapgolly.syntaxError

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.SyntaxError & {  line :number,   column :number,   annotated :string, inspect (): string} */
  trait SyntaxErrorlinenumbercolu extends StObject {
    
    var annotated: String
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    var column: Double
    
    def inspect(): String
    
    var line: Double
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object SyntaxErrorlinenumbercolu {
    
    inline def apply(
      annotated: String,
      column: Double,
      inspect: CallbackTo[String],
      line: Double,
      message: String,
      name: String
    ): SyntaxErrorlinenumbercolu = {
      val __obj = js.Dynamic.literal(annotated = annotated.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], inspect = inspect.toJsFn, line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxErrorlinenumbercolu]
    }
    
    extension [Self <: SyntaxErrorlinenumbercolu](x: Self) {
      
      inline def setAnnotated(value: String): Self = StObject.set(x, "annotated", value.asInstanceOf[js.Any])
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
