package typingsJapgolly.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeSettingClearDetails extends js.Object {
  /**
    * The scope of the ChromeSetting. One of
    * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
    * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted
    *     when the incognito session ends (overrides regular and incognito_persistent preferences).
    */
  var scope: js.UndefOr[ChromeSettingScope] = js.undefined
}

object ChromeSettingClearDetails {
  @scala.inline
  def apply(scope: ChromeSettingScope = null): ChromeSettingClearDetails = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeSettingClearDetails]
  }
}

