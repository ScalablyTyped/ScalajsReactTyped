package typingsJapgolly.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationNavigateActionPayload extends js.Object {
  // The action to run inside the sub-router
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
}

object NavigationNavigateActionPayload {
  @scala.inline
  def apply(
    routeName: String,
    action: NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): NavigationNavigateActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigateActionPayload]
  }
}

