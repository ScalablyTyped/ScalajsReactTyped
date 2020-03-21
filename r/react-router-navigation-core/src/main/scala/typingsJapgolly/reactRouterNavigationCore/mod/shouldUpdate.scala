package typingsJapgolly.reactRouterNavigationCore.mod

import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "shouldUpdate")
@js.native
object shouldUpdate extends js.Object {
  def apply(
    currentItem: RouteProps,
    nextItem: RouteProps,
    currentLocation: Location[LocationState],
    nextLocation: Location[LocationState]
  ): Boolean = js.native
}

