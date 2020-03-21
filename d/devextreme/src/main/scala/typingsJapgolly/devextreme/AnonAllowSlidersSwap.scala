package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.onMoving
import typingsJapgolly.devextreme.devextremeStrings.onMovingComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowSlidersSwap extends js.Object {
  var allowSlidersSwap: js.UndefOr[Boolean] = js.undefined
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  var callValueChanged: js.UndefOr[onMoving | onMovingComplete] = js.undefined
  var manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  var moveSelectedRangeByClick: js.UndefOr[Boolean] = js.undefined
  var snapToTicks: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowSlidersSwap {
  @scala.inline
  def apply(
    allowSlidersSwap: js.UndefOr[Boolean] = js.undefined,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    callValueChanged: onMoving | onMovingComplete = null,
    manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    moveSelectedRangeByClick: js.UndefOr[Boolean] = js.undefined,
    snapToTicks: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowSlidersSwap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSlidersSwap)) __obj.updateDynamic("allowSlidersSwap")(allowSlidersSwap.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.asInstanceOf[js.Any])
    if (callValueChanged != null) __obj.updateDynamic("callValueChanged")(callValueChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(manualRangeSelectionEnabled)) __obj.updateDynamic("manualRangeSelectionEnabled")(manualRangeSelectionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(moveSelectedRangeByClick)) __obj.updateDynamic("moveSelectedRangeByClick")(moveSelectedRangeByClick.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToTicks)) __obj.updateDynamic("snapToTicks")(snapToTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowSlidersSwap]
  }
}

