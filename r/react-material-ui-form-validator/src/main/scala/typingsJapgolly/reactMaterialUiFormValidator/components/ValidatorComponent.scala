package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorComponent {
  def apply(
    name: String,
    value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    errorMessages: js.Array[_] | String = null,
    validatorListener: /* isValid */ Boolean => Callback = null,
    validators: js.Array[_] = null,
    withRequiredValidator: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ValidatorComponentProps, 
    typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponent, 
    Unit, 
    ValidatorComponentProps
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    if (validatorListener != null) __obj.updateDynamic("validatorListener")(js.Any.fromFunction1((t0: /* isValid */ scala.Boolean) => validatorListener(t0).runNow()))
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (!js.isUndefined(withRequiredValidator)) __obj.updateDynamic("withRequiredValidator")(withRequiredValidator.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps])(children: _*)
  }
  @JSImport("react-material-ui-form-validator", "ValidatorComponent")
  @js.native
  object componentImport extends js.Object
  
}

