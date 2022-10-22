package typingsJapgolly.reduxRouter

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactRouter.anon.Basename
import typingsJapgolly.reactRouter.anon.Data
import typingsJapgolly.reactRouter.anon.Relative
import typingsJapgolly.reactRouter.anon.Revalidate
import typingsJapgolly.reactRouter.distLibComponentsMod.AwaitProps
import typingsJapgolly.reactRouter.distLibComponentsMod.MemoryRouterProps
import typingsJapgolly.reactRouter.distLibComponentsMod.NavigateProps
import typingsJapgolly.reactRouter.distLibComponentsMod.OutletProps
import typingsJapgolly.reactRouter.distLibComponentsMod.RouteProps
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProps
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProviderProps
import typingsJapgolly.reactRouter.distLibComponentsMod.RoutesProps
import typingsJapgolly.reactRouter.distLibContextMod.DataRouterContextObject
import typingsJapgolly.reactRouter.distLibContextMod.LocationContextObject
import typingsJapgolly.reactRouter.distLibContextMod.NavigationContextObject
import typingsJapgolly.reactRouter.distLibContextMod.RouteContextObject
import typingsJapgolly.reactRouter.distLibContextMod.RouteMatch
import typingsJapgolly.reactRouter.distLibContextMod.RouteObject
import typingsJapgolly.reactRouter.distLibHooksMod.NavigateFunction
import typingsJapgolly.remixRunRouter.anon.PartialLocation
import typingsJapgolly.remixRunRouter.anon.PartialPath
import typingsJapgolly.remixRunRouter.distHistoryMod.Action
import typingsJapgolly.remixRunRouter.distHistoryMod.Location
import typingsJapgolly.remixRunRouter.distHistoryMod.Path
import typingsJapgolly.remixRunRouter.distHistoryMod.To
import typingsJapgolly.remixRunRouter.distRouterMod.Navigation
import typingsJapgolly.remixRunRouter.distRouterMod.Router
import typingsJapgolly.remixRunRouter.distRouterMod.RouterState
import typingsJapgolly.remixRunRouter.distRouterMod.StaticHandlerContext
import typingsJapgolly.remixRunRouter.distUtilsMod.AgnosticRouteMatch
import typingsJapgolly.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typingsJapgolly.remixRunRouter.distUtilsMod.DeferredData
import typingsJapgolly.remixRunRouter.distUtilsMod.JsonFunction
import typingsJapgolly.remixRunRouter.distUtilsMod.ParamParseKey
import typingsJapgolly.remixRunRouter.distUtilsMod.PathMatch
import typingsJapgolly.remixRunRouter.distUtilsMod.PathPattern
import typingsJapgolly.remixRunRouter.distUtilsMod.RedirectFunction
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReduxRouterMod {
  
  object default {
    
    @JSImport("redux-router/lib/ReduxRouter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.AbortedDeferredError")
    @js.native
    open class AbortedDeferredError ()
      extends typingsJapgolly.reactRouter.mod.AbortedDeferredError
    
    inline def Await(hasChildrenErrorElementResolve: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(hasChildrenErrorElementResolve.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MemoryRouter(hasBasenameChildrenInitialEntriesInitialIndex: MemoryRouterProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(hasBasenameChildrenInitialEntriesInitialIndex.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
    
    inline def Navigate(hasToReplaceStateRelative: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(hasToReplaceStateRelative.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("redux-router/lib/ReduxRouter", "default.NavigationType")
    @js.native
    object NavigationType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Action & String] = js.native
      
      /* "POP" */ val Pop: typingsJapgolly.remixRunRouter.distHistoryMod.Action.Pop & String = js.native
      
      /* "PUSH" */ val Push: typingsJapgolly.remixRunRouter.distHistoryMod.Action.Push & String = js.native
      
      /* "REPLACE" */ val Replace: typingsJapgolly.remixRunRouter.distHistoryMod.Action.Replace & String = js.native
    }
    
    inline def Outlet(props: OutletProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    inline def Route(_props: RouteProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    inline def Router(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp: RouterProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    inline def RouterProvider(hasFallbackElementRouter: RouterProviderProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(hasFallbackElementRouter.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
    
    inline def Routes(hasChildrenLocation: RoutesProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(hasChildrenLocation.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    @JSImport("redux-router/lib/ReduxRouter", "default.UNSAFE_DataRouterContext")
    @js.native
    val UNSAFEDataRouterContext: Context[DataRouterContextObject | Null] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.UNSAFE_DataRouterStateContext")
    @js.native
    val UNSAFEDataRouterStateContext: Context[RouterState | Null] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.UNSAFE_DataStaticRouterContext")
    @js.native
    val UNSAFEDataStaticRouterContext: Context[StaticHandlerContext | Null] = js.native
    
    inline def UNSAFEEnhanceManualRouteObjects(routes: js.Array[RouteObject]): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_enhanceManualRouteObjects")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
    
    @JSImport("redux-router/lib/ReduxRouter", "default.UNSAFE_LocationContext")
    @js.native
    val UNSAFELocationContext: Context[LocationContextObject] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.UNSAFE_NavigationContext")
    @js.native
    val UNSAFENavigationContext: Context[NavigationContextObject] = js.native
    
    @JSImport("redux-router/lib/ReduxRouter", "default.UNSAFE_RouteContext")
    @js.native
    val UNSAFERouteContext: Context[RouteContextObject] = js.native
    
    inline def createMemoryRouter(routes: js.Array[RouteObject]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router]
    inline def createMemoryRouter(routes: js.Array[RouteObject], opts: Basename): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
    
    inline def createPath(hasPathnameSearchHash: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(hasPathnameSearchHash.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def createRoutesFromChildren(children: Node): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
    inline def createRoutesFromChildren(children: Node, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
    
    inline def createRoutesFromElements(children: Node): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
    inline def createRoutesFromElements(children: Node, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
    
    inline def defer(data: Record[String, Any]): DeferredData = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(data.asInstanceOf[js.Any]).asInstanceOf[DeferredData]
    
    inline def generatePath[Path /* <: String */](path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generatePath[Path /* <: String */](
      path: Path,
      params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string} */ js.Any
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isRouteErrorResponse(e: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]
    
    @JSImport("redux-router/lib/ReduxRouter", "default.json")
    @js.native
    val json: JsonFunction = js.native
    
    inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
    inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
    
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
    
    inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
    
    @JSImport("redux-router/lib/ReduxRouter", "default.redirect")
    @js.native
    val redirect: RedirectFunction = js.native
    
    inline def renderMatches(): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
    inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
    
    inline def useActionData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionData")().asInstanceOf[Any]
    
    inline def useAsyncError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncError")().asInstanceOf[Any]
    
    inline def useAsyncValue(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncValue")().asInstanceOf[Any]
    
    inline def useHref(to: To): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def useHref(to: To, hasRelative: Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any], hasRelative.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def useInRouterContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInRouterContext")().asInstanceOf[Boolean]
    
    inline def useLoaderData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoaderData")().asInstanceOf[Any]
    
    inline def useLocation(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location]
    
    inline def useMatch[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
    inline def useMatch[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path]): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
    
    inline def useMatches(): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatches")().asInstanceOf[js.Array[Data]]
    
    inline def useNavigate(): NavigateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFunction]
    
    inline def useNavigation(): Navigation = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[Navigation]
    
    inline def useNavigationType(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationType")().asInstanceOf[Action]
    
    inline def useOutlet(): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")().asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    inline def useOutlet(context: Any): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")(context.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    
    inline def useOutletContext[Context](): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutletContext")().asInstanceOf[Context]
    
    inline def useParams[ParamsOrKey /* <: String | (Record[String, js.UndefOr[String]]) */](): /* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any]
    
    inline def useResolvedPath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
    inline def useResolvedPath(to: To, hasRelative: Relative): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any], hasRelative.asInstanceOf[js.Any])).asInstanceOf[Path]
    
    inline def useRevalidator(): Revalidate = ^.asInstanceOf[js.Dynamic].applyDynamic("useRevalidator")().asInstanceOf[Revalidate]
    
    inline def useRouteError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteError")().asInstanceOf[Any]
    
    inline def useRouteLoaderData(routeId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteLoaderData")(routeId.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def useRoutes(routes: js.Array[RouteObject]): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    inline def useRoutes(routes: js.Array[RouteObject], locationArg: String): japgolly.scalajs.react.facade.React.Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
    inline def useRoutes(routes: js.Array[RouteObject], locationArg: typingsJapgolly.reactRouter.anon.PartialLocation): japgolly.scalajs.react.facade.React.Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  }
}
