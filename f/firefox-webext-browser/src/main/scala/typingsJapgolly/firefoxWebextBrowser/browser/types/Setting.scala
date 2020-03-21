package typingsJapgolly.firefoxWebextBrowser.browser.types

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.AnonIncognitoBoolean
import typingsJapgolly.firefoxWebextBrowser.AnonIncognitoSpecific
import typingsJapgolly.firefoxWebextBrowser.AnonScope
import typingsJapgolly.firefoxWebextBrowser.AnonScopeSettingScope
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]]
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: AnonScopeSettingScope): js.Promise[Unit]
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: AnonIncognitoBoolean): js.Promise[AnonIncognitoSpecific]
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: AnonScope): js.Promise[Unit]
}

object Setting {
  @scala.inline
  def apply(
    clear: AnonScopeSettingScope => CallbackTo[js.Promise[Unit]],
    get: AnonIncognitoBoolean => CallbackTo[js.Promise[AnonIncognitoSpecific]],
    onChange: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]],
    set: AnonScope => CallbackTo[js.Promise[Unit]]
  ): Setting = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonScopeSettingScope) => clear(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonIncognitoBoolean) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonScope) => set(t0).runNow()))
    __obj.asInstanceOf[Setting]
  }
}

