package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Backdrop.BackdropClassKey>> */
trait PartialStyleRulesBackdropClassKey extends js.Object {
  var invisible: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesBackdropClassKey {
  @scala.inline
  def apply(invisible: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesBackdropClassKey = {
    val __obj = js.Dynamic.literal()
    if (invisible != null) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesBackdropClassKey]
  }
}

