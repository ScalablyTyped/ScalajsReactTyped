package typingsJapgolly.materialDataTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/data-table.@material/data-table/adapter.MDCDataTableAdapter> */
trait PartialMDCDataTableAdapte extends js.Object {
  var addClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.undefined
  var getRowCount: js.UndefOr[js.Function0[Double]] = js.undefined
  var getRowElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.undefined
  var getRowIdAtIndex: js.UndefOr[js.Function1[/* rowIndex */ Double, String | Null]] = js.undefined
  var getRowIndexByChildElement: js.UndefOr[js.Function1[/* el */ Element, Double]] = js.undefined
  var getSelectedRowCount: js.UndefOr[js.Function0[Double]] = js.undefined
  var isCheckboxAtRowIndexChecked: js.UndefOr[js.Function1[/* rowIndex */ Double, Boolean]] = js.undefined
  var isHeaderRowCheckboxChecked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isRowsSelectable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var notifyRowSelectionChanged: js.UndefOr[js.Function1[/* data */ MDCDataTableRowSelectionChangedEventDetail, Unit]] = js.undefined
  var notifySelectedAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var notifyUnselectedAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var registerHeaderRowCheckbox: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var registerRowCheckboxes: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var removeClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.undefined
  var setAttributeAtRowIndex: js.UndefOr[js.Function3[/* rowIndex */ Double, /* attr */ String, /* value */ String, Unit]] = js.undefined
  var setHeaderRowCheckboxChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var setHeaderRowCheckboxIndeterminate: js.UndefOr[js.Function1[/* indeterminate */ Boolean, Unit]] = js.undefined
  var setRowCheckboxCheckedAtIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* checked */ Boolean, Unit]] = js.undefined
}

object PartialMDCDataTableAdapte {
  @scala.inline
  def apply(
    addClassAtRowIndex: (/* rowIndex */ Double, /* cssClasses */ String) => Callback = null,
    getRowCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getRowElements: js.UndefOr[CallbackTo[js.Array[Element]]] = js.undefined,
    getRowIdAtIndex: /* rowIndex */ Double => CallbackTo[String | Null] = null,
    getRowIndexByChildElement: /* el */ Element => CallbackTo[Double] = null,
    getSelectedRowCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    isCheckboxAtRowIndexChecked: /* rowIndex */ Double => CallbackTo[Boolean] = null,
    isHeaderRowCheckboxChecked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isRowsSelectable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    notifyRowSelectionChanged: /* data */ MDCDataTableRowSelectionChangedEventDetail => Callback = null,
    notifySelectedAll: js.UndefOr[Callback] = js.undefined,
    notifyUnselectedAll: js.UndefOr[Callback] = js.undefined,
    registerHeaderRowCheckbox: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    registerRowCheckboxes: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    removeClassAtRowIndex: (/* rowIndex */ Double, /* cssClasses */ String) => Callback = null,
    setAttributeAtRowIndex: (/* rowIndex */ Double, /* attr */ String, /* value */ String) => Callback = null,
    setHeaderRowCheckboxChecked: /* checked */ Boolean => Callback = null,
    setHeaderRowCheckboxIndeterminate: /* indeterminate */ Boolean => Callback = null,
    setRowCheckboxCheckedAtIndex: (/* rowIndex */ Double, /* checked */ Boolean) => Callback = null
  ): PartialMDCDataTableAdapte = {
    val __obj = js.Dynamic.literal()
    if (addClassAtRowIndex != null) __obj.updateDynamic("addClassAtRowIndex")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* cssClasses */ java.lang.String) => addClassAtRowIndex(t0, t1).runNow()))
    getRowCount.foreach(p => __obj.updateDynamic("getRowCount")(p.toJsFn))
    getRowElements.foreach(p => __obj.updateDynamic("getRowElements")(p.toJsFn))
    if (getRowIdAtIndex != null) __obj.updateDynamic("getRowIdAtIndex")(js.Any.fromFunction1((t0: /* rowIndex */ scala.Double) => getRowIdAtIndex(t0).runNow()))
    if (getRowIndexByChildElement != null) __obj.updateDynamic("getRowIndexByChildElement")(js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.raw.Element) => getRowIndexByChildElement(t0).runNow()))
    getSelectedRowCount.foreach(p => __obj.updateDynamic("getSelectedRowCount")(p.toJsFn))
    if (isCheckboxAtRowIndexChecked != null) __obj.updateDynamic("isCheckboxAtRowIndexChecked")(js.Any.fromFunction1((t0: /* rowIndex */ scala.Double) => isCheckboxAtRowIndexChecked(t0).runNow()))
    isHeaderRowCheckboxChecked.foreach(p => __obj.updateDynamic("isHeaderRowCheckboxChecked")(p.toJsFn))
    isRowsSelectable.foreach(p => __obj.updateDynamic("isRowsSelectable")(p.toJsFn))
    if (notifyRowSelectionChanged != null) __obj.updateDynamic("notifyRowSelectionChanged")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail) => notifyRowSelectionChanged(t0).runNow()))
    notifySelectedAll.foreach(p => __obj.updateDynamic("notifySelectedAll")(p.toJsFn))
    notifyUnselectedAll.foreach(p => __obj.updateDynamic("notifyUnselectedAll")(p.toJsFn))
    registerHeaderRowCheckbox.foreach(p => __obj.updateDynamic("registerHeaderRowCheckbox")(p.toJsFn))
    registerRowCheckboxes.foreach(p => __obj.updateDynamic("registerRowCheckboxes")(p.toJsFn))
    if (removeClassAtRowIndex != null) __obj.updateDynamic("removeClassAtRowIndex")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* cssClasses */ java.lang.String) => removeClassAtRowIndex(t0, t1).runNow()))
    if (setAttributeAtRowIndex != null) __obj.updateDynamic("setAttributeAtRowIndex")(js.Any.fromFunction3((t0: /* rowIndex */ scala.Double, t1: /* attr */ java.lang.String, t2: /* value */ java.lang.String) => setAttributeAtRowIndex(t0, t1, t2).runNow()))
    if (setHeaderRowCheckboxChecked != null) __obj.updateDynamic("setHeaderRowCheckboxChecked")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => setHeaderRowCheckboxChecked(t0).runNow()))
    if (setHeaderRowCheckboxIndeterminate != null) __obj.updateDynamic("setHeaderRowCheckboxIndeterminate")(js.Any.fromFunction1((t0: /* indeterminate */ scala.Boolean) => setHeaderRowCheckboxIndeterminate(t0).runNow()))
    if (setRowCheckboxCheckedAtIndex != null) __obj.updateDynamic("setRowCheckboxCheckedAtIndex")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* checked */ scala.Boolean) => setRowCheckboxCheckedAtIndex(t0, t1).runNow()))
    __obj.asInstanceOf[PartialMDCDataTableAdapte]
  }
}

