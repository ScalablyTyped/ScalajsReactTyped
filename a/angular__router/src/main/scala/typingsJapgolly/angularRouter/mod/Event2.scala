package typingsJapgolly.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Router events that allow you to track the lifecycle of the router.
  *
  * The events occur in the following sequence:
  *
  * * [NavigationStart](api/router/NavigationStart): Navigation starts.
  * * [RouteConfigLoadStart](api/router/RouteConfigLoadStart): Before
  * the router [lazy loads](/guide/router#lazy-loading) a route configuration.
  * * [RouteConfigLoadEnd](api/router/RouteConfigLoadEnd): After a route has been lazy loaded.
  * * [RoutesRecognized](api/router/RoutesRecognized): When the router parses the URL
  * and the routes are recognized.
  * * [GuardsCheckStart](api/router/GuardsCheckStart): When the router begins the *guards*
  * phase of routing.
  * * [ChildActivationStart](api/router/ChildActivationStart): When the router
  * begins activating a route's children.
  * * [ActivationStart](api/router/ActivationStart): When the router begins activating a route.
  * * [GuardsCheckEnd](api/router/GuardsCheckEnd): When the router finishes the *guards*
  * phase of routing successfully.
  * * [ResolveStart](api/router/ResolveStart): When the router begins the *resolve*
  * phase of routing.
  * * [ResolveEnd](api/router/ResolveEnd): When the router finishes the *resolve*
  * phase of routing successfully.
  * * [ChildActivationEnd](api/router/ChildActivationEnd): When the router finishes
  * activating a route's children.
  * * [ActivationEnd](api/router/ActivationEnd): When the router finishes activating a route.
  * * [NavigationEnd](api/router/NavigationEnd): When navigation ends successfully.
  * * [NavigationCancel](api/router/NavigationCancel): When navigation is canceled.
  * * [NavigationError](api/router/NavigationError): When navigation fails
  * due to an unexpected error.
  * * [Scroll](api/router/Scroll): When the user scrolls.
  *
  * @publicApi
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularRouter.mod.RouterEvent
  - typingsJapgolly.angularRouter.mod.NavigationStart
  - typingsJapgolly.angularRouter.mod.NavigationEnd
  - typingsJapgolly.angularRouter.mod.NavigationCancel
  - typingsJapgolly.angularRouter.mod.NavigationError
  - typingsJapgolly.angularRouter.mod.RoutesRecognized
  - typingsJapgolly.angularRouter.mod.GuardsCheckStart
  - typingsJapgolly.angularRouter.mod.GuardsCheckEnd
  - typingsJapgolly.angularRouter.mod.RouteConfigLoadStart
  - typingsJapgolly.angularRouter.mod.RouteConfigLoadEnd
  - typingsJapgolly.angularRouter.mod.ChildActivationStart
  - typingsJapgolly.angularRouter.mod.ChildActivationEnd
  - typingsJapgolly.angularRouter.mod.ActivationStart
  - typingsJapgolly.angularRouter.mod.ActivationEnd
  - typingsJapgolly.angularRouter.mod.Scroll
  - typingsJapgolly.angularRouter.mod.ResolveStart
  - typingsJapgolly.angularRouter.mod.ResolveEnd
*/
trait Event2 extends StObject
