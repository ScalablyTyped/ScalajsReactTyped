package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonINVALIDPIN extends js.Object {
  var INVALID_PIN: typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
  var INVALID_PUK: typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
  var MAX_ATTEMPTS_EXCEEDED: typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
  var UNKNOWN_ERROR: typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
}

object AnonINVALIDPIN {
  @scala.inline
  def apply(
    INVALID_PIN: INVALID_PIN,
    INVALID_PUK: INVALID_PUK,
    MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED,
    UNKNOWN_ERROR: UNKNOWN_ERROR
  ): AnonINVALIDPIN = {
    val __obj = js.Dynamic.literal(INVALID_PIN = INVALID_PIN.asInstanceOf[js.Any], INVALID_PUK = INVALID_PUK.asInstanceOf[js.Any], MAX_ATTEMPTS_EXCEEDED = MAX_ATTEMPTS_EXCEEDED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonINVALIDPIN]
  }
}

