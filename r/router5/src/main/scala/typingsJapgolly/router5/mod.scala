package typingsJapgolly.router5

import typingsJapgolly.routeNode.distRouteNodeMod.RouteNodeOptions
import typingsJapgolly.router5.anon.PartialOptions
import typingsJapgolly.router5.distConstantsMod.Constants_
import typingsJapgolly.router5.distConstantsMod.ErrorCodes_
import typingsJapgolly.router5.distTypesRouterMod.DefaultDependencies
import typingsJapgolly.router5.distTypesRouterMod.Route
import typingsJapgolly.router5.distTypesRouterMod.Router
import typingsJapgolly.router5TransitionPath.distTransitionPathMod.State
import typingsJapgolly.router5TransitionPath.distTransitionPathMod.TransitionPath
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("router5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Dependencies /* <: Record[String, Any] */](): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]], options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: Unit, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: Unit, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: Unit, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: typingsJapgolly.routeNode.mod.RouteNode): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: typingsJapgolly.routeNode.mod.RouteNode, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](routes: typingsJapgolly.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: Record[String, Any] */](
    routes: typingsJapgolly.routeNode.mod.RouteNode,
    options: PartialOptions,
    dependencies: Dependencies
  ): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  
  @JSImport("router5", "RouteNode")
  @js.native
  open class RouteNode ()
    extends typingsJapgolly.routeNode.mod.RouteNode {
    def this(name: String) = this()
    def this(name: String, path: String) = this()
    def this(name: Unit, path: String) = this()
    def this(
      name: String,
      path: String,
      childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route]
    ) = this()
    def this(name: String, path: Unit, childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route]) = this()
    def this(name: Unit, path: String, childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route]) = this()
    def this(name: Unit, path: Unit, childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route]) = this()
    def this(
      name: String,
      path: String,
      childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: String, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(
      name: String,
      path: Unit,
      childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: Unit, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(
      name: Unit,
      path: String,
      childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: Unit, path: String, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(
      name: Unit,
      path: Unit,
      childRoutes: js.Array[typingsJapgolly.routeNode.distRouteNodeMod.Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: Unit, path: Unit, childRoutes: Unit, options: RouteNodeOptions) = this()
  }
  
  inline def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneRouter")(router.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies], dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneRouter")(router.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  
  @JSImport("router5", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  inline def createRouter[Dependencies /* <: Record[String, Any] */](): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")().asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]], options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: Unit, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: Unit, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: Unit, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: typingsJapgolly.routeNode.mod.RouteNode): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: typingsJapgolly.routeNode.mod.RouteNode, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](routes: typingsJapgolly.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  inline def createRouter[Dependencies /* <: Record[String, Any] */](
    routes: typingsJapgolly.routeNode.mod.RouteNode,
    options: PartialOptions,
    dependencies: Dependencies
  ): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  
  @JSImport("router5", "errorCodes")
  @js.native
  val errorCodes: ErrorCodes_ = js.native
  
  inline def transitionPath(toState: State): TransitionPath = ^.asInstanceOf[js.Dynamic].applyDynamic("transitionPath")(toState.asInstanceOf[js.Any]).asInstanceOf[TransitionPath]
  inline def transitionPath(toState: State, fromState: State): TransitionPath = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionPath")(toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any])).asInstanceOf[TransitionPath]
}
