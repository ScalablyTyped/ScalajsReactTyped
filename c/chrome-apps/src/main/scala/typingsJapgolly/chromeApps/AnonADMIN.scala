package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.admin
import typingsJapgolly.chromeApps.chromeAppsStrings.development
import typingsJapgolly.chromeApps.chromeAppsStrings.normal
import typingsJapgolly.chromeApps.chromeAppsStrings.other_
import typingsJapgolly.chromeApps.chromeAppsStrings.sideload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonADMIN extends js.Object {
  var ADMIN: admin
  var DEVELOPMENT: development
  var NORMAL: normal
  var OTHER: other_
  var SIDELOAD: sideload
}

object AnonADMIN {
  @scala.inline
  def apply(ADMIN: admin, DEVELOPMENT: development, NORMAL: normal, OTHER: other_, SIDELOAD: sideload): AnonADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], SIDELOAD = SIDELOAD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonADMIN]
  }
}

