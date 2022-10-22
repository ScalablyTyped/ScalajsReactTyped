package typingsJapgolly.chevrotainTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSLMethodOptsWithErr[T]
  extends StObject
     with DSLMethodOpts[T] {
  
  /**
    *  Short title/classification to what is being matched.
    *  Will be used in the error message,.
    *  If none is provided, the error message will include the names of the expected
    *  Tokens sequences which start the method's inner grammar
    */
  var ERR_MSG: js.UndefOr[String] = js.undefined
}
object DSLMethodOptsWithErr {
  
  inline def apply[T](DEF: CallbackTo[T]): DSLMethodOptsWithErr[T] = {
    val __obj = js.Dynamic.literal(DEF = DEF.toJsFn)
    __obj.asInstanceOf[DSLMethodOptsWithErr[T]]
  }
  
  extension [Self <: DSLMethodOptsWithErr[?], T](x: Self & DSLMethodOptsWithErr[T]) {
    
    inline def setERR_MSG(value: String): Self = StObject.set(x, "ERR_MSG", value.asInstanceOf[js.Any])
    
    inline def setERR_MSGUndefined: Self = StObject.set(x, "ERR_MSG", js.undefined)
  }
}
