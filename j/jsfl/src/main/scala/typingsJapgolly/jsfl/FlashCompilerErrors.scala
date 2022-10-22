package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashCompilerErrors extends StObject {
  
  def clear(): Any
  
  def save(): Any
}
object FlashCompilerErrors {
  
  inline def apply(clear: CallbackTo[Any], save: CallbackTo[Any]): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, save = save.toJsFn)
    __obj.asInstanceOf[FlashCompilerErrors]
  }
  
  extension [Self <: FlashCompilerErrors](x: Self) {
    
    inline def setClear(value: CallbackTo[Any]): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setSave(value: CallbackTo[Any]): Self = StObject.set(x, "save", value.toJsFn)
  }
}
