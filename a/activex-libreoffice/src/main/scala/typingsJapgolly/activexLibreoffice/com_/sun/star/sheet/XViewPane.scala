package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a pane in a view of a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XViewPane
  extends StObject
     with XInterface {
  
  /** returns the first column that is visible in the pane. */
  var FirstVisibleColumn: Double
  
  /** returns the first row that is visible in the pane. */
  var FirstVisibleRow: Double
  
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  val VisibleRange: CellRangeAddress
  
  /** returns the first column that is visible in the pane. */
  def getFirstVisibleColumn(): Double
  
  /** returns the first row that is visible in the pane. */
  def getFirstVisibleRow(): Double
  
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  def getVisibleRange(): CellRangeAddress
  
  /** sets the first column that is visible in the pane. */
  def setFirstVisibleColumn(nFirstVisibleColumn: Double): Unit
  
  /** sets the first row that is visible in the pane. */
  def setFirstVisibleRow(nFirstVisibleRow: Double): Unit
}
object XViewPane {
  
  inline def apply(
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    VisibleRange: CellRangeAddress,
    acquire: Callback,
    getFirstVisibleColumn: CallbackTo[Double],
    getFirstVisibleRow: CallbackTo[Double],
    getVisibleRange: CallbackTo[CellRangeAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setFirstVisibleColumn: Double => Callback,
    setFirstVisibleRow: Double => Callback
  ): XViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFirstVisibleColumn = getFirstVisibleColumn.toJsFn, getFirstVisibleRow = getFirstVisibleRow.toJsFn, getVisibleRange = getVisibleRange.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFirstVisibleColumn = js.Any.fromFunction1((t0: Double) => setFirstVisibleColumn(t0).runNow()), setFirstVisibleRow = js.Any.fromFunction1((t0: Double) => setFirstVisibleRow(t0).runNow()))
    __obj.asInstanceOf[XViewPane]
  }
  
  extension [Self <: XViewPane](x: Self) {
    
    inline def setFirstVisibleColumn(value: Double): Self = StObject.set(x, "FirstVisibleColumn", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleRow(value: Double): Self = StObject.set(x, "FirstVisibleRow", value.asInstanceOf[js.Any])
    
    inline def setGetFirstVisibleColumn(value: CallbackTo[Double]): Self = StObject.set(x, "getFirstVisibleColumn", value.toJsFn)
    
    inline def setGetFirstVisibleRow(value: CallbackTo[Double]): Self = StObject.set(x, "getFirstVisibleRow", value.toJsFn)
    
    inline def setGetVisibleRange(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getVisibleRange", value.toJsFn)
    
    inline def setSetFirstVisibleColumn(value: Double => Callback): Self = StObject.set(x, "setFirstVisibleColumn", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFirstVisibleRow(value: Double => Callback): Self = StObject.set(x, "setFirstVisibleRow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setVisibleRange(value: CellRangeAddress): Self = StObject.set(x, "VisibleRange", value.asInstanceOf[js.Any])
  }
}
