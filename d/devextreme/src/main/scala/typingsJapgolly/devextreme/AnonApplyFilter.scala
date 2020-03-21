package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.onClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyFilter extends js.Object {
  var applyFilter: js.UndefOr[auto | onClick] = js.undefined
  var applyFilterText: js.UndefOr[String] = js.undefined
  var betweenEndText: js.UndefOr[String] = js.undefined
  var betweenStartText: js.UndefOr[String] = js.undefined
  var operationDescriptions: js.UndefOr[AnonBetween] = js.undefined
  var resetOperationText: js.UndefOr[String] = js.undefined
  var showAllText: js.UndefOr[String] = js.undefined
  var showOperationChooser: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonApplyFilter {
  @scala.inline
  def apply(
    applyFilter: auto | onClick = null,
    applyFilterText: String = null,
    betweenEndText: String = null,
    betweenStartText: String = null,
    operationDescriptions: AnonBetween = null,
    resetOperationText: String = null,
    showAllText: String = null,
    showOperationChooser: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonApplyFilter = {
    val __obj = js.Dynamic.literal()
    if (applyFilter != null) __obj.updateDynamic("applyFilter")(applyFilter.asInstanceOf[js.Any])
    if (applyFilterText != null) __obj.updateDynamic("applyFilterText")(applyFilterText.asInstanceOf[js.Any])
    if (betweenEndText != null) __obj.updateDynamic("betweenEndText")(betweenEndText.asInstanceOf[js.Any])
    if (betweenStartText != null) __obj.updateDynamic("betweenStartText")(betweenStartText.asInstanceOf[js.Any])
    if (operationDescriptions != null) __obj.updateDynamic("operationDescriptions")(operationDescriptions.asInstanceOf[js.Any])
    if (resetOperationText != null) __obj.updateDynamic("resetOperationText")(resetOperationText.asInstanceOf[js.Any])
    if (showAllText != null) __obj.updateDynamic("showAllText")(showAllText.asInstanceOf[js.Any])
    if (!js.isUndefined(showOperationChooser)) __obj.updateDynamic("showOperationChooser")(showOperationChooser.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyFilter]
  }
}

