package typingsJapgolly.materialDataTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.materialDataTable.constantsMod.SortValue
import typingsJapgolly.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typingsJapgolly.materialDataTable.typesMod.ProgressIndicatorStyles
import typingsJapgolly.materialDataTable.typesMod.RowClickEventData
import typingsJapgolly.materialDataTable.typesMod.SortActionEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCDataTableAdapter extends StObject {
    
    /**
      * Adds CSS class name to root element.
      *
      * @param className CSS class name to add to root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Adds a class name to row element at given row index excluding header row.
      *
      * @param rowIndex Index of row element excluding header row.
      * @param cssClasses CSS Class string to add.
      */
    def addClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
    
    /**
      * @return Attribute value for given header cell index.
      */
    def getAttributeByHeaderCellIndex(columnIndex: Double, attribute: String): String | Null
    
    /**
      * @return Total count of header cells.
      */
    def getHeaderCellCount(): Double
    
    /**
      * @return Array of header cell elements.
      */
    def getHeaderCellElements(): js.Array[Element]
    
    /**
      * @return Row count excluding header row.
      */
    def getRowCount(): Double
    
    /**
      * @return Array of row elements excluding header row.
      */
    def getRowElements(): js.Array[Element]
    
    /**
      * Returns row id of row element at given row index based on `data-row-id`
      * attribute on row element `tr`.
      *
      * @param rowIndex Index of row element.
      * @return Row id of row element, returns `null` in absence of `data-row-id`
      *     attribute on row element.
      */
    def getRowIdAtIndex(rowIndex: Double): String | Null
    
    /**
      * Returns index of row element that contains give child element. Returns -1
      * if element is not child of any row element.
      *
      * @param el Child element of row element.
      * @return Index of row element.
      */
    def getRowIndexByChildElement(el: Element): Double
    
    /**
      * @return Selected row count.
      */
    def getSelectedRowCount(): Double
    
    /**
      * @return Returns computed styles height of table container element.
      */
    def getTableContainerHeight(): Double
    
    /**
      * @return Returns computed styles height of table's header element.
      */
    def getTableHeaderHeight(): Double
    
    /**
      * @param rowIndex Index of row element.
      * @return True if row checkbox at given row index is checked.
      */
    def isCheckboxAtRowIndexChecked(rowIndex: Double): Boolean
    
    /**
      * @return True if header row checkbox is checked.
      */
    def isHeaderRowCheckboxChecked(): Boolean
    
    /**
      * @return True if table rows are selectable.
      */
    def isRowsSelectable(): Boolean
    
    /**
      * Notifies when data row is clicked.
      */
    def notifyRowClick(detail: RowClickEventData): Unit
    
    /**
      * Notifies when row selection is changed.
      *
      * @param data Event detail data for row selection changed event.
      */
    def notifyRowSelectionChanged(data: MDCDataTableRowSelectionChangedEventDetail): Unit
    
    /**
      * Notifies when header row is checked.
      */
    def notifySelectedAll(): Unit
    
    /**
      * Notifies when column is sorted.
      */
    def notifySortAction(data: SortActionEventDetail): Unit
    
    /**
      * Notifies when header row is unchecked.
      */
    def notifyUnselectedAll(): Unit
    
    /**
      * Initializes header row checkbox. Destroys previous header row checkbox
      * instance if any.
      * @return Can return Promise only if registering checkbox is asynchronous.
      */
    def registerHeaderRowCheckbox(): js.Promise[Unit] | Unit
    
    /**
      * Initializes all row checkboxes. Destroys previous row checkbox instances if
      * any. This is usually called when row checkboxes are added or removed from
      * table.
      * @return Can return Promise only if registering checkbox is asynchronous.
      */
    def registerRowCheckboxes(): js.Promise[Unit] | Unit
    
    /**
      * Removes CSS class name from root element.
      *
      * @param className CSS class name to add to root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Removes class name from row element at give row index.
      *
      * @param rowIndex Index of row element excluding header row element.
      * @param cssClasses Class name string.
      */
    def removeClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
    
    /**
      * Removes a class name of a header cell by index.
      */
    def removeClassNameByHeaderCellIndex(columnIndex: Double, className: String): Unit
    
    /**
      * Sets attribute to row element at given row index.
      *
      * @param rowIndex Index of row element excluding header row element.
      * @param attr Name of attribute.
      * @param value Value of attribute.
      */
    def setAttributeAtRowIndex(rowIndex: Double, attr: String, value: String): Unit
    
    /**
      * Sets attribute of a header cell by index.
      */
    def setAttributeByHeaderCellIndex(columnIndex: Double, attribute: String, value: String): Unit
    
    /**
      * Sets class name of a header cell by index.
      */
    def setClassNameByHeaderCellIndex(columnIndex: Double, className: String): Unit
    
    /**
      * Sets header row checkbox checked or unchecked.
      *
      * @param checked True to set header row checkbox checked.
      */
    def setHeaderRowCheckboxChecked(checked: Boolean): Unit
    
    /**
      * Sets header row checkbox to indeterminate.
      *
      * @param indeterminate True to set header row checkbox indeterminate.
      */
    def setHeaderRowCheckboxIndeterminate(indeterminate: Boolean): Unit
    
    /**
      * Sets progress indicator CSS styles to position it on top of table body.
      */
    def setProgressIndicatorStyles(styles: ProgressIndicatorStyles): Unit
    
    /**
      * Sets row checkbox to checked or unchecked at given row index.
      *
      * @param rowIndex Index of row element excluding header row element.
      * @param checked True to set checked.
      */
    def setRowCheckboxCheckedAtIndex(rowIndex: Double, checked: Boolean): Unit
    
    /**
      * Sets appropriate sort status label by header cell index. Skips setting sort
      * status label if header cell is not sortable.
      *
      * Example status label to set for sortValue:
      *
      *   - `SortValue.ASCENDING`: 'Sorted in ascending order'
      *   - `SortValue.DESCENDING`: 'Sorted in descending order'
      *   - `SortValue.NONE`: '' (Empty string)
      */
    def setSortStatusLabelByHeaderCellIndex(columnIndex: Double, sortValue: SortValue): Unit
  }
  object MDCDataTableAdapter {
    
    inline def apply(
      addClass: String => Callback,
      addClassAtRowIndex: (Double, String) => Callback,
      getAttributeByHeaderCellIndex: (Double, String) => String | Null,
      getHeaderCellCount: CallbackTo[Double],
      getHeaderCellElements: CallbackTo[js.Array[Element]],
      getRowCount: CallbackTo[Double],
      getRowElements: CallbackTo[js.Array[Element]],
      getRowIdAtIndex: Double => String | Null,
      getRowIndexByChildElement: Element => Double,
      getSelectedRowCount: CallbackTo[Double],
      getTableContainerHeight: CallbackTo[Double],
      getTableHeaderHeight: CallbackTo[Double],
      isCheckboxAtRowIndexChecked: Double => Boolean,
      isHeaderRowCheckboxChecked: CallbackTo[Boolean],
      isRowsSelectable: CallbackTo[Boolean],
      notifyRowClick: RowClickEventData => Callback,
      notifyRowSelectionChanged: MDCDataTableRowSelectionChangedEventDetail => Callback,
      notifySelectedAll: Callback,
      notifySortAction: SortActionEventDetail => Callback,
      notifyUnselectedAll: Callback,
      registerHeaderRowCheckbox: CallbackTo[js.Promise[Unit] | Unit],
      registerRowCheckboxes: CallbackTo[js.Promise[Unit] | Unit],
      removeClass: String => Callback,
      removeClassAtRowIndex: (Double, String) => Callback,
      removeClassNameByHeaderCellIndex: (Double, String) => Callback,
      setAttributeAtRowIndex: (Double, String, String) => Callback,
      setAttributeByHeaderCellIndex: (Double, String, String) => Callback,
      setClassNameByHeaderCellIndex: (Double, String) => Callback,
      setHeaderRowCheckboxChecked: Boolean => Callback,
      setHeaderRowCheckboxIndeterminate: Boolean => Callback,
      setProgressIndicatorStyles: ProgressIndicatorStyles => Callback,
      setRowCheckboxCheckedAtIndex: (Double, Boolean) => Callback,
      setSortStatusLabelByHeaderCellIndex: (Double, SortValue) => Callback
    ): MDCDataTableAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), addClassAtRowIndex = js.Any.fromFunction2((t0: Double, t1: String) => (addClassAtRowIndex(t0, t1)).runNow()), getAttributeByHeaderCellIndex = js.Any.fromFunction2(getAttributeByHeaderCellIndex), getHeaderCellCount = getHeaderCellCount.toJsFn, getHeaderCellElements = getHeaderCellElements.toJsFn, getRowCount = getRowCount.toJsFn, getRowElements = getRowElements.toJsFn, getRowIdAtIndex = js.Any.fromFunction1(getRowIdAtIndex), getRowIndexByChildElement = js.Any.fromFunction1(getRowIndexByChildElement), getSelectedRowCount = getSelectedRowCount.toJsFn, getTableContainerHeight = getTableContainerHeight.toJsFn, getTableHeaderHeight = getTableHeaderHeight.toJsFn, isCheckboxAtRowIndexChecked = js.Any.fromFunction1(isCheckboxAtRowIndexChecked), isHeaderRowCheckboxChecked = isHeaderRowCheckboxChecked.toJsFn, isRowsSelectable = isRowsSelectable.toJsFn, notifyRowClick = js.Any.fromFunction1((t0: RowClickEventData) => notifyRowClick(t0).runNow()), notifyRowSelectionChanged = js.Any.fromFunction1((t0: MDCDataTableRowSelectionChangedEventDetail) => notifyRowSelectionChanged(t0).runNow()), notifySelectedAll = notifySelectedAll.toJsFn, notifySortAction = js.Any.fromFunction1((t0: SortActionEventDetail) => notifySortAction(t0).runNow()), notifyUnselectedAll = notifyUnselectedAll.toJsFn, registerHeaderRowCheckbox = registerHeaderRowCheckbox.toJsFn, registerRowCheckboxes = registerRowCheckboxes.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeClassAtRowIndex = js.Any.fromFunction2((t0: Double, t1: String) => (removeClassAtRowIndex(t0, t1)).runNow()), removeClassNameByHeaderCellIndex = js.Any.fromFunction2((t0: Double, t1: String) => (removeClassNameByHeaderCellIndex(t0, t1)).runNow()), setAttributeAtRowIndex = js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (setAttributeAtRowIndex(t0, t1, t2)).runNow()), setAttributeByHeaderCellIndex = js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (setAttributeByHeaderCellIndex(t0, t1, t2)).runNow()), setClassNameByHeaderCellIndex = js.Any.fromFunction2((t0: Double, t1: String) => (setClassNameByHeaderCellIndex(t0, t1)).runNow()), setHeaderRowCheckboxChecked = js.Any.fromFunction1((t0: Boolean) => setHeaderRowCheckboxChecked(t0).runNow()), setHeaderRowCheckboxIndeterminate = js.Any.fromFunction1((t0: Boolean) => setHeaderRowCheckboxIndeterminate(t0).runNow()), setProgressIndicatorStyles = js.Any.fromFunction1((t0: ProgressIndicatorStyles) => setProgressIndicatorStyles(t0).runNow()), setRowCheckboxCheckedAtIndex = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setRowCheckboxCheckedAtIndex(t0, t1)).runNow()), setSortStatusLabelByHeaderCellIndex = js.Any.fromFunction2((t0: Double, t1: SortValue) => (setSortStatusLabelByHeaderCellIndex(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCDataTableAdapter]
    }
    
    extension [Self <: MDCDataTableAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddClassAtRowIndex(value: (Double, String) => Callback): Self = StObject.set(x, "addClassAtRowIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setGetAttributeByHeaderCellIndex(value: (Double, String) => String | Null): Self = StObject.set(x, "getAttributeByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setGetHeaderCellCount(value: CallbackTo[Double]): Self = StObject.set(x, "getHeaderCellCount", value.toJsFn)
      
      inline def setGetHeaderCellElements(value: CallbackTo[js.Array[Element]]): Self = StObject.set(x, "getHeaderCellElements", value.toJsFn)
      
      inline def setGetRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "getRowCount", value.toJsFn)
      
      inline def setGetRowElements(value: CallbackTo[js.Array[Element]]): Self = StObject.set(x, "getRowElements", value.toJsFn)
      
      inline def setGetRowIdAtIndex(value: Double => String | Null): Self = StObject.set(x, "getRowIdAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetRowIndexByChildElement(value: Element => Double): Self = StObject.set(x, "getRowIndexByChildElement", js.Any.fromFunction1(value))
      
      inline def setGetSelectedRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedRowCount", value.toJsFn)
      
      inline def setGetTableContainerHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getTableContainerHeight", value.toJsFn)
      
      inline def setGetTableHeaderHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getTableHeaderHeight", value.toJsFn)
      
      inline def setIsCheckboxAtRowIndexChecked(value: Double => Boolean): Self = StObject.set(x, "isCheckboxAtRowIndexChecked", js.Any.fromFunction1(value))
      
      inline def setIsHeaderRowCheckboxChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHeaderRowCheckboxChecked", value.toJsFn)
      
      inline def setIsRowsSelectable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRowsSelectable", value.toJsFn)
      
      inline def setNotifyRowClick(value: RowClickEventData => Callback): Self = StObject.set(x, "notifyRowClick", js.Any.fromFunction1((t0: RowClickEventData) => value(t0).runNow()))
      
      inline def setNotifyRowSelectionChanged(value: MDCDataTableRowSelectionChangedEventDetail => Callback): Self = StObject.set(x, "notifyRowSelectionChanged", js.Any.fromFunction1((t0: MDCDataTableRowSelectionChangedEventDetail) => value(t0).runNow()))
      
      inline def setNotifySelectedAll(value: Callback): Self = StObject.set(x, "notifySelectedAll", value.toJsFn)
      
      inline def setNotifySortAction(value: SortActionEventDetail => Callback): Self = StObject.set(x, "notifySortAction", js.Any.fromFunction1((t0: SortActionEventDetail) => value(t0).runNow()))
      
      inline def setNotifyUnselectedAll(value: Callback): Self = StObject.set(x, "notifyUnselectedAll", value.toJsFn)
      
      inline def setRegisterHeaderRowCheckbox(value: CallbackTo[js.Promise[Unit] | Unit]): Self = StObject.set(x, "registerHeaderRowCheckbox", value.toJsFn)
      
      inline def setRegisterRowCheckboxes(value: CallbackTo[js.Promise[Unit] | Unit]): Self = StObject.set(x, "registerRowCheckboxes", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClassAtRowIndex(value: (Double, String) => Callback): Self = StObject.set(x, "removeClassAtRowIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setRemoveClassNameByHeaderCellIndex(value: (Double, String) => Callback): Self = StObject.set(x, "removeClassNameByHeaderCellIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetAttributeAtRowIndex(value: (Double, String, String) => Callback): Self = StObject.set(x, "setAttributeAtRowIndex", js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetAttributeByHeaderCellIndex(value: (Double, String, String) => Callback): Self = StObject.set(x, "setAttributeByHeaderCellIndex", js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetClassNameByHeaderCellIndex(value: (Double, String) => Callback): Self = StObject.set(x, "setClassNameByHeaderCellIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetHeaderRowCheckboxChecked(value: Boolean => Callback): Self = StObject.set(x, "setHeaderRowCheckboxChecked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetHeaderRowCheckboxIndeterminate(value: Boolean => Callback): Self = StObject.set(x, "setHeaderRowCheckboxIndeterminate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetProgressIndicatorStyles(value: ProgressIndicatorStyles => Callback): Self = StObject.set(x, "setProgressIndicatorStyles", js.Any.fromFunction1((t0: ProgressIndicatorStyles) => value(t0).runNow()))
      
      inline def setSetRowCheckboxCheckedAtIndex(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setRowCheckboxCheckedAtIndex", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetSortStatusLabelByHeaderCellIndex(value: (Double, SortValue) => Callback): Self = StObject.set(x, "setSortStatusLabelByHeaderCellIndex", js.Any.fromFunction2((t0: Double, t1: SortValue) => (value(t0, t1)).runNow()))
    }
  }
}
