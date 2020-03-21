package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.FFAddonSDK.NSIException
import typingsJapgolly.jpm.passwordsMod.Credential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormSubmitURL extends js.Object {
  var formSubmitURL: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
  def onComplete(credentials: js.Array[Credential]): js.Any
}

object AnonFormSubmitURL {
  @scala.inline
  def apply(
    onComplete: js.Array[Credential] => CallbackTo[js.Any],
    formSubmitURL: String = null,
    onError: /* error */ NSIException => CallbackTo[js.Any] = null,
    password: String = null,
    passwordField: String = null,
    realm: String = null,
    url: String = null,
    username: String = null,
    usernameField: String = null
  ): AnonFormSubmitURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.jpm.passwordsMod.Credential]) => onComplete(t0).runNow()))
    if (formSubmitURL != null) __obj.updateDynamic("formSubmitURL")(formSubmitURL.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.jpm.FFAddonSDK.NSIException) => onError(t0).runNow()))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormSubmitURL]
  }
}

