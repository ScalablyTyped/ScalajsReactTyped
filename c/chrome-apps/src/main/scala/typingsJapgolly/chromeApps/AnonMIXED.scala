package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.mixed
import typingsJapgolly.chromeApps.chromeAppsStrings.normal
import typingsJapgolly.chromeApps.chromeAppsStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMIXED extends js.Object {
  var MIXED: mixed
  var NORMAL: normal
  var OFF: off
}

object AnonMIXED {
  @scala.inline
  def apply(MIXED: mixed, NORMAL: normal, OFF: off): AnonMIXED = {
    val __obj = js.Dynamic.literal(MIXED = MIXED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMIXED]
  }
}

