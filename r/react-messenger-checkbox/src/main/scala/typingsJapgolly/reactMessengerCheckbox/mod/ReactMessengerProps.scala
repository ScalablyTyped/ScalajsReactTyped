package typingsJapgolly.reactMessengerCheckbox.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMessengerProps extends js.Object {
  var allowLogin: js.UndefOr[Boolean] = js.undefined
  var appId: String
  var autoLogAppEvents: js.UndefOr[Boolean] = js.undefined
  var centerAlign: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var onEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var origin: String
  var pageId: String
  var prechecked: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | standard | xlarge] = js.undefined
  var skin: js.UndefOr[light | dark] = js.undefined
  var userRef: String
  var version: js.UndefOr[String] = js.undefined
  var xfbml: js.UndefOr[Boolean] = js.undefined
}

object ReactMessengerProps {
  @scala.inline
  def apply(
    appId: String,
    origin: String,
    pageId: String,
    userRef: String,
    allowLogin: js.UndefOr[Boolean] = js.undefined,
    autoLogAppEvents: js.UndefOr[Boolean] = js.undefined,
    centerAlign: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    onEvent: /* event */ js.Any => Callback = null,
    prechecked: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | standard | xlarge = null,
    skin: light | dark = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined
  ): ReactMessengerProps = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLogin)) __obj.updateDynamic("allowLogin")(allowLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLogAppEvents)) __obj.updateDynamic("autoLogAppEvents")(autoLogAppEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction1((t0: /* event */ js.Any) => onEvent(t0).runNow()))
    if (!js.isUndefined(prechecked)) __obj.updateDynamic("prechecked")(prechecked.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMessengerProps]
  }
}

