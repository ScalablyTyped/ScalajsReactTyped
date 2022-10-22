package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides handling of array formulas in a cell range. */
trait XArrayFormulaRange
  extends StObject
     with XInterface {
  
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  var ArrayFormula: String
  
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  def getArrayFormula(): String
  
  /**
    * applies the array formula to the entire cell range.
    * @param aFormula the formula that will be applied as array formula. Passing an empty string erases an existing array formula.
    */
  def setArrayFormula(aFormula: String): Unit
}
object XArrayFormulaRange {
  
  inline def apply(
    ArrayFormula: String,
    acquire: Callback,
    getArrayFormula: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setArrayFormula: String => Callback
  ): XArrayFormulaRange = {
    val __obj = js.Dynamic.literal(ArrayFormula = ArrayFormula.asInstanceOf[js.Any], acquire = acquire.toJsFn, getArrayFormula = getArrayFormula.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setArrayFormula = js.Any.fromFunction1((t0: String) => setArrayFormula(t0).runNow()))
    __obj.asInstanceOf[XArrayFormulaRange]
  }
  
  extension [Self <: XArrayFormulaRange](x: Self) {
    
    inline def setArrayFormula(value: String): Self = StObject.set(x, "ArrayFormula", value.asInstanceOf[js.Any])
    
    inline def setGetArrayFormula(value: CallbackTo[String]): Self = StObject.set(x, "getArrayFormula", value.toJsFn)
    
    inline def setSetArrayFormula(value: String => Callback): Self = StObject.set(x, "setArrayFormula", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
