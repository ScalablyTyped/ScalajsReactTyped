package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.added
import typingsJapgolly.chromeApps.chromeAppsStrings.deleted_
import typingsJapgolly.chromeApps.chromeAppsStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonADDED extends js.Object {
  var ADDED: added
  var DELETED: deleted_
  var UPDATED: updated
}

object AnonADDED {
  @scala.inline
  def apply(ADDED: added, DELETED: deleted_, UPDATED: updated): AnonADDED = {
    val __obj = js.Dynamic.literal(ADDED = ADDED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any], UPDATED = UPDATED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonADDED]
  }
}

