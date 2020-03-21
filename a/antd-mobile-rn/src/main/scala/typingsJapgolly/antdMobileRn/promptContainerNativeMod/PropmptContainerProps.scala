package typingsJapgolly.antdMobileRn.promptContainerNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`login-password`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`secure-text`
import typingsJapgolly.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.antdMobileRn.promptDotnativeMod.IPromptStyle
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropmptContainerProps extends js.Object {
  var actions: CallbackOrActions[TextStyle]
  var defaultValue: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[Node] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var placeholders: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[IPromptStyle] = js.undefined
  var title: Node
  var `type`: js.UndefOr[
    typingsJapgolly.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text`
  ] = js.undefined
}

object PropmptContainerProps {
  @scala.inline
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: VdomNode = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    placeholders: js.Array[String] = null,
    styles: IPromptStyle = null,
    title: VdomNode = null,
    `type`: typingsJapgolly.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text` = null
  ): PropmptContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropmptContainerProps]
  }
}

