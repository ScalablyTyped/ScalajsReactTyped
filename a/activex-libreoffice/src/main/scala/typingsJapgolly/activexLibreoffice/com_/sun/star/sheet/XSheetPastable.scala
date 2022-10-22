package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a sheet into which contents of the clipboard can be pasted.
  * @deprecated Deprecated
  */
trait XSheetPastable
  extends StObject
     with XInterface {
  
  /** pastes the contents of the clipboard at the specified position on the sheet. */
  def paste(aDestination: CellAddress): Unit
  
  /**
    * pastes clipboard data from a cell range into another cell range.
    *
    * The contents of the clipboard must be from a cell range.
    */
  def pasteCellRange(
    aDestination: CellRangeAddress,
    nOperation: PasteOperation,
    nContents: Double,
    bSkipEmpty: Boolean,
    bTranspose: Boolean,
    bAsLink: Boolean,
    nInsert: CellInsertMode
  ): Unit
  
  /** pastes the contents of the clipboard at the specified position on the sheet, using the specified format. */
  def pasteFormat(aDestination: CellAddress, aFormat: String): Unit
}
object XSheetPastable {
  
  inline def apply(
    acquire: Callback,
    paste: CellAddress => Callback,
    pasteCellRange: (CellRangeAddress, PasteOperation, Double, Boolean, Boolean, Boolean, CellInsertMode) => Callback,
    pasteFormat: (CellAddress, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetPastable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, paste = js.Any.fromFunction1((t0: CellAddress) => paste(t0).runNow()), pasteCellRange = js.Any.fromFunction7((t0: CellRangeAddress, t1: PasteOperation, t2: Double, t3: Boolean, t4: Boolean, t5: Boolean, t6: CellInsertMode) => (pasteCellRange(t0, t1, t2, t3, t4, t5, t6)).runNow()), pasteFormat = js.Any.fromFunction2((t0: CellAddress, t1: String) => (pasteFormat(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetPastable]
  }
  
  extension [Self <: XSheetPastable](x: Self) {
    
    inline def setPaste(value: CellAddress => Callback): Self = StObject.set(x, "paste", js.Any.fromFunction1((t0: CellAddress) => value(t0).runNow()))
    
    inline def setPasteCellRange(
      value: (CellRangeAddress, PasteOperation, Double, Boolean, Boolean, Boolean, CellInsertMode) => Callback
    ): Self = StObject.set(x, "pasteCellRange", js.Any.fromFunction7((t0: CellRangeAddress, t1: PasteOperation, t2: Double, t3: Boolean, t4: Boolean, t5: Boolean, t6: CellInsertMode) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setPasteFormat(value: (CellAddress, String) => Callback): Self = StObject.set(x, "pasteFormat", js.Any.fromFunction2((t0: CellAddress, t1: String) => (value(t0, t1)).runNow()))
  }
}
