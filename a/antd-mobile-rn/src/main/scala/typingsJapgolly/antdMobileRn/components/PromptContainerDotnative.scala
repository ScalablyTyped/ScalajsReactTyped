package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`login-password`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`secure-text`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.default
import typingsJapgolly.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.antdMobileRn.promptContainerNativeMod.PropmptContainerProps
import typingsJapgolly.antdMobileRn.promptDotnativeMod.IPromptStyle
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PromptContainerDotnative {
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: VdomNode = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    placeholders: js.Array[String] = null,
    styles: IPromptStyle = null,
    title: VdomNode = null,
    `type`: default | `login-password` | `secure-text` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PropmptContainerProps, 
    typingsJapgolly.antdMobileRn.promptContainerNativeMod.default, 
    Unit, 
    PropmptContainerProps
  ] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.promptContainerNativeMod.PropmptContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.promptContainerNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.promptContainerNativeMod.PropmptContainerProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

