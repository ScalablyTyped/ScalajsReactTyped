package typingsJapgolly.tampermonkey.Tampermonkey

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortHandle[TReturn] extends StObject {
  
  def abort(): TReturn
}
object AbortHandle {
  
  inline def apply[TReturn](abort: CallbackTo[TReturn]): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn)
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
  
  extension [Self <: AbortHandle[?], TReturn](x: Self & AbortHandle[TReturn]) {
    
    inline def setAbort(value: CallbackTo[TReturn]): Self = StObject.set(x, "abort", value.toJsFn)
  }
}
