package typingsJapgolly.sharepoint.SP.UI.ApplicationPages

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ICalendarController extends js.Object {
  def collapseAll(): Unit
  def deleteItem(itemId: String): Unit
  def expandAll(): Unit
  def getActiveScope(): CalendarScope
  def moveToDate(date: String): Unit
  def moveToView(scope: CalendarScope): Unit
  def moveToViewDate(scope: CalendarScope, date: String): Unit
  def moveToViewType(viewType: String): Unit
  def newItemDialog(contentTypeId: String): Unit
  def refreshItems(): Unit
}

object ICalendarController {
  @scala.inline
  def apply(
    collapseAll: Callback,
    deleteItem: String => Callback,
    expandAll: Callback,
    getActiveScope: CallbackTo[CalendarScope],
    moveToDate: String => Callback,
    moveToView: CalendarScope => Callback,
    moveToViewDate: (CalendarScope, String) => Callback,
    moveToViewType: String => Callback,
    newItemDialog: String => Callback,
    refreshItems: Callback
  ): ICalendarController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapseAll")(collapseAll.toJsFn)
    __obj.updateDynamic("deleteItem")(js.Any.fromFunction1((t0: java.lang.String) => deleteItem(t0).runNow()))
    __obj.updateDynamic("expandAll")(expandAll.toJsFn)
    __obj.updateDynamic("getActiveScope")(getActiveScope.toJsFn)
    __obj.updateDynamic("moveToDate")(js.Any.fromFunction1((t0: java.lang.String) => moveToDate(t0).runNow()))
    __obj.updateDynamic("moveToView")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.UI.ApplicationPages.CalendarScope) => moveToView(t0).runNow()))
    __obj.updateDynamic("moveToViewDate")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.UI.ApplicationPages.CalendarScope, t1: java.lang.String) => moveToViewDate(t0, t1).runNow()))
    __obj.updateDynamic("moveToViewType")(js.Any.fromFunction1((t0: java.lang.String) => moveToViewType(t0).runNow()))
    __obj.updateDynamic("newItemDialog")(js.Any.fromFunction1((t0: java.lang.String) => newItemDialog(t0).runNow()))
    __obj.updateDynamic("refreshItems")(refreshItems.toJsFn)
    __obj.asInstanceOf[ICalendarController]
  }
}

