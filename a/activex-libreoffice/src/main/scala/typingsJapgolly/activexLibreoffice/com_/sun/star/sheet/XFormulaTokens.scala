package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a formula as token sequence. */
trait XFormulaTokens extends StObject {
  
  /** returns the formula as sequence of tokens. */
  var Tokens: SafeArray[FormulaToken]
  
  /** returns the formula as sequence of tokens. */
  def getTokens(): SafeArray[FormulaToken]
  
  /** sets the formula as sequence of tokens. */
  def setTokens(aTokens: SeqEquiv[FormulaToken]): Unit
}
object XFormulaTokens {
  
  inline def apply(
    Tokens: SafeArray[FormulaToken],
    getTokens: CallbackTo[SafeArray[FormulaToken]],
    setTokens: SeqEquiv[FormulaToken] => Callback
  ): XFormulaTokens = {
    val __obj = js.Dynamic.literal(Tokens = Tokens.asInstanceOf[js.Any], getTokens = getTokens.toJsFn, setTokens = js.Any.fromFunction1((t0: SeqEquiv[FormulaToken]) => setTokens(t0).runNow()))
    __obj.asInstanceOf[XFormulaTokens]
  }
  
  extension [Self <: XFormulaTokens](x: Self) {
    
    inline def setGetTokens(value: CallbackTo[SafeArray[FormulaToken]]): Self = StObject.set(x, "getTokens", value.toJsFn)
    
    inline def setSetTokens(value: SeqEquiv[FormulaToken] => Callback): Self = StObject.set(x, "setTokens", js.Any.fromFunction1((t0: SeqEquiv[FormulaToken]) => value(t0).runNow()))
    
    inline def setTokens(value: SafeArray[FormulaToken]): Self = StObject.set(x, "Tokens", value.asInstanceOf[js.Any])
  }
}
