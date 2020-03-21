package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.conflicting
import typingsJapgolly.chromeApps.chromeAppsStrings.pending
import typingsJapgolly.chromeApps.chromeAppsStrings.synced
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONFLICTING extends js.Object {
  var CONFLICTING: conflicting
  var PENDING: pending
  var SYNCED: synced
}

object AnonCONFLICTING {
  @scala.inline
  def apply(CONFLICTING: conflicting, PENDING: pending, SYNCED: synced): AnonCONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONFLICTING]
  }
}

