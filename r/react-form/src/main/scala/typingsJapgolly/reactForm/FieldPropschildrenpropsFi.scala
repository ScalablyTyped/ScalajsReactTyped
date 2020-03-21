package typingsJapgolly.reactForm

import typingsJapgolly.react.mod.ReactText
import typingsJapgolly.reactForm.mod.FieldApi
import typingsJapgolly.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-form.react-form.FieldProps & {  children ? :(props : react-form.react-form.FieldApi): react-form.react-form.RenderReturn | react-form.react-form.RenderReturn} */
trait FieldPropschildrenpropsFi extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.undefined
  var errorBefore: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.undefined
  var isForm: js.UndefOr[Boolean] = js.undefined
  var showErrors: js.UndefOr[Boolean] = js.undefined
}

object FieldPropschildrenpropsFi {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn = null,
    errorBefore: js.UndefOr[Boolean] = js.undefined,
    field: String | (js.Array[js.Array[ReactText] | ReactText | String]) = null,
    isForm: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined
  ): FieldPropschildrenpropsFi = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPropschildrenpropsFi]
  }
}

