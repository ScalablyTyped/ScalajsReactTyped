package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepButton.StepButtonClasskey>> */
trait PartialStyleRulesStepButtonClasskey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.undefined
  var touchRipple: js.UndefOr[CSSProperties] = js.undefined
  var vertical: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesStepButtonClasskey {
  @scala.inline
  def apply(root: CSSProperties = null, touchRipple: CSSProperties = null, vertical: CSSProperties = null): PartialStyleRulesStepButtonClasskey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (touchRipple != null) __obj.updateDynamic("touchRipple")(touchRipple.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesStepButtonClasskey]
  }
}

