package typingsJapgolly.antdMobileRn.checkboxPropsTypeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxPropsType extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, Unit]] = js.undefined
}

object CheckboxPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Callback = null
  ): CheckboxPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.OnChangeParams) => onChange(t0).runNow()))
    __obj.asInstanceOf[CheckboxPropsType]
  }
}

