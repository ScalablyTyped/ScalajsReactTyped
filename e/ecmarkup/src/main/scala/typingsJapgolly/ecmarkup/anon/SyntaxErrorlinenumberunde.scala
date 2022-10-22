package typingsJapgolly.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.SyntaxError & {  line :number | undefined,   column :number | undefined} */
trait SyntaxErrorlinenumberunde extends StObject {
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  var column: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
}
object SyntaxErrorlinenumberunde {
  
  inline def apply(message: String, name: String): SyntaxErrorlinenumberunde = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxErrorlinenumberunde]
  }
  
  extension [Self <: SyntaxErrorlinenumberunde](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
