package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.authentication_required
import typingsJapgolly.chromeApps.chromeAppsStrings.disabled_
import typingsJapgolly.chromeApps.chromeAppsStrings.initializing
import typingsJapgolly.chromeApps.chromeAppsStrings.running
import typingsJapgolly.chromeApps.chromeAppsStrings.temporary_unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: authentication_required
  var DISABLED: disabled_
  var INITIALIZING: initializing
  var RUNNING: running
  var TEMPORARY_UNAVAILABLE: temporary_unavailable
}

object AnonAUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: authentication_required,
    DISABLED: disabled_,
    INITIALIZING: initializing,
    RUNNING: running,
    TEMPORARY_UNAVAILABLE: temporary_unavailable
  ): AnonAUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INITIALIZING = INITIALIZING.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUTHENTICATIONREQUIRED]
  }
}

