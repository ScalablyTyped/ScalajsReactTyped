package typingsJapgolly.naverWhale.whale.contentSettings

import typingsJapgolly.naverWhale.naverWhaleStrings.allow
import typingsJapgolly.naverWhale.naverWhaleStrings.block
import typingsJapgolly.naverWhale.naverWhaleStrings.session_only
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSetDetails
  extends typingsJapgolly.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_CookieSetDetails: allow | block | session_only
}

object CookieSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | session_only,
    resourceIdentifier: typingsJapgolly.chrome.chrome.contentSettings.ResourceIdentifier = null,
    scope: typingsJapgolly.chrome.chrome.contentSettings.ScopeEnum = null,
    secondaryPattern: String = null
  ): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSetDetails]
  }
}

