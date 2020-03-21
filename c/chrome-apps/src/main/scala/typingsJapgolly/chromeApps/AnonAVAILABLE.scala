package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.available
import typingsJapgolly.chromeApps.chromeAppsStrings.enabled_
import typingsJapgolly.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAVAILABLE extends js.Object {
  var AVAILABLE: available
  var ENABLED: enabled_
  var UNKNOWN: unknown_
}

object AnonAVAILABLE {
  @scala.inline
  def apply(AVAILABLE: available, ENABLED: enabled_, UNKNOWN: unknown_): AnonAVAILABLE = {
    val __obj = js.Dynamic.literal(AVAILABLE = AVAILABLE.asInstanceOf[js.Any], ENABLED = ENABLED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAVAILABLE]
  }
}

