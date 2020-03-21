package typingsJapgolly.materialUiCore.formControlContextMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiCore.mod.PropTypes.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps, @material-ui/core.@material-ui/core/FormControl/FormControlContext.ContextFromPropsKey> */
@js.native
trait FormControlContextProps extends js.Object {
  var adornedStart: Boolean = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var filled: Boolean = js.native
  var focused: Boolean = js.native
  var margin: js.UndefOr[Margin] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var variant: js.UndefOr[standard | outlined | filled] = js.native
  def onBlur(): Unit = js.native
  def onEmpty(): Unit = js.native
  def onFilled(): Unit = js.native
  def onFocus(): Unit = js.native
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

