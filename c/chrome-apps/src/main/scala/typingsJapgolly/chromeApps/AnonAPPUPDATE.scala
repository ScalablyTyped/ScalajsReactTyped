package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.app_update
import typingsJapgolly.chromeApps.chromeAppsStrings.os_update
import typingsJapgolly.chromeApps.chromeAppsStrings.periodic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAPPUPDATE extends js.Object {
  var APP_UPDATE: app_update
  var OS_UPDATE: os_update
  var PERIODIC: periodic
}

object AnonAPPUPDATE {
  @scala.inline
  def apply(APP_UPDATE: app_update, OS_UPDATE: os_update, PERIODIC: periodic): AnonAPPUPDATE = {
    val __obj = js.Dynamic.literal(APP_UPDATE = APP_UPDATE.asInstanceOf[js.Any], OS_UPDATE = OS_UPDATE.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAPPUPDATE]
  }
}

