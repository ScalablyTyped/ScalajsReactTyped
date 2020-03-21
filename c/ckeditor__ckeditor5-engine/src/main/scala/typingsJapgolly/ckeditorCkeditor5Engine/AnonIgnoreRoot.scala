package typingsJapgolly.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreRoot extends js.Object {
  var ignoreRoot: js.UndefOr[Boolean] = js.undefined
  var renderUIElements: js.UndefOr[Boolean] = js.undefined
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
  var showAttributeElementId: js.UndefOr[Boolean] = js.undefined
  var showPriority: js.UndefOr[Boolean] = js.undefined
  var showType: js.UndefOr[Boolean] = js.undefined
}

object AnonIgnoreRoot {
  @scala.inline
  def apply(
    ignoreRoot: js.UndefOr[Boolean] = js.undefined,
    renderUIElements: js.UndefOr[Boolean] = js.undefined,
    sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined,
    showAttributeElementId: js.UndefOr[Boolean] = js.undefined,
    showPriority: js.UndefOr[Boolean] = js.undefined,
    showType: js.UndefOr[Boolean] = js.undefined
  ): AnonIgnoreRoot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreRoot)) __obj.updateDynamic("ignoreRoot")(ignoreRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(renderUIElements)) __obj.updateDynamic("renderUIElements")(renderUIElements.asInstanceOf[js.Any])
    if (!js.isUndefined(sameSelectionCharacters)) __obj.updateDynamic("sameSelectionCharacters")(sameSelectionCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(showAttributeElementId)) __obj.updateDynamic("showAttributeElementId")(showAttributeElementId.asInstanceOf[js.Any])
    if (!js.isUndefined(showPriority)) __obj.updateDynamic("showPriority")(showPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(showType)) __obj.updateDynamic("showType")(showType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreRoot]
  }
}

