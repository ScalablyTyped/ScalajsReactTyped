package typingsJapgolly.naverWhale.whale.contentSettings

import typingsJapgolly.naverWhale.naverWhaleStrings.allow
import typingsJapgolly.naverWhale.naverWhaleStrings.ask
import typingsJapgolly.naverWhale.naverWhaleStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrophoneSetDetails
  extends typingsJapgolly.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_MicrophoneSetDetails: allow | block | ask
}

object MicrophoneSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | ask,
    resourceIdentifier: typingsJapgolly.chrome.chrome.contentSettings.ResourceIdentifier = null,
    scope: typingsJapgolly.chrome.chrome.contentSettings.ScopeEnum = null,
    secondaryPattern: String = null
  ): MicrophoneSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrophoneSetDetails]
  }
}

