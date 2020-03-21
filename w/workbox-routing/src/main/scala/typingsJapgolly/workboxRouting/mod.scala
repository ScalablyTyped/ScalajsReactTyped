package typingsJapgolly.workboxRouting

import typingsJapgolly.std.RegExp
import typingsJapgolly.workboxRouting.httpmethodMod.HTTPMethod
import typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typingsJapgolly.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typingsJapgolly.workboxRouting.registerRouteMod.RegisterRouteCapture
import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandler
import typingsJapgolly.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NavigationRoute protected ()
    extends typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @js.native
  class RegExpRoute protected ()
    extends typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Route[MatchReturn] protected ()
    extends typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Router ()
    extends typingsJapgolly.workboxRouting.routerMod.Router
  
  def registerNavigationRoute(cachedAssetUrl: String): typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute = js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute = js.native
  def registerRoute(capture: String): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: RegExp): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegisterRouteCapture): typingsJapgolly.workboxRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[_] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](
    capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn],
    handler: RouteHandler,
    method: HTTPMethod
  ): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
}

