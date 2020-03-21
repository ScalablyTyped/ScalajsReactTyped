package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.PBC
import typingsJapgolly.chromeApps.chromeAppsStrings.PIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPBC extends js.Object {
  var PBC: typingsJapgolly.chromeApps.chromeAppsStrings.PBC
  var PIN: typingsJapgolly.chromeApps.chromeAppsStrings.PIN
}

object AnonPBC {
  @scala.inline
  def apply(PBC: PBC, PIN: PIN): AnonPBC = {
    val __obj = js.Dynamic.literal(PBC = PBC.asInstanceOf[js.Any], PIN = PIN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPBC]
  }
}

