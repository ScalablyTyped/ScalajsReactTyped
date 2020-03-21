package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.AnonCHROMEUPDATE
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.chrome_update
import typingsJapgolly.chromeApps.chromeAppsStrings.install
import typingsJapgolly.chromeApps.chromeAppsStrings.shared_module_update
import typingsJapgolly.chromeApps.chromeAppsStrings.update
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledDetails extends js.Object {
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  /**
    * The reason that this event is being dispatched.
    * @see enum OnInstalledReason
    */
  var reason: ToStringLiteral[
    AnonCHROMEUPDATE, 
    String, 
    Exclude[String, install | update | chrome_update | shared_module_update]
  ]
}

object InstalledDetails {
  @scala.inline
  def apply(
    reason: ToStringLiteral[
      AnonCHROMEUPDATE, 
      String, 
      Exclude[String, install | update | chrome_update | shared_module_update]
    ],
    id: String = null,
    previousVersion: String = null
  ): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (previousVersion != null) __obj.updateDynamic("previousVersion")(previousVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledDetails]
  }
}

