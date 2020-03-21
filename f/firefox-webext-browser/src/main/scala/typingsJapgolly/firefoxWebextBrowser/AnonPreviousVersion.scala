package typingsJapgolly.firefoxWebextBrowser

import typingsJapgolly.firefoxWebextBrowser.browser.runtime.OnInstalledReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousVersion extends js.Object {
  /**
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is
    * 'shared_module_update'.
    * @deprecated Unsupported on Firefox at this time.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if
    * 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  /** The reason that this event is being dispatched. */
  var reason: OnInstalledReason
  /** Indicates whether the addon is installed as a temporary extension. */
  var temporary: Boolean
}

object AnonPreviousVersion {
  @scala.inline
  def apply(reason: OnInstalledReason, temporary: Boolean, id: String = null, previousVersion: String = null): AnonPreviousVersion = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], temporary = temporary.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (previousVersion != null) __obj.updateDynamic("previousVersion")(previousVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousVersion]
  }
}

