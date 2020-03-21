package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorFormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorForm {
  def apply(
    onSubmit: ReactEventFrom[Element] => Callback,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    debounceTime: Int | Double = null,
    instantValidate: js.UndefOr[Boolean] = js.undefined,
    onError: /* errors */ js.Array[js.Any] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ValidatorFormProps, 
    typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorForm, 
    Unit, 
    ValidatorFormProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* errors */ js.Array[js.Any]) => onError(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorFormProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorForm](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorFormProps])(children: _*)
  }
  @JSImport("react-material-ui-form-validator", "ValidatorForm")
  @js.native
  object componentImport extends js.Object
  
}

