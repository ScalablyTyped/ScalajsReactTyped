package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link UnoControlGrid} to retrieve the content data that is displayed in the actual control.
  *
  * If you do not need your own model implementation, you can also use the {@link DefaultGridDataModel} .
  * @since OOo 3.3
  */
trait XGridDataModel
  extends StObject
     with XComponent
     with XCloneable {
  
  /** denotes the number of columns for which the model can provide data */
  var ColumnCount: Double
  
  /** denotes the number of rows for which the model can provide data */
  var RowCount: Double
  
  /**
    * retrieves the data for a given cell
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the column or row index do not denote a valid cell position.
    */
  def getCellData(Column: Double, RowIndex: Double): Any
  
  /**
    * retrieves the tool tip to be displayed when the mouse hovers over a given cell
    *
    * At the moment, only string tool tips are supported.
    *
    * If `VOID` is returned here, the cell's content will be displayed as tip, but only if it does not fit into the cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the column or row index do not denote a valid cell position.
    */
  def getCellToolTip(Column: Double, RowIndex: Double): Any
  
  /**
    * retrieves the data for a complete row
    *
    * This method is provided for performance and convenience reasons, it delivers the same result as subsequent calls to {@link getCellData()} would.
    * @param RowIndex the index of the row whose data should is to be retrieved.
    * @throws com::sun::star::lang::IndexOutOfBoundsException of the given row index does not denote a valid row.
    */
  def getRowData(RowIndex: Double): SafeArray[Any]
  
  /**
    * retrieves the heading of a given row
    *
    * A grid control will usually paint a row's title in the header column of the respective row.
    *
    * At the moment, only strings are supported as row headings.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote a valid row.
    */
  def getRowHeading(RowIndex: Double): Any
}
object XGridDataModel {
  
  inline def apply(
    ColumnCount: Double,
    RowCount: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    createClone: CallbackTo[XCloneable],
    dispose: Callback,
    getCellData: (Double, Double) => Any,
    getCellToolTip: (Double, Double) => Any,
    getRowData: Double => SafeArray[Any],
    getRowHeading: Double => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createClone = createClone.toJsFn, dispose = dispose.toJsFn, getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XGridDataModel]
  }
  
  extension [Self <: XGridDataModel](x: Self) {
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
    
    inline def setGetCellData(value: (Double, Double) => Any): Self = StObject.set(x, "getCellData", js.Any.fromFunction2(value))
    
    inline def setGetCellToolTip(value: (Double, Double) => Any): Self = StObject.set(x, "getCellToolTip", js.Any.fromFunction2(value))
    
    inline def setGetRowData(value: Double => SafeArray[Any]): Self = StObject.set(x, "getRowData", js.Any.fromFunction1(value))
    
    inline def setGetRowHeading(value: Double => Any): Self = StObject.set(x, "getRowHeading", js.Any.fromFunction1(value))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "RowCount", value.asInstanceOf[js.Any])
  }
}
