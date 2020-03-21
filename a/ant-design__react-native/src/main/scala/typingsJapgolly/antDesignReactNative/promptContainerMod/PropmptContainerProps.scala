package typingsJapgolly.antDesignReactNative.promptContainerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.antDesignReactNative.stylePromptMod.PromptStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropmptContainerProps extends WithThemeStyles[PromptStyle] {
  var actions: CallbackOrActions[TextStyle]
  var defaultValue: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[Node] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  var placeholders: js.UndefOr[js.Array[String]] = js.undefined
  var title: Node
  var `type`: js.UndefOr[
    typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
  ] = js.undefined
}

object PropmptContainerProps {
  @scala.inline
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: VdomNode = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onBackHandler: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    placeholders: js.Array[String] = null,
    styles: Partial[PromptStyle] = null,
    title: VdomNode = null,
    `type`: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text` = null
  ): PropmptContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onBackHandler.foreach(p => __obj.updateDynamic("onBackHandler")(p.toJsFn))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropmptContainerProps]
  }
}

