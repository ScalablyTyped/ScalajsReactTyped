package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  */
trait XSheetCondition
  extends StObject
     with XInterface {
  
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula1: String
  
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula2: String
  
  /** returns the operator in the condition. */
  var Operator: ConditionOperator
  
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  var SourcePosition: CellAddress
  
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula1(): String
  
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula2(): String
  
  /** returns the operator in the condition. */
  def getOperator(): ConditionOperator
  
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  def getSourcePosition(): CellAddress
  
  /**
    * sets either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @param aFormula1 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula1(aFormula1: String): Unit
  
  /**
    * if two values are needed for the operator, this method sets the second one.
    * @param aFormula2 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula2(aFormula2: String): Unit
  
  /** sets the operator in the condition. */
  def setOperator(nOperator: ConditionOperator): Unit
  
  /** sets the position in the document which is used as a base for relative references in the formulas. */
  def setSourcePosition(aSourcePosition: CellAddress): Unit
}
object XSheetCondition {
  
  inline def apply(
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    acquire: Callback,
    getFormula1: CallbackTo[String],
    getFormula2: CallbackTo[String],
    getOperator: CallbackTo[ConditionOperator],
    getSourcePosition: CallbackTo[CellAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setFormula1: String => Callback,
    setFormula2: String => Callback,
    setOperator: ConditionOperator => Callback,
    setSourcePosition: CellAddress => Callback
  ): XSheetCondition = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFormula1 = getFormula1.toJsFn, getFormula2 = getFormula2.toJsFn, getOperator = getOperator.toJsFn, getSourcePosition = getSourcePosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFormula1 = js.Any.fromFunction1((t0: String) => setFormula1(t0).runNow()), setFormula2 = js.Any.fromFunction1((t0: String) => setFormula2(t0).runNow()), setOperator = js.Any.fromFunction1((t0: ConditionOperator) => setOperator(t0).runNow()), setSourcePosition = js.Any.fromFunction1((t0: CellAddress) => setSourcePosition(t0).runNow()))
    __obj.asInstanceOf[XSheetCondition]
  }
  
  extension [Self <: XSheetCondition](x: Self) {
    
    inline def setFormula1(value: String): Self = StObject.set(x, "Formula1", value.asInstanceOf[js.Any])
    
    inline def setFormula2(value: String): Self = StObject.set(x, "Formula2", value.asInstanceOf[js.Any])
    
    inline def setGetFormula1(value: CallbackTo[String]): Self = StObject.set(x, "getFormula1", value.toJsFn)
    
    inline def setGetFormula2(value: CallbackTo[String]): Self = StObject.set(x, "getFormula2", value.toJsFn)
    
    inline def setGetOperator(value: CallbackTo[ConditionOperator]): Self = StObject.set(x, "getOperator", value.toJsFn)
    
    inline def setGetSourcePosition(value: CallbackTo[CellAddress]): Self = StObject.set(x, "getSourcePosition", value.toJsFn)
    
    inline def setOperator(value: ConditionOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setSetFormula1(value: String => Callback): Self = StObject.set(x, "setFormula1", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFormula2(value: String => Callback): Self = StObject.set(x, "setFormula2", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetOperator(value: ConditionOperator => Callback): Self = StObject.set(x, "setOperator", js.Any.fromFunction1((t0: ConditionOperator) => value(t0).runNow()))
    
    inline def setSetSourcePosition(value: CellAddress => Callback): Self = StObject.set(x, "setSourcePosition", js.Any.fromFunction1((t0: CellAddress) => value(t0).runNow()))
    
    inline def setSourcePosition(value: CellAddress): Self = StObject.set(x, "SourcePosition", value.asInstanceOf[js.Any])
  }
}
