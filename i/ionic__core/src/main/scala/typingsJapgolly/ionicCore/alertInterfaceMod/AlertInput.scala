package typingsJapgolly.ionicCore.alertInterfaceMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.ionicCoreStrings.checkbox
import typingsJapgolly.ionicCore.ionicCoreStrings.radio
import typingsJapgolly.ionicCore.mod.TextFieldTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertInput extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handler: js.UndefOr[js.Function1[/* input */ AlertInput, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String | Double] = js.undefined
  var min: js.UndefOr[String | Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[TextFieldTypes | checkbox | radio] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AlertInput {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handler: /* input */ AlertInput => Callback = null,
    id: String = null,
    label: String = null,
    max: String | Double = null,
    min: String | Double = null,
    name: String = null,
    placeholder: String = null,
    `type`: TextFieldTypes | checkbox | radio = null,
    value: js.Any = null
  ): AlertInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.ionicCore.alertInterfaceMod.AlertInput) => handler(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertInput]
  }
}

