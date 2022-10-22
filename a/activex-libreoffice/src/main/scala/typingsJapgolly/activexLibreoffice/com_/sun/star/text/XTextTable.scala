package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCell
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XTableColumns
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XTableRows
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages a text table.
  * @see com.sun.star.text.TextTable
  * @see com.sun.star.text.Cell
  */
trait XTextTable
  extends StObject
     with XTextContent {
  
  /** @returns the names of all cells of this text table. */
  val CellNames: SafeArray[String]
  
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  val Columns: XTableColumns
  
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  val Rows: XTableRows
  
  /**
    * creates a text table cursor and returns the {@link XTextTableCursor} interface.
    *
    * Initially the cursor is positioned in the cell with the specified name.
    * @see com.sun.star.text.TextTableCursor
    */
  def createCursorByCellName(aCellName: String): XTextTableCursor
  
  /**
    * @param aCellName is a concatenation of the alphanumeric column name and the index of the row.  Example: The cell in the 4th column and third row has the
    * @returns the {@link com.sun.star.table.XCell} interface of the cell with the specified name.
    * @see com.sun.star.table.Cell
    * @see com.sun.star.table.XCell
    */
  def getCellByName(aCellName: String): XCell
  
  /** @returns the names of all cells of this text table. */
  def getCellNames(): SafeArray[String]
  
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  def getColumns(): XTableColumns
  
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  def getRows(): XTableRows
  
  /**
    * determines the numbers of rows and columns of the text table.
    *
    * This method must be called after the object is created and before the object is insert or attached elsewhere.
    */
  def initialize(nRows: Double, nColumns: Double): Unit
}
object XTextTable {
  
  inline def apply(
    Anchor: XTextRange,
    CellNames: SafeArray[String],
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attach: XTextRange => Callback,
    createCursorByCellName: String => XTextTableCursor,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getCellByName: String => XCell,
    getCellNames: CallbackTo[SafeArray[String]],
    getColumns: CallbackTo[XTableColumns],
    getRows: CallbackTo[XTableRows],
    initialize: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XTextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], CellNames = CellNames.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getCellByName = js.Any.fromFunction1(getCellByName), getCellNames = getCellNames.toJsFn, getColumns = getColumns.toJsFn, getRows = getRows.toJsFn, initialize = js.Any.fromFunction2((t0: Double, t1: Double) => (initialize(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XTextTable]
  }
  
  extension [Self <: XTextTable](x: Self) {
    
    inline def setCellNames(value: SafeArray[String]): Self = StObject.set(x, "CellNames", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: XTableColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setCreateCursorByCellName(value: String => XTextTableCursor): Self = StObject.set(x, "createCursorByCellName", js.Any.fromFunction1(value))
    
    inline def setGetCellByName(value: String => XCell): Self = StObject.set(x, "getCellByName", js.Any.fromFunction1(value))
    
    inline def setGetCellNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getCellNames", value.toJsFn)
    
    inline def setGetColumns(value: CallbackTo[XTableColumns]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setGetRows(value: CallbackTo[XTableRows]): Self = StObject.set(x, "getRows", value.toJsFn)
    
    inline def setInitialize(value: (Double, Double) => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRows(value: XTableRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
  }
}
