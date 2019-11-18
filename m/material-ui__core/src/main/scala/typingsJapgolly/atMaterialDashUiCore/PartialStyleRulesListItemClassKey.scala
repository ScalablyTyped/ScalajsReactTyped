package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItem.ListItemClassKey>> */
trait PartialStyleRulesListItemClassKey extends js.Object {
  var button: js.UndefOr[CSSProperties] = js.undefined
  var container: js.UndefOr[CSSProperties] = js.undefined
  var default: js.UndefOr[CSSProperties] = js.undefined
  var dense: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var divider: js.UndefOr[CSSProperties] = js.undefined
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  var gutters: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var secondaryAction: js.UndefOr[CSSProperties] = js.undefined
  var selected: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesListItemClassKey {
  @scala.inline
  def apply(
    button: CSSProperties = null,
    container: CSSProperties = null,
    default: CSSProperties = null,
    dense: CSSProperties = null,
    disabled: CSSProperties = null,
    divider: CSSProperties = null,
    focusVisible: CSSProperties = null,
    gutters: CSSProperties = null,
    root: CSSProperties = null,
    secondaryAction: CSSProperties = null,
    selected: CSSProperties = null
  ): PartialStyleRulesListItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondaryAction != null) __obj.updateDynamic("secondaryAction")(secondaryAction.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesListItemClassKey]
  }
}

