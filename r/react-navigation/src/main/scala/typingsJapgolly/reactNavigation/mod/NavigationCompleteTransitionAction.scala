package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCompleteTransitionAction extends NavigationStackAction {
  var key: String
  var `type`: NavigationSlashCOMPLETE_TRANSITION
}

object NavigationCompleteTransitionAction {
  @scala.inline
  def apply(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCompleteTransitionAction]
  }
}

