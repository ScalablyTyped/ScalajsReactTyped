package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanel.ExpansionPanelClassKey>> */
@js.native
trait PartialStyleRulesExpansio extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var expanded: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var rounded: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesExpansio {
  @scala.inline
  def apply(
    disabled: CSSProperties = null,
    expanded: CSSProperties = null,
    root: CSSProperties = null,
    rounded: CSSProperties = null
  ): PartialStyleRulesExpansio = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rounded != null) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesExpansio]
  }
}

