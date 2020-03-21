package typingsJapgolly.reactForm.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactText
import typingsJapgolly.reactForm.FieldPropschildrenpropsFi
import typingsJapgolly.reactForm.mod.FieldApi
import typingsJapgolly.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup {
  def apply(
    errorBefore: js.UndefOr[Boolean] = js.undefined,
    field: String | (js.Array[js.Array[ReactText] | ReactText | String]) = null,
    isForm: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn = null
  ): UnmountedWithRoot[
    FieldPropschildrenpropsFi, 
    typingsJapgolly.reactForm.mod.RadioGroup, 
    Unit, 
    FieldPropschildrenpropsFi
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactForm.FieldPropschildrenpropsFi, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactForm.mod.RadioGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactForm.FieldPropschildrenpropsFi])
  }
  @JSImport("react-form", "RadioGroup")
  @js.native
  object componentImport extends js.Object
  
}

