package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calculate extends StObject {
  
  /** Add the custom formulas with function in CalcEngine library
    * @param {string} pass the formula name
    * @param {string} pass the custom function name to call
    * @returns {void}
    */
  def addCustomFunction(FormulaName: String, FunctionName: String): Unit
  
  /** Adds a named range to the NamedRanges collection
    * @param {string} pass the namedRange's name
    * @param {string} pass the cell range of NamedRange
    * @returns {void}
    */
  def addNamedRange(Name: String, cellRange: String): Unit
  
  /** Accepts a possible parsed formula and returns the calculated value without quotes.
    * @param {string} pass the cell range to adjust its range
    * @returns {string}
    */
  def adjustRangeArg(Name: String): String
  
  /** When a formula cell changes, call this method to clear it from its dependent cells.
    * @param {string} pass the changed cell address
    * @returns {void}
    */
  def clearFormulaDependentCells(Cell: String): Unit
  
  /** Call this method to clear whether an exception was raised during the computation of a library function.
    * @returns {void}
    */
  def clearLibraryComputationException(): Unit
  
  /** Get the column index from a cell reference passed in.
    * @param {string} pass the cell address
    * @returns {void}
    */
  def colIndex(Cell: String): Unit
  
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computeFormula(Formula: String): String
  
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computedValue(Formula: String): String
  
  var defaults: Model
  
  var model: Model
}
object Calculate {
  
  inline def apply(
    addCustomFunction: (String, String) => Callback,
    addNamedRange: (String, String) => Callback,
    adjustRangeArg: String => String,
    clearFormulaDependentCells: String => Callback,
    clearLibraryComputationException: Callback,
    colIndex: String => Callback,
    computeFormula: String => String,
    computedValue: String => String,
    defaults: typingsJapgolly.ejWebAll.ej.Model,
    model: typingsJapgolly.ejWebAll.ej.Model
  ): Calculate = {
    val __obj = js.Dynamic.literal(addCustomFunction = js.Any.fromFunction2((t0: String, t1: String) => (addCustomFunction(t0, t1)).runNow()), addNamedRange = js.Any.fromFunction2((t0: String, t1: String) => (addNamedRange(t0, t1)).runNow()), adjustRangeArg = js.Any.fromFunction1(adjustRangeArg), clearFormulaDependentCells = js.Any.fromFunction1((t0: String) => clearFormulaDependentCells(t0).runNow()), clearLibraryComputationException = clearLibraryComputationException.toJsFn, colIndex = js.Any.fromFunction1((t0: String) => colIndex(t0).runNow()), computeFormula = js.Any.fromFunction1(computeFormula), computedValue = js.Any.fromFunction1(computedValue), defaults = defaults.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculate]
  }
  
  extension [Self <: Calculate](x: Self) {
    
    inline def setAddCustomFunction(value: (String, String) => Callback): Self = StObject.set(x, "addCustomFunction", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddNamedRange(value: (String, String) => Callback): Self = StObject.set(x, "addNamedRange", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAdjustRangeArg(value: String => String): Self = StObject.set(x, "adjustRangeArg", js.Any.fromFunction1(value))
    
    inline def setClearFormulaDependentCells(value: String => Callback): Self = StObject.set(x, "clearFormulaDependentCells", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClearLibraryComputationException(value: Callback): Self = StObject.set(x, "clearLibraryComputationException", value.toJsFn)
    
    inline def setColIndex(value: String => Callback): Self = StObject.set(x, "colIndex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setComputeFormula(value: String => String): Self = StObject.set(x, "computeFormula", js.Any.fromFunction1(value))
    
    inline def setComputedValue(value: String => String): Self = StObject.set(x, "computedValue", js.Any.fromFunction1(value))
    
    inline def setDefaults(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
  
  trait Model extends StObject
}
