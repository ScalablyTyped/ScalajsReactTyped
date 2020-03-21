package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.android
import typingsJapgolly.chromeApps.chromeAppsStrings.cros
import typingsJapgolly.chromeApps.chromeAppsStrings.linux
import typingsJapgolly.chromeApps.chromeAppsStrings.mac
import typingsJapgolly.chromeApps.chromeAppsStrings.openbsd
import typingsJapgolly.chromeApps.chromeAppsStrings.win
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonANDROID extends js.Object {
  var ANDROID: android
  var CROS: cros
  var LINUX: linux
  var MAC: mac
  var OPENBSD: openbsd
  var WIN: win
}

object AnonANDROID {
  @scala.inline
  def apply(ANDROID: android, CROS: cros, LINUX: linux, MAC: mac, OPENBSD: openbsd, WIN: win): AnonANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], CROS = CROS.asInstanceOf[js.Any], LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], OPENBSD = OPENBSD.asInstanceOf[js.Any], WIN = WIN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonANDROID]
  }
}

