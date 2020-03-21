package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPIN extends js.Object {
  var PIN: typingsJapgolly.chromeApps.chromeAppsStrings.PIN
  var PUK: typingsJapgolly.chromeApps.chromeAppsStrings.PUK
}

object AnonPIN {
  @scala.inline
  def apply(PIN: PIN, PUK: PUK): AnonPIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPIN]
  }
}

