package typingsJapgolly.materialDataTable.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCDataTableAdapter extends js.Object {
  /**
    * Adds a class name to row element at given row index excluding header row.
    *
    * @param rowIndex Index of row element excluding header row.
    * @param cssClasses CSS Class string to add.
    */
  def addClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
  /**
    * @return Row count excluding header row.
    */
  def getRowCount(): Double
  /**
    * @return Array of row elements excluding header row.
    */
  def getRowElements(): js.Array[Element]
  /**
    * Returns row id of row element at given row index based on `data-row-id` attribute on row element `tr`.
    *
    * @param rowIndex Index of row element.
    * @return Row id of row element, returns `null` in absence of `data-row-id` attribute on row element.
    */
  def getRowIdAtIndex(rowIndex: Double): String | Null
  /**
    * Returns index of row element that contains give child element. Returns -1 if element is not child of any row
    * element.
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
    * Notifies when header row is unchecked.
    */
  def notifyUnselectedAll(): Unit
  /**
    * Initializes header row checkbox. Destroys previous header row checkbox instance if any.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerHeaderRowCheckbox(): js.Promise[Unit] | Unit
  /**
    * Initializes all row checkboxes. Destroys previous row checkbox instances if any. This is usually called when row
    * checkboxes are added or removed from table.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerRowCheckboxes(): js.Promise[Unit] | Unit
  /**
    * Removes class name from row element at give row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param cssClasses Class name string.
    */
  def removeClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
  /**
    * Sets attribute to row element at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param attr Name of attribute.
    * @param value Value of attribute.
    */
  def setAttributeAtRowIndex(rowIndex: Double, attr: String, value: String): Unit
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
    * Sets row checkbox to checked or unchecked at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param checked True to set checked.
    */
  def setRowCheckboxCheckedAtIndex(rowIndex: Double, checked: Boolean): Unit
}

object MDCDataTableAdapter {
  @scala.inline
  def apply(
    addClassAtRowIndex: (Double, String) => Callback,
    getRowCount: CallbackTo[Double],
    getRowElements: CallbackTo[js.Array[Element]],
    getRowIdAtIndex: Double => CallbackTo[String | Null],
    getRowIndexByChildElement: Element => CallbackTo[Double],
    getSelectedRowCount: CallbackTo[Double],
    isCheckboxAtRowIndexChecked: Double => CallbackTo[Boolean],
    isHeaderRowCheckboxChecked: CallbackTo[Boolean],
    isRowsSelectable: CallbackTo[Boolean],
    notifyRowSelectionChanged: MDCDataTableRowSelectionChangedEventDetail => Callback,
    notifySelectedAll: Callback,
    notifyUnselectedAll: Callback,
    registerHeaderRowCheckbox: CallbackTo[js.Promise[Unit] | Unit],
    registerRowCheckboxes: CallbackTo[js.Promise[Unit] | Unit],
    removeClassAtRowIndex: (Double, String) => Callback,
    setAttributeAtRowIndex: (Double, String, String) => Callback,
    setHeaderRowCheckboxChecked: Boolean => Callback,
    setHeaderRowCheckboxIndeterminate: Boolean => Callback,
    setRowCheckboxCheckedAtIndex: (Double, Boolean) => Callback
  ): MDCDataTableAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClassAtRowIndex")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => addClassAtRowIndex(t0, t1).runNow()))
    __obj.updateDynamic("getRowCount")(getRowCount.toJsFn)
    __obj.updateDynamic("getRowElements")(getRowElements.toJsFn)
    __obj.updateDynamic("getRowIdAtIndex")(js.Any.fromFunction1((t0: scala.Double) => getRowIdAtIndex(t0).runNow()))
    __obj.updateDynamic("getRowIndexByChildElement")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => getRowIndexByChildElement(t0).runNow()))
    __obj.updateDynamic("getSelectedRowCount")(getSelectedRowCount.toJsFn)
    __obj.updateDynamic("isCheckboxAtRowIndexChecked")(js.Any.fromFunction1((t0: scala.Double) => isCheckboxAtRowIndexChecked(t0).runNow()))
    __obj.updateDynamic("isHeaderRowCheckboxChecked")(isHeaderRowCheckboxChecked.toJsFn)
    __obj.updateDynamic("isRowsSelectable")(isRowsSelectable.toJsFn)
    __obj.updateDynamic("notifyRowSelectionChanged")(js.Any.fromFunction1((t0: typingsJapgolly.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail) => notifyRowSelectionChanged(t0).runNow()))
    __obj.updateDynamic("notifySelectedAll")(notifySelectedAll.toJsFn)
    __obj.updateDynamic("notifyUnselectedAll")(notifyUnselectedAll.toJsFn)
    __obj.updateDynamic("registerHeaderRowCheckbox")(registerHeaderRowCheckbox.toJsFn)
    __obj.updateDynamic("registerRowCheckboxes")(registerRowCheckboxes.toJsFn)
    __obj.updateDynamic("removeClassAtRowIndex")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => removeClassAtRowIndex(t0, t1).runNow()))
    __obj.updateDynamic("setAttributeAtRowIndex")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => setAttributeAtRowIndex(t0, t1, t2).runNow()))
    __obj.updateDynamic("setHeaderRowCheckboxChecked")(js.Any.fromFunction1((t0: scala.Boolean) => setHeaderRowCheckboxChecked(t0).runNow()))
    __obj.updateDynamic("setHeaderRowCheckboxIndeterminate")(js.Any.fromFunction1((t0: scala.Boolean) => setHeaderRowCheckboxIndeterminate(t0).runNow()))
    __obj.updateDynamic("setRowCheckboxCheckedAtIndex")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => setRowCheckboxCheckedAtIndex(t0, t1).runNow()))
    __obj.asInstanceOf[MDCDataTableAdapter]
  }
}

