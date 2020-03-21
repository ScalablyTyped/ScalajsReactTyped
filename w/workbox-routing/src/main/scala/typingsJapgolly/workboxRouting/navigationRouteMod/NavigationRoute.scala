package typingsJapgolly.workboxRouting.navigationRouteMod

import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandler
import typingsJapgolly.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/NavigationRoute", "NavigationRoute")
@js.native
class NavigationRoute protected () extends Route[Boolean] {
  def this(handler: RouteHandler) = this()
  def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
}

