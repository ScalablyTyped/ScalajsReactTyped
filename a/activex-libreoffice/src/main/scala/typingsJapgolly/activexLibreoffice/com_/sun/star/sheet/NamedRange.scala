package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a named range in a spreadsheet document.
  *
  * In fact a named range is a named formula expression. A cell range address is one possible content of a named range.
  * @see com.sun.star.sheet.NamedRanges
  */
trait NamedRange
  extends StObject
     with XNamedRange
     with XCellRangeReferrer {
  
  /**
    * Determines if this defined name represents a shared formula.
    *
    * This special property shall not be used externally. It is used by import and export filters for compatibility with spreadsheet documents containing
    * shared formulas. Shared formulas are shared by several cells to save memory and to decrease file size.
    *
    * A defined name with this property set will not appear in the user interface of Calc, and its name will not appear in cell formulas. A formula
    * referring to this defined name will show the formula definition contained in the name instead.
    * @since OOo 3.0
    */
  var IsSharedFormula: Boolean
  
  /**
    * returns the index used to refer to this name in token arrays.
    *
    * A token describing a defined name shall contain the op-code obtained from the {@link FormulaMapGroupSpecialOffset.NAME} offset and this index as data
    * part.
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.FormulaMapGroupSpecialOffset.NAME
    * @since OOo 3.0
    */
  var TokenIndex: Double
}
object NamedRange {
  
  inline def apply(
    Content: String,
    IsSharedFormula: Boolean,
    Name: String,
    ReferencePosition: CellAddress,
    ReferredCells: XCellRange,
    TokenIndex: Double,
    Type: Double,
    acquire: Callback,
    getContent: CallbackTo[String],
    getName: CallbackTo[String],
    getReferencePosition: CallbackTo[CellAddress],
    getReferredCells: CallbackTo[XCellRange],
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setContent: String => Callback,
    setName: String => Callback,
    setReferencePosition: CellAddress => Callback,
    setType: Double => Callback
  ): NamedRange = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], IsSharedFormula = IsSharedFormula.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReferencePosition = ReferencePosition.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], TokenIndex = TokenIndex.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContent = getContent.toJsFn, getName = getName.toJsFn, getReferencePosition = getReferencePosition.toJsFn, getReferredCells = getReferredCells.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setReferencePosition = js.Any.fromFunction1((t0: CellAddress) => setReferencePosition(t0).runNow()), setType = js.Any.fromFunction1((t0: Double) => setType(t0).runNow()))
    __obj.asInstanceOf[NamedRange]
  }
  
  extension [Self <: NamedRange](x: Self) {
    
    inline def setIsSharedFormula(value: Boolean): Self = StObject.set(x, "IsSharedFormula", value.asInstanceOf[js.Any])
    
    inline def setTokenIndex(value: Double): Self = StObject.set(x, "TokenIndex", value.asInstanceOf[js.Any])
  }
}
