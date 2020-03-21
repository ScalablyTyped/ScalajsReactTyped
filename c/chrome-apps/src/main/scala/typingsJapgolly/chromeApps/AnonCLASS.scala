package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.`class`
import typingsJapgolly.chromeApps.chromeAppsStrings.reserved
import typingsJapgolly.chromeApps.chromeAppsStrings.standard
import typingsJapgolly.chromeApps.chromeAppsStrings.vendor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCLASS extends js.Object {
  var CLASS: `class`
  var RESERVED: reserved
  var STANDARD: standard
  var VENDOR: vendor
}

object AnonCLASS {
  @scala.inline
  def apply(CLASS: `class`, RESERVED: reserved, STANDARD: standard, VENDOR: vendor): AnonCLASS = {
    val __obj = js.Dynamic.literal(CLASS = CLASS.asInstanceOf[js.Any], RESERVED = RESERVED.asInstanceOf[js.Any], STANDARD = STANDARD.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCLASS]
  }
}

