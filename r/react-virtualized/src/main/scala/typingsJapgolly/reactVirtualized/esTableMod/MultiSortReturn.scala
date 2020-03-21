package typingsJapgolly.reactVirtualized.esTableMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSortReturn extends js.Object {
  /**
    * Specifies the fields currently responsible for sorting data,
    * In order of importance.
    */
  var sortBy: js.Array[String]
  /**
    * Specifies the direction a specific field is being sorted in.
    */
  var sortDirection: SortDirectionMap
  /**
    * Sort property to be passed to the `Table` component.
    * This function updates `sortBy` and `sortDirection` values.
    */
  def sort(params: SortParams): Unit
}

object MultiSortReturn {
  @scala.inline
  def apply(sort: SortParams => Callback, sortBy: js.Array[String], sortDirection: SortDirectionMap): MultiSortReturn = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esTableMod.SortParams) => sort(t0).runNow()))
    __obj.asInstanceOf[MultiSortReturn]
  }
}

