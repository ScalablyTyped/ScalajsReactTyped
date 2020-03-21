package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/SnackbarContent.SnackbarContentClassKey>> */
@js.native
trait PartialStyleRulesSnackbarAction extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.native
  var message: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesSnackbarAction {
  @scala.inline
  def apply(action: CSSProperties = null, message: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesSnackbarAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesSnackbarAction]
  }
}

