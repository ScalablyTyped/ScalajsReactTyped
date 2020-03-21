package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Switch.SwitchClassKey>> */
@js.native
trait PartialStyleRulesSwitchCl extends js.Object {
  var bar: js.UndefOr[CSSProperties] = js.native
  var checked: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var icon: js.UndefOr[CSSProperties] = js.native
  var iconChecked: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var switchBase: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesSwitchCl {
  @scala.inline
  def apply(
    bar: CSSProperties = null,
    checked: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    disabled: CSSProperties = null,
    icon: CSSProperties = null,
    iconChecked: CSSProperties = null,
    input: CSSProperties = null,
    root: CSSProperties = null,
    switchBase: CSSProperties = null
  ): PartialStyleRulesSwitchCl = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconChecked != null) __obj.updateDynamic("iconChecked")(iconChecked.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (switchBase != null) __obj.updateDynamic("switchBase")(switchBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesSwitchCl]
  }
}

