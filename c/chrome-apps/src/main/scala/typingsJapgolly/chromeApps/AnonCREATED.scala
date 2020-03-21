package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chromeAppsStrings.changed_
import typingsJapgolly.chromeApps.chromeAppsStrings.created
import typingsJapgolly.chromeApps.chromeAppsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCREATED extends js.Object {
  var CHANGED: changed_
  var CREATED: created
  var REMOVED: removed
}

object AnonCREATED {
  @scala.inline
  def apply(CHANGED: changed_, CREATED: created, REMOVED: removed): AnonCREATED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], CREATED = CREATED.asInstanceOf[js.Any], REMOVED = REMOVED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCREATED]
  }
}

