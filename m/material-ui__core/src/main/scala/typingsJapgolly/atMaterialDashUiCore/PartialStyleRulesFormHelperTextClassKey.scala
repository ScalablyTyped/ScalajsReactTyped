package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormHelperText.FormHelperTextClassKey>> */
trait PartialStyleRulesFormHelperTextClassKey extends js.Object {
  var contained: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var filled: js.UndefOr[CSSProperties] = js.undefined
  var focused: js.UndefOr[CSSProperties] = js.undefined
  var marginDense: js.UndefOr[CSSProperties] = js.undefined
  var required: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesFormHelperTextClassKey {
  @scala.inline
  def apply(
    contained: CSSProperties = null,
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    filled: CSSProperties = null,
    focused: CSSProperties = null,
    marginDense: CSSProperties = null,
    required: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesFormHelperTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesFormHelperTextClassKey]
  }
}

