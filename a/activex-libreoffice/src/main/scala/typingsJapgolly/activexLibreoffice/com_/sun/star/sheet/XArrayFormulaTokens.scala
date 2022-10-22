package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to an array formula as token sequence. */
trait XArrayFormulaTokens extends StObject {
  
  /** returns the array formula as sequence of tokens. */
  var ArrayTokens: SafeArray[FormulaToken]
  
  /** returns the array formula as sequence of tokens. */
  def getArrayTokens(): SafeArray[FormulaToken]
  
  /** sets the array formula as sequence of tokens. */
  def setArrayTokens(aTokens: SeqEquiv[FormulaToken]): Unit
}
object XArrayFormulaTokens {
  
  inline def apply(
    ArrayTokens: SafeArray[FormulaToken],
    getArrayTokens: CallbackTo[SafeArray[FormulaToken]],
    setArrayTokens: SeqEquiv[FormulaToken] => Callback
  ): XArrayFormulaTokens = {
    val __obj = js.Dynamic.literal(ArrayTokens = ArrayTokens.asInstanceOf[js.Any], getArrayTokens = getArrayTokens.toJsFn, setArrayTokens = js.Any.fromFunction1((t0: SeqEquiv[FormulaToken]) => setArrayTokens(t0).runNow()))
    __obj.asInstanceOf[XArrayFormulaTokens]
  }
  
  extension [Self <: XArrayFormulaTokens](x: Self) {
    
    inline def setArrayTokens(value: SafeArray[FormulaToken]): Self = StObject.set(x, "ArrayTokens", value.asInstanceOf[js.Any])
    
    inline def setGetArrayTokens(value: CallbackTo[SafeArray[FormulaToken]]): Self = StObject.set(x, "getArrayTokens", value.toJsFn)
    
    inline def setSetArrayTokens(value: SeqEquiv[FormulaToken] => Callback): Self = StObject.set(x, "setArrayTokens", js.Any.fromFunction1((t0: SeqEquiv[FormulaToken]) => value(t0).runNow()))
  }
}
