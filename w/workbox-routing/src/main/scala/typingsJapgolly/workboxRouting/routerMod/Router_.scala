package typingsJapgolly.workboxRouting.routerMod

import org.scalajs.dom.experimental.Response
import typingsJapgolly.std.Map
import typingsJapgolly.workboxRouting.httpmethodMod.HTTPMethod
import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandler
import typingsJapgolly.workboxRouting.routeMod.Route
import typingsJapgolly.workboxRouting.routerMod.Router.FindMatchingRouteOptions
import typingsJapgolly.workboxRouting.routerMod.Router.FindMatchingRouteReturn
import typingsJapgolly.workboxRouting.routerMod.Router.HandleRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/Router", "Router")
@js.native
class Router_ () extends js.Object {
  val routes: Map[HTTPMethod, js.Array[Route[_]]] = js.native
  def addCacheListener(): Unit = js.native
  def addFetchListener(): Unit = js.native
  def findMatchingRoute(options: FindMatchingRouteOptions): js.Object | FindMatchingRouteReturn[_] = js.native
  def handleRequest(options: HandleRequestOptions): js.Promise[js.UndefOr[Response]] = js.native
  def registerRoute(route: Route[_]): Unit = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
  def unregisterRoute(route: Route[_]): Unit = js.native
}

