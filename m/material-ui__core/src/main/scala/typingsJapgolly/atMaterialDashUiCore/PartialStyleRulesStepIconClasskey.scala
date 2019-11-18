package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepIcon.StepIconClasskey>> */
trait PartialStyleRulesStepIconClasskey extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.undefined
  var completed: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesStepIconClasskey {
  @scala.inline
  def apply(
    active: CSSProperties = null,
    completed: CSSProperties = null,
    error: CSSProperties = null,
    root: CSSProperties = null,
    text: CSSProperties = null
  ): PartialStyleRulesStepIconClasskey = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesStepIconClasskey]
  }
}

