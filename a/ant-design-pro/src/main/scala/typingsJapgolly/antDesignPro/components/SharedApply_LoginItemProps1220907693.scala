package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.antDesignPro.loginItemMod.LoginItemProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LoginItemProps1220907693 () {
  val componentImport: js.Any
  def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
    `type`: String,
    updateActive: js.Any => Callback,
    buttonText: VdomNode = null,
    countDown: Int | Double = null,
    customprops: js.Any = null,
    defaultValue: String = null,
    getCaptchaButtonText: String = null,
    getCaptchaSecondText: String = null,
    name: String = null,
    onChange: /* e */ js.Any => Callback = null,
    onGetCaptcha: /* event */ js.UndefOr[MouseEvent] => Callback = null,
    onPressEnter: /* e */ js.Any => Callback = null,
    placeholder: String = null,
    rules: js.Array[_] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    LoginItemProps, 
    MountedWithRawType[LoginItemProps, js.Object, RawMounted[LoginItemProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("updateActive")(js.Any.fromFunction1((t0: js.Any) => updateActive(t0).runNow()))
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.rawNode.asInstanceOf[js.Any])
    if (countDown != null) __obj.updateDynamic("countDown")(countDown.asInstanceOf[js.Any])
    if (customprops != null) __obj.updateDynamic("customprops")(customprops.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getCaptchaButtonText != null) __obj.updateDynamic("getCaptchaButtonText")(getCaptchaButtonText.asInstanceOf[js.Any])
    if (getCaptchaSecondText != null) __obj.updateDynamic("getCaptchaSecondText")(getCaptchaSecondText.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ js.Any) => onChange(t0).runNow()))
    if (onGetCaptcha != null) __obj.updateDynamic("onGetCaptcha")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[org.scalajs.dom.raw.MouseEvent]) => onGetCaptcha(t0).runNow()))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1((t0: /* e */ js.Any) => onPressEnter(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignPro.loginItemMod.LoginItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.loginItemMod.LoginItemProps])(children: _*)
  }
}

