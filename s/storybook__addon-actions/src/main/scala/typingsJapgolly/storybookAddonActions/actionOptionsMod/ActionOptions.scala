package typingsJapgolly.storybookAddonActions.actionOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionOptions extends js.Object {
  var allowFunction: js.UndefOr[Boolean] = js.undefined
  var clearOnStoryChange: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object ActionOptions {
  @scala.inline
  def apply(
    allowFunction: js.UndefOr[Boolean] = js.undefined,
    clearOnStoryChange: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    limit: Int | Double = null
  ): ActionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFunction)) __obj.updateDynamic("allowFunction")(allowFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnStoryChange)) __obj.updateDynamic("clearOnStoryChange")(clearOnStoryChange.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOptions]
  }
}

