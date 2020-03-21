package typingsJapgolly.uiGrid.mod.saveState

import typingsJapgolly.uiGrid.mod.IFilterOptions
import typingsJapgolly.uiGrid.mod.ISortInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISavedColumn extends js.Object {
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
  var name: String
  var pinned: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[ISortInfo] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ISavedColumn {
  @scala.inline
  def apply(
    name: String,
    filters: js.Array[IFilterOptions] = null,
    pinned: String = null,
    sort: ISortInfo = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ISavedColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedColumn]
  }
}

