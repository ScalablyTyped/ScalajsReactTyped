package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to add and remove conditions of a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  * @see com.sun.star.sheet.TableConditionalEntry
  */
trait XSheetConditionalEntries
  extends StObject
     with XIndexAccess {
  
  /**
    * adds a conditional entry to the format.
    *
    * Supported properties are:
    *
    * **ConditionOperator Operator **: contains the operation to perform for this condition.;
    *
    * **string Formula1 **: contains the value or formula for the operation.;
    *
    * **string Formula2 **: contains the second value or formula for the operation (used with ConditionOperator::BETWEEN or ConditionOperator::NOT_BETWEEN
    * operations).;
    *
    * **com::sun::star::table::CellAddress SourcePosition **: contains the base address for relative cell references in formulas.;
    *
    * **string StyleName **: contains the name of the cell style used by this condition.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  def addNew(aConditionalEntry: SeqEquiv[PropertyValue]): Unit
  
  /** clears all condition entries. */
  def clear(): Unit
  
  /** removes a conditional entry from the format. */
  def removeByIndex(nIndex: Double): Unit
}
object XSheetConditionalEntries {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    addNew: SeqEquiv[PropertyValue] => Callback,
    clear: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback
  ): XSheetConditionalEntries = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNew = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => addNew(t0).runNow()), clear = clear.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()))
    __obj.asInstanceOf[XSheetConditionalEntries]
  }
  
  extension [Self <: XSheetConditionalEntries](x: Self) {
    
    inline def setAddNew(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "addNew", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setRemoveByIndex(value: Double => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
