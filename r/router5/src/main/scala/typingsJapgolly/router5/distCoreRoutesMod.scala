package typingsJapgolly.router5

import typingsJapgolly.routeNode.mod.RouteNode
import typingsJapgolly.router5.distTypesRouterMod.Route
import typingsJapgolly.router5.distTypesRouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRoutesMod {
  
  @JSImport("router5/dist/core/routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Dependencies](routes: js.Array[Route[Dependencies]]): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* router */ Router[Dependencies], Router[Dependencies]]]
  inline def default[Dependencies](routes: RouteNode): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* router */ Router[Dependencies], Router[Dependencies]]]
}
