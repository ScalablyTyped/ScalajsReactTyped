package typingsJapgolly.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateOptions extends js.Object {
  var replace: js.UndefOr[Boolean] = js.undefined
  var trigger: js.UndefOr[Boolean] = js.undefined
}

object NavigateOptions {
  @scala.inline
  def apply(replace: js.UndefOr[Boolean] = js.undefined, trigger: js.UndefOr[Boolean] = js.undefined): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(trigger)) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateOptions]
  }
}

