package typingsJapgolly.atMaterialDashUiCore.formControlFormControlContextMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypes.Margin
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps, @material-ui/core.@material-ui/core/FormControl/FormControlContext.ContextFromPropsKey> */
trait FormControlContextProps extends js.Object {
  var adornedStart: Boolean
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var filled: Boolean
  var focused: Boolean
  var margin: js.UndefOr[Margin] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  def onBlur(): Unit
  def onEmpty(): Unit
  def onFilled(): Unit
  def onFocus(): Unit
}

object FormControlContextProps {
  @scala.inline
  def apply(
    adornedStart: Boolean,
    filled: Boolean,
    focused: Boolean,
    onBlur: Callback,
    onEmpty: Callback,
    onFilled: Callback,
    onFocus: Callback,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    margin: Margin = null,
    required: js.UndefOr[Boolean] = js.undefined,
    variant: standard | outlined | filled = null
  ): FormControlContextProps = {
    val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onEmpty")(onEmpty.toJsFn)
    __obj.updateDynamic("onFilled")(onFilled.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlContextProps]
  }
}

