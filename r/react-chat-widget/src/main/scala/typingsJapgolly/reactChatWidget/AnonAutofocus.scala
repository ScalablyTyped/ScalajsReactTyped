package typingsJapgolly.reactChatWidget

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutofocus extends js.Object {
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var badge: js.UndefOr[Double] = js.undefined
  var customLauncher: js.UndefOr[ComponentType[js.Function0[Unit]]] = js.undefined
  var fullScreenMode: js.UndefOr[Boolean] = js.undefined
  var handleQuickButtonClicked: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var profileAvatar: js.UndefOr[String] = js.undefined
  var senderPlaceHolder: js.UndefOr[String] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleAvatar: js.UndefOr[String] = js.undefined
  def handleNewUserMessage(userInput: String): Unit
}

object AnonAutofocus {
  @scala.inline
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
    titleAvatar: String = null
  ): AnonAutofocus = {
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
    __obj.asInstanceOf[AnonAutofocus]
  }
}

