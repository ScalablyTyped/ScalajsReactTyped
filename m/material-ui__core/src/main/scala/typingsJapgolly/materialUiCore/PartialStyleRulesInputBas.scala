package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputBase.InputBaseClassKey>> */
@js.native
trait PartialStyleRulesInputBas extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var focused: js.UndefOr[CSSProperties] = js.native
  var formControl: js.UndefOr[CSSProperties] = js.native
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var inputDisabled: js.UndefOr[CSSProperties] = js.native
  var inputMarginDense: js.UndefOr[CSSProperties] = js.native
  var inputMultiline: js.UndefOr[CSSProperties] = js.native
  var inputType: js.UndefOr[CSSProperties] = js.native
  var inputTypeSearch: js.UndefOr[CSSProperties] = js.native
  var multiline: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesInputBas {
  @scala.inline
  def apply(
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    focused: CSSProperties = null,
    formControl: CSSProperties = null,
    fullWidth: CSSProperties = null,
    input: CSSProperties = null,
    inputDisabled: CSSProperties = null,
    inputMarginDense: CSSProperties = null,
    inputMultiline: CSSProperties = null,
    inputType: CSSProperties = null,
    inputTypeSearch: CSSProperties = null,
    multiline: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesInputBas = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (formControl != null) __obj.updateDynamic("formControl")(formControl.asInstanceOf[js.Any])
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputDisabled != null) __obj.updateDynamic("inputDisabled")(inputDisabled.asInstanceOf[js.Any])
    if (inputMarginDense != null) __obj.updateDynamic("inputMarginDense")(inputMarginDense.asInstanceOf[js.Any])
    if (inputMultiline != null) __obj.updateDynamic("inputMultiline")(inputMultiline.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputTypeSearch != null) __obj.updateDynamic("inputTypeSearch")(inputTypeSearch.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesInputBas]
  }
}

