package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.default
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.antDesignReactNative.promptContainerMod.PropmptContainerProps
import typingsJapgolly.antDesignReactNative.stylePromptMod.PromptStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PromptContainer {
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: VdomNode = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onBackHandler: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    placeholders: js.Array[String] = null,
    styles: Partial[PromptStyle] = null,
    title: VdomNode = null,
    `type`: default | `login-password` | `secure-text` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PropmptContainerProps, 
    typingsJapgolly.antDesignReactNative.promptContainerMod.default, 
    Unit, 
    PropmptContainerProps
  ] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onBackHandler.foreach(p => __obj.updateDynamic("onBackHandler")(p.toJsFn))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.promptContainerMod.PropmptContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.promptContainerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.promptContainerMod.PropmptContainerProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

