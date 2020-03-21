package typingsJapgolly.ngGrid.ngGrid.service

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ngGrid.ngGrid.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortService extends js.Object {
  var colSortFnCache: js.Any
  var isCustomSort: Boolean
  var isSorting: Boolean
  def Sort(sortInfo: ISortInfo, data: js.Any): Unit
  def basicSort(a: js.Any, b: js.Any): Double
  def getSortFn(col: IColumn, data: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
  def guessSortFn(item: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
  def sortAlpha(a: String, b: String): Double
  def sortBool(a: Boolean, b: Boolean): Double
  def sortData(sortInfo: ISortInfo, data: js.Any): Unit
  def sortDate(a: js.Date, b: js.Date): Double
  def sortNumber(a: Double, b: Double): Double
  def sortNumberStr(a: String, b: String): Double
}

object ISortService {
  @scala.inline
  def apply(
    Sort: (ISortInfo, js.Any) => Callback,
    basicSort: (js.Any, js.Any) => CallbackTo[Double],
    colSortFnCache: js.Any,
    getSortFn: (IColumn, js.Any) => CallbackTo[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]],
    guessSortFn: js.Any => CallbackTo[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]],
    isCustomSort: Boolean,
    isSorting: Boolean,
    sortAlpha: (String, String) => CallbackTo[Double],
    sortBool: (Boolean, Boolean) => CallbackTo[Double],
    sortData: (ISortInfo, js.Any) => Callback,
    sortDate: (js.Date, js.Date) => CallbackTo[Double],
    sortNumber: (Double, Double) => CallbackTo[Double],
    sortNumberStr: (String, String) => CallbackTo[Double]
  ): ISortService = {
    val __obj = js.Dynamic.literal(colSortFnCache = colSortFnCache.asInstanceOf[js.Any], isCustomSort = isCustomSort.asInstanceOf[js.Any], isSorting = isSorting.asInstanceOf[js.Any])
    __obj.updateDynamic("Sort")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.service.ISortInfo, t1: js.Any) => Sort(t0, t1).runNow()))
    __obj.updateDynamic("basicSort")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => basicSort(t0, t1).runNow()))
    __obj.updateDynamic("getSortFn")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IColumn, t1: js.Any) => getSortFn(t0, t1).runNow()))
    __obj.updateDynamic("guessSortFn")(js.Any.fromFunction1((t0: js.Any) => guessSortFn(t0).runNow()))
    __obj.updateDynamic("sortAlpha")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sortAlpha(t0, t1).runNow()))
    __obj.updateDynamic("sortBool")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => sortBool(t0, t1).runNow()))
    __obj.updateDynamic("sortData")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.service.ISortInfo, t1: js.Any) => sortData(t0, t1).runNow()))
    __obj.updateDynamic("sortDate")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => sortDate(t0, t1).runNow()))
    __obj.updateDynamic("sortNumber")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => sortNumber(t0, t1).runNow()))
    __obj.updateDynamic("sortNumberStr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sortNumberStr(t0, t1).runNow()))
    __obj.asInstanceOf[ISortService]
  }
}

