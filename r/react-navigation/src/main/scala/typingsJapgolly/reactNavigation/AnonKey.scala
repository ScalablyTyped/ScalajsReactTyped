package typingsJapgolly.reactNavigation

import typingsJapgolly.reactNavigation.mod.NavigationAction
import typingsJapgolly.reactNavigation.mod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[T /* <: NavigationParams */] extends js.Object {
  var action: js.UndefOr[NavigationAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[T] = js.undefined
  var routeName: String | AnonAction[T]
}

object AnonKey {
  @scala.inline
  def apply[T /* <: NavigationParams */](
    routeName: String | AnonAction[T],
    action: NavigationAction = null,
    key: String = null,
    params: T = null
  ): AnonKey[T] = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey[T]]
  }
}

