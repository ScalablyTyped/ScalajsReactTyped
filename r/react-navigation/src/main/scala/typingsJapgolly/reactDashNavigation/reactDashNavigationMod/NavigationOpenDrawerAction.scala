package typingsJapgolly.reactDashNavigation.reactDashNavigationMod

import typingsJapgolly.reactDashNavigation.reactDashNavigationStrings.`Navigation/OPEN_DRAWER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOpenDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: `Navigation/OPEN_DRAWER`
}

object NavigationOpenDrawerAction {
  @scala.inline
  def apply(`type`: `Navigation/OPEN_DRAWER`, key: String = null): NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOpenDrawerAction]
  }
}

