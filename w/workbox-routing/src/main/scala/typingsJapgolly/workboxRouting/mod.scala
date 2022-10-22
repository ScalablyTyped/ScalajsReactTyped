package typingsJapgolly.workboxRouting

import typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typingsJapgolly.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typingsJapgolly.workboxRouting.registerRouteMod.RegisterRouteCapture
import typingsJapgolly.workboxRouting.typesHttpmethodMod.HTTPMethod
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandler
import typingsJapgolly.workboxRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-routing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-routing", "NavigationRoute")
  @js.native
  open class NavigationRoute protected ()
    extends typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @JSImport("workbox-routing", "RegExpRoute")
  @js.native
  open class RegExpRoute protected ()
    extends typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @JSImport("workbox-routing", "Route")
  @js.native
  open class Route[MatchReturn] protected ()
    extends typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @JSImport("workbox-routing", "Router")
  @js.native
  open class Router ()
    extends typingsJapgolly.workboxRouting.routerMod.Router
  
  inline def registerNavigationRoute(cachedAssetUrl: String): typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute]
  inline def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.navigationRouteMod.NavigationRoute]
  
  inline def registerRoute(capture: String): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: String, handler: Unit, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: String, handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Boolean]]
  inline def registerRoute(capture: js.RegExp): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: Unit, method: HTTPMethod): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.regExpRouteMod.RegExpRoute]
  inline def registerRoute(capture: RegisterRouteCapture): typingsJapgolly.workboxRouting.routeMod.Route[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: Unit, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[Any]]
  inline def registerRoute[MatchReturn](capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](
    capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn],
    handler: Unit,
    method: HTTPMethod
  ): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](
    capture: typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn],
    handler: RouteHandler,
    method: HTTPMethod
  ): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: Unit, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.workboxRouting.routeMod.Route[MatchReturn]]
  
  inline def setCatchHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCatchHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaultHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
