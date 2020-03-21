package typingsJapgolly.reactNavigationMaterialBottomTabs

import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoute extends js.Object {
  var route: NavigationRoute[NavigationParams]
}

object AnonRoute {
  @scala.inline
  def apply(route: NavigationRoute[NavigationParams]): AnonRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRoute]
  }
}

