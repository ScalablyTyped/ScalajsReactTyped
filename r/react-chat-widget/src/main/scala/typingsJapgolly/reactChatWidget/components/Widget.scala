package typingsJapgolly.reactChatWidget.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactChatWidget.AnonAutofocus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Widget {
  def apply(
    handleNewUserMessage: String => Callback,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    badge: Int | Double = null,
    customLauncher: ComponentType[js.Function0[Unit]] = null,
    fullScreenMode: js.UndefOr[Boolean] = js.undefined,
    handleQuickButtonClicked: /* value */ String => Callback = null,
    profileAvatar: String = null,
    senderPlaceHolder: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    subtitle: String = null,
    title: String = null,
    titleAvatar: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonAutofocus, typingsJapgolly.reactChatWidget.mod.Widget, Unit, AnonAutofocus] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("handleNewUserMessage")(js.Any.fromFunction1((t0: java.lang.String) => handleNewUserMessage(t0).runNow()))
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (customLauncher != null) __obj.updateDynamic("customLauncher")(customLauncher.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreenMode)) __obj.updateDynamic("fullScreenMode")(fullScreenMode.asInstanceOf[js.Any])
    if (handleQuickButtonClicked != null) __obj.updateDynamic("handleQuickButtonClicked")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => handleQuickButtonClicked(t0).runNow()))
    if (profileAvatar != null) __obj.updateDynamic("profileAvatar")(profileAvatar.asInstanceOf[js.Any])
    if (senderPlaceHolder != null) __obj.updateDynamic("senderPlaceHolder")(senderPlaceHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAvatar != null) __obj.updateDynamic("titleAvatar")(titleAvatar.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactChatWidget.AnonAutofocus, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactChatWidget.mod.Widget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactChatWidget.AnonAutofocus])(children: _*)
  }
  @JSImport("react-chat-widget", "Widget")
  @js.native
  object componentImport extends js.Object
  
}

