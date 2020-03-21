package typingsJapgolly.reactForm.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactText
import typingsJapgolly.reactForm.StyledPropschildrenpropsF
import typingsJapgolly.reactForm.mod.FieldApi
import typingsJapgolly.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledRadioGroup {
  def apply(
    errorBefore: js.UndefOr[Boolean] = js.undefined,
    field: String | (js.Array[js.Array[ReactText] | ReactText | String]) = null,
    isForm: js.UndefOr[Boolean] = js.undefined,
    messageBefore: js.UndefOr[Boolean] = js.undefined,
    noMessage: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    touchValidation: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn = null
  ): UnmountedWithRoot[
    StyledPropschildrenpropsF, 
    typingsJapgolly.reactForm.mod.StyledRadioGroup, 
    Unit, 
    StyledPropschildrenpropsF
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm.asInstanceOf[js.Any])
    if (!js.isUndefined(messageBefore)) __obj.updateDynamic("messageBefore")(messageBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(noMessage)) __obj.updateDynamic("noMessage")(noMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(touchValidation)) __obj.updateDynamic("touchValidation")(touchValidation.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactForm.StyledPropschildrenpropsF, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactForm.mod.StyledRadioGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactForm.StyledPropschildrenpropsF])
  }
  @JSImport("react-form", "StyledRadioGroup")
  @js.native
  object componentImport extends js.Object
  
}

