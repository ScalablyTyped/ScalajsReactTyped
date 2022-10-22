package typingsJapgolly.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  def input(): Unit
  
  def reset(): Unit
}
object Input {
  
  inline def apply(input: japgolly.scalajs.react.Callback, reset: japgolly.scalajs.react.Callback): Input = {
    val __obj = js.Dynamic.literal(input = input.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setInput(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "input", value.toJsFn)
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
