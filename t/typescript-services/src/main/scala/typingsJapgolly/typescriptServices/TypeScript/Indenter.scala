package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indenter extends StObject {
  
  def decreaseIndent(): Unit
  
  def getIndent(): String
  
  def increaseIndent(): Unit
  
  var indentAmt: Double
}
object Indenter {
  
  inline def apply(
    decreaseIndent: Callback,
    getIndent: CallbackTo[String],
    increaseIndent: Callback,
    indentAmt: Double
  ): Indenter = {
    val __obj = js.Dynamic.literal(decreaseIndent = decreaseIndent.toJsFn, getIndent = getIndent.toJsFn, increaseIndent = increaseIndent.toJsFn, indentAmt = indentAmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indenter]
  }
  
  extension [Self <: Indenter](x: Self) {
    
    inline def setDecreaseIndent(value: Callback): Self = StObject.set(x, "decreaseIndent", value.toJsFn)
    
    inline def setGetIndent(value: CallbackTo[String]): Self = StObject.set(x, "getIndent", value.toJsFn)
    
    inline def setIncreaseIndent(value: Callback): Self = StObject.set(x, "increaseIndent", value.toJsFn)
    
    inline def setIndentAmt(value: Double): Self = StObject.set(x, "indentAmt", value.asInstanceOf[js.Any])
  }
}
