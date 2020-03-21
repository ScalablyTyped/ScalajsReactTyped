package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.allPages
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.onClick
import typingsJapgolly.devextreme.devextremeStrings.onLongTap
import typingsJapgolly.devextreme.devextremeStrings.page
import typingsJapgolly.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridSelection extends GridBaseSelection {
  /** Makes selection deferred. */
  var deferred: js.UndefOr[Boolean] = js.undefined
  /** Specifies the mode in which all the records are selected. Applies only if selection.allowSelectAll is true. */
  var selectAllMode: js.UndefOr[allPages | page] = js.undefined
  /** Specifies when to display check boxes in rows. Applies only if selection.mode is "multiple". */
  var showCheckBoxesMode: js.UndefOr[always | none | onClick | onLongTap] = js.undefined
}

object dxDataGridSelection {
  @scala.inline
  def apply(
    allowSelectAll: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    mode: multiple | none | single_ = null,
    selectAllMode: allPages | page = null,
    showCheckBoxesMode: always | none | onClick | onLongTap = null
  ): dxDataGridSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSelectAll)) __obj.updateDynamic("allowSelectAll")(allowSelectAll.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (selectAllMode != null) __obj.updateDynamic("selectAllMode")(selectAllMode.asInstanceOf[js.Any])
    if (showCheckBoxesMode != null) __obj.updateDynamic("showCheckBoxesMode")(showCheckBoxesMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridSelection]
  }
}

