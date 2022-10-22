package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XControlAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a single pane in a view of a spreadsheet document. */
trait SpreadsheetViewPane
  extends StObject
     with XViewPane
     with XCellRangeReferrer
     with XControlAccess
object SpreadsheetViewPane {
  
  inline def apply(
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    ReferredCells: XCellRange,
    VisibleRange: CellRangeAddress,
    acquire: Callback,
    getControl: XControlModel => XControl,
    getFirstVisibleColumn: CallbackTo[Double],
    getFirstVisibleRow: CallbackTo[Double],
    getReferredCells: CallbackTo[XCellRange],
    getVisibleRange: CallbackTo[CellRangeAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setFirstVisibleColumn: Double => Callback,
    setFirstVisibleRow: Double => Callback
  ): SpreadsheetViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], acquire = acquire.toJsFn, getControl = js.Any.fromFunction1(getControl), getFirstVisibleColumn = getFirstVisibleColumn.toJsFn, getFirstVisibleRow = getFirstVisibleRow.toJsFn, getReferredCells = getReferredCells.toJsFn, getVisibleRange = getVisibleRange.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFirstVisibleColumn = js.Any.fromFunction1((t0: Double) => setFirstVisibleColumn(t0).runNow()), setFirstVisibleRow = js.Any.fromFunction1((t0: Double) => setFirstVisibleRow(t0).runNow()))
    __obj.asInstanceOf[SpreadsheetViewPane]
  }
}
