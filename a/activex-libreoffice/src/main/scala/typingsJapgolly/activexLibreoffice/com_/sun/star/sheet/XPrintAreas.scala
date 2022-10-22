package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a sheet which has print areas. */
trait XPrintAreas
  extends StObject
     with XInterface {
  
  /** returns a sequence containing all print areas of the sheet. */
  var PrintAreas: SafeArray[CellRangeAddress]
  
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  var PrintTitleColumns: Boolean
  
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  var PrintTitleRows: Boolean
  
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  var TitleColumns: CellRangeAddress
  
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  var TitleRows: CellRangeAddress
  
  /** returns a sequence containing all print areas of the sheet. */
  def getPrintAreas(): SafeArray[CellRangeAddress]
  
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  def getPrintTitleColumns(): Boolean
  
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  def getPrintTitleRows(): Boolean
  
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  def getTitleColumns(): CellRangeAddress
  
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  def getTitleRows(): CellRangeAddress
  
  /**
    * sets the print areas of the sheet.
    *
    * If none of the sheets in a document have print areas, the whole sheets are printed. If any sheet contains print areas, other sheets without print
    * areas are not printed.
    * @param aPrintAreas a sequence containing all print areas for this sheet.
    */
  def setPrintAreas(aPrintAreas: SeqEquiv[CellRangeAddress]): Unit
  
  /**
    * specifies whether the title columns are repeated on all subsequent print pages to the right.
    * @param bPrintTitleColumns if `TRUE` , title columns are repeated on each page.
    */
  def setPrintTitleColumns(bPrintTitleColumns: Boolean): Unit
  
  /**
    * specifies whether the title rows are repeated on all subsequent print pages to the bottom.
    * @param bPrintTitleRows if `TRUE` , title rows are repeated on each page.
    */
  def setPrintTitleRows(bPrintTitleRows: Boolean): Unit
  
  /**
    * specifies a range of columns as title columns range.
    *
    * The rows of the passed range are ignored.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @param aTitleColumns the title columns range.
    */
  def setTitleColumns(aTitleColumns: CellRangeAddress): Unit
  
  /**
    * specifies a range of rows as title rows range.
    *
    * The columns of the passed range are ignored.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @param aTitleRows the title rows range.
    */
  def setTitleRows(aTitleRows: CellRangeAddress): Unit
}
object XPrintAreas {
  
  inline def apply(
    PrintAreas: SafeArray[CellRangeAddress],
    PrintTitleColumns: Boolean,
    PrintTitleRows: Boolean,
    TitleColumns: CellRangeAddress,
    TitleRows: CellRangeAddress,
    acquire: Callback,
    getPrintAreas: CallbackTo[SafeArray[CellRangeAddress]],
    getPrintTitleColumns: CallbackTo[Boolean],
    getPrintTitleRows: CallbackTo[Boolean],
    getTitleColumns: CallbackTo[CellRangeAddress],
    getTitleRows: CallbackTo[CellRangeAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setPrintAreas: SeqEquiv[CellRangeAddress] => Callback,
    setPrintTitleColumns: Boolean => Callback,
    setPrintTitleRows: Boolean => Callback,
    setTitleColumns: CellRangeAddress => Callback,
    setTitleRows: CellRangeAddress => Callback
  ): XPrintAreas = {
    val __obj = js.Dynamic.literal(PrintAreas = PrintAreas.asInstanceOf[js.Any], PrintTitleColumns = PrintTitleColumns.asInstanceOf[js.Any], PrintTitleRows = PrintTitleRows.asInstanceOf[js.Any], TitleColumns = TitleColumns.asInstanceOf[js.Any], TitleRows = TitleRows.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPrintAreas = getPrintAreas.toJsFn, getPrintTitleColumns = getPrintTitleColumns.toJsFn, getPrintTitleRows = getPrintTitleRows.toJsFn, getTitleColumns = getTitleColumns.toJsFn, getTitleRows = getTitleRows.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPrintAreas = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => setPrintAreas(t0).runNow()), setPrintTitleColumns = js.Any.fromFunction1((t0: Boolean) => setPrintTitleColumns(t0).runNow()), setPrintTitleRows = js.Any.fromFunction1((t0: Boolean) => setPrintTitleRows(t0).runNow()), setTitleColumns = js.Any.fromFunction1((t0: CellRangeAddress) => setTitleColumns(t0).runNow()), setTitleRows = js.Any.fromFunction1((t0: CellRangeAddress) => setTitleRows(t0).runNow()))
    __obj.asInstanceOf[XPrintAreas]
  }
  
  extension [Self <: XPrintAreas](x: Self) {
    
    inline def setGetPrintAreas(value: CallbackTo[SafeArray[CellRangeAddress]]): Self = StObject.set(x, "getPrintAreas", value.toJsFn)
    
    inline def setGetPrintTitleColumns(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPrintTitleColumns", value.toJsFn)
    
    inline def setGetPrintTitleRows(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPrintTitleRows", value.toJsFn)
    
    inline def setGetTitleColumns(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getTitleColumns", value.toJsFn)
    
    inline def setGetTitleRows(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getTitleRows", value.toJsFn)
    
    inline def setPrintAreas(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "PrintAreas", value.asInstanceOf[js.Any])
    
    inline def setPrintTitleColumns(value: Boolean): Self = StObject.set(x, "PrintTitleColumns", value.asInstanceOf[js.Any])
    
    inline def setPrintTitleRows(value: Boolean): Self = StObject.set(x, "PrintTitleRows", value.asInstanceOf[js.Any])
    
    inline def setSetPrintAreas(value: SeqEquiv[CellRangeAddress] => Callback): Self = StObject.set(x, "setPrintAreas", js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => value(t0).runNow()))
    
    inline def setSetPrintTitleColumns(value: Boolean => Callback): Self = StObject.set(x, "setPrintTitleColumns", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetPrintTitleRows(value: Boolean => Callback): Self = StObject.set(x, "setPrintTitleRows", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetTitleColumns(value: CellRangeAddress => Callback): Self = StObject.set(x, "setTitleColumns", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setSetTitleRows(value: CellRangeAddress => Callback): Self = StObject.set(x, "setTitleRows", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setTitleColumns(value: CellRangeAddress): Self = StObject.set(x, "TitleColumns", value.asInstanceOf[js.Any])
    
    inline def setTitleRows(value: CellRangeAddress): Self = StObject.set(x, "TitleRows", value.asInstanceOf[js.Any])
  }
}
