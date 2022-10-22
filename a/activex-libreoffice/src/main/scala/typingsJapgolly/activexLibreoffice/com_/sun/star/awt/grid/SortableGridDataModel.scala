package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Pair
import typingsJapgolly.activexLibreoffice.com_.sun.star.i18n.XCollator
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a default implementation of a {@link XSortableGridData} .
  *
  * This service must be created with a secondary grid data model, which all actual data requests are delegated to. But before providing this data to the
  * service's own clients, it is sorted, according to the sort order defined via the `XSortableGridData` interface.
  *
  * The service implementation is able to compare the default scalar types, plus strings.
  *
  * For determining the data type of a column which the data should be sorted by, the first non- `VOID` data encountered in this column is taken into
  * account. Further read requests to this column will assume that all non- `VOID` data is of the same type.
  *
  * Consequently, you cannot use this service with data sets containing heterogeneous data in a given column.
  *
  * All requests made via the {@link XMutableGridDataModel} are delegated to the `XMutableGridDataModel` instance passed in the service constructor.
  *
  * Note that changing the data might result in the sort order being destroyed. If you want to ensure that the data represented by the model is still
  * sorted after your modifications, you should call {@link XSortableGridData.sortByColumn()} , again.
  */
trait SortableGridDataModel
  extends StObject
     with XSortableMutableGridDataModel {
  
  /**
    * creates a new instance of the `SortableGridDataModel`
    *
    * For string comparison, a default {@link com.sun.star.i18n.Collator} , based on the system's locale, will be used.
    * @param DelegatorModel the data model to which read requests are delegated.
    * @throws com::sun::star::lang::IllegalArgumentException if the given `DelegatorModel` is `NULL`
    */
  def create(DelegatorModel: XMutableGridDataModel): Unit
  
  /**
    * creates a new instance of the ScortableDefaultGridDataModel, passing a collator to be used for string comparison.
    * @param DelegatorModel is the data model to which read requests are delegated
    * @param Collator is the collator to be used for string comparison
    * @throws com::sun::star::lang::IllegalArgumentException if the given `DelegatorModel` is `NULL`
    */
  def createWithCollator(DelegatorModel: XMutableGridDataModel, Collator: XCollator): Unit
}
object SortableGridDataModel {
  
  inline def apply(
    ColumnCount: Double,
    CurrentSortOrder: Pair[Double, Boolean],
    RowCount: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addGridDataListener: XGridDataListener => Callback,
    addRow: (Any, SeqEquiv[Any]) => Callback,
    addRows: (SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback,
    create: XMutableGridDataModel => Callback,
    createClone: CallbackTo[XCloneable],
    createWithCollator: (XMutableGridDataModel, XCollator) => Callback,
    dispose: Callback,
    getCellData: (Double, Double) => Any,
    getCellToolTip: (Double, Double) => Any,
    getCurrentSortOrder: CallbackTo[Pair[Double, Boolean]],
    getRowData: Double => SafeArray[Any],
    getRowHeading: Double => Any,
    insertRow: (Double, Any, SeqEquiv[Any]) => Callback,
    insertRows: (Double, SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeAllRows: Callback,
    removeColumnSort: Callback,
    removeEventListener: XEventListener => Callback,
    removeGridDataListener: XGridDataListener => Callback,
    removeRow: Double => Callback,
    sortByColumn: (Double, Boolean) => Callback,
    updateCellData: (Double, Double, Any) => Callback,
    updateCellToolTip: (Double, Double, Any) => Callback,
    updateRowData: (SeqEquiv[Double], Double, SeqEquiv[Any]) => Callback,
    updateRowHeading: (Double, Any) => Callback,
    updateRowToolTip: (Double, Any) => Callback
  ): SortableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addGridDataListener = js.Any.fromFunction1((t0: XGridDataListener) => addGridDataListener(t0).runNow()), addRow = js.Any.fromFunction2((t0: Any, t1: SeqEquiv[Any]) => (addRow(t0, t1)).runNow()), addRows = js.Any.fromFunction2((t0: SeqEquiv[Any], t1: SeqEquiv[SeqEquiv[Any]]) => (addRows(t0, t1)).runNow()), create = js.Any.fromFunction1((t0: XMutableGridDataModel) => create(t0).runNow()), createClone = createClone.toJsFn, createWithCollator = js.Any.fromFunction2((t0: XMutableGridDataModel, t1: XCollator) => (createWithCollator(t0, t1)).runNow()), dispose = dispose.toJsFn, getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getCurrentSortOrder = getCurrentSortOrder.toJsFn, getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3((t0: Double, t1: Any, t2: SeqEquiv[Any]) => (insertRow(t0, t1, t2)).runNow()), insertRows = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[Any], t2: SeqEquiv[SeqEquiv[Any]]) => (insertRows(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAllRows = removeAllRows.toJsFn, removeColumnSort = removeColumnSort.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeGridDataListener = js.Any.fromFunction1((t0: XGridDataListener) => removeGridDataListener(t0).runNow()), removeRow = js.Any.fromFunction1((t0: Double) => removeRow(t0).runNow()), sortByColumn = js.Any.fromFunction2((t0: Double, t1: Boolean) => (sortByColumn(t0, t1)).runNow()), updateCellData = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (updateCellData(t0, t1, t2)).runNow()), updateCellToolTip = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (updateCellToolTip(t0, t1, t2)).runNow()), updateRowData = js.Any.fromFunction3((t0: SeqEquiv[Double], t1: Double, t2: SeqEquiv[Any]) => (updateRowData(t0, t1, t2)).runNow()), updateRowHeading = js.Any.fromFunction2((t0: Double, t1: Any) => (updateRowHeading(t0, t1)).runNow()), updateRowToolTip = js.Any.fromFunction2((t0: Double, t1: Any) => (updateRowToolTip(t0, t1)).runNow()))
    __obj.asInstanceOf[SortableGridDataModel]
  }
  
  extension [Self <: SortableGridDataModel](x: Self) {
    
    inline def setCreate(value: XMutableGridDataModel => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: XMutableGridDataModel) => value(t0).runNow()))
    
    inline def setCreateWithCollator(value: (XMutableGridDataModel, XCollator) => Callback): Self = StObject.set(x, "createWithCollator", js.Any.fromFunction2((t0: XMutableGridDataModel, t1: XCollator) => (value(t0, t1)).runNow()))
  }
}
