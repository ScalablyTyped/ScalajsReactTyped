package typingsJapgolly.remixRunRouter

import typingsJapgolly.remixRunRouter.anon.PartialLocation
import typingsJapgolly.remixRunRouter.anon.PartialPath
import typingsJapgolly.remixRunRouter.distHistoryMod.BrowserHistory
import typingsJapgolly.remixRunRouter.distHistoryMod.BrowserHistoryOptions
import typingsJapgolly.remixRunRouter.distHistoryMod.HashHistory
import typingsJapgolly.remixRunRouter.distHistoryMod.HashHistoryOptions
import typingsJapgolly.remixRunRouter.distHistoryMod.MemoryHistory
import typingsJapgolly.remixRunRouter.distHistoryMod.MemoryHistoryOptions
import typingsJapgolly.remixRunRouter.distHistoryMod.Path
import typingsJapgolly.remixRunRouter.distHistoryMod.To
import typingsJapgolly.remixRunRouter.distRouterMod.Router
import typingsJapgolly.remixRunRouter.distRouterMod.RouterInit
import typingsJapgolly.remixRunRouter.distRouterMod.StaticHandler
import typingsJapgolly.remixRunRouter.distRouterMod.StaticHandlerContext
import typingsJapgolly.remixRunRouter.distUtilsMod.AgnosticDataRouteObject
import typingsJapgolly.remixRunRouter.distUtilsMod.AgnosticRouteMatch
import typingsJapgolly.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typingsJapgolly.remixRunRouter.distUtilsMod.DeferredData
import typingsJapgolly.remixRunRouter.distUtilsMod.JsonFunction
import typingsJapgolly.remixRunRouter.distUtilsMod.ParamParseKey
import typingsJapgolly.remixRunRouter.distUtilsMod.PathMatch
import typingsJapgolly.remixRunRouter.distUtilsMod.PathPattern
import typingsJapgolly.remixRunRouter.distUtilsMod.RedirectFunction
import typingsJapgolly.remixRunRouter.remixRunRouterStrings.idle
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@remix-run/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@remix-run/router", "AbortedDeferredError")
  @js.native
  open class AbortedDeferredError ()
    extends typingsJapgolly.remixRunRouter.distUtilsMod.AbortedDeferredError
  
  @JSImport("@remix-run/router", "Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.remixRunRouter.distHistoryMod.Action & String] = js.native
    
    /* "POP" */ val Pop: typingsJapgolly.remixRunRouter.distHistoryMod.Action.Pop & String = js.native
    
    /* "PUSH" */ val Push: typingsJapgolly.remixRunRouter.distHistoryMod.Action.Push & String = js.native
    
    /* "REPLACE" */ val Replace: typingsJapgolly.remixRunRouter.distHistoryMod.Action.Replace & String = js.native
  }
  
  @JSImport("@remix-run/router", "ErrorResponse")
  @js.native
  open class ErrorResponse protected ()
    extends typingsJapgolly.remixRunRouter.distUtilsMod.ErrorResponse {
    def this(status: Double, statusText: String, data: Any) = this()
    def this(status: Double, statusText: Unit, data: Any) = this()
  }
  
  object IDLE_FETCHER {
    
    @JSImport("@remix-run/router", "IDLE_FETCHER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.data")
    @js.native
    def data: js.UndefOr[Any] = js.native
    inline def data_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formAction")
    @js.native
    def formAction: /* undefined */ Any = js.native
    inline def formAction_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formAction")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formData")
    @js.native
    def formData: /* undefined */ Any = js.native
    inline def formData_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formEncType")
    @js.native
    def formEncType: /* undefined */ Any = js.native
    inline def formEncType_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.formMethod")
    @js.native
    def formMethod: /* undefined */ Any = js.native
    inline def formMethod_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_FETCHER.state")
    @js.native
    def state: idle = js.native
    inline def state_=(x: idle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  }
  
  object IDLE_NAVIGATION {
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formAction")
    @js.native
    def formAction: /* undefined */ Any = js.native
    inline def formAction_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formAction")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formData")
    @js.native
    def formData: /* undefined */ Any = js.native
    inline def formData_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formEncType")
    @js.native
    def formEncType: /* undefined */ Any = js.native
    inline def formEncType_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.formMethod")
    @js.native
    def formMethod: /* undefined */ Any = js.native
    inline def formMethod_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.location")
    @js.native
    def location: /* undefined */ Any = js.native
    inline def location_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router", "IDLE_NAVIGATION.state")
    @js.native
    def state: idle = js.native
    inline def state_=(x: idle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  }
  
  inline def UNSAFEConvertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject]): js.Array[AgnosticDataRouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  inline def UNSAFEConvertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], parentPath: js.Array[Double]): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  inline def UNSAFEConvertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], parentPath: js.Array[Double], allIds: Set[String]): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], allIds.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  inline def UNSAFEConvertRoutesToDataRoutes(routes: js.Array[AgnosticRouteObject], parentPath: Unit, allIds: Set[String]): js.Array[AgnosticDataRouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_convertRoutesToDataRoutes")(routes.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any], allIds.asInstanceOf[js.Any])).asInstanceOf[js.Array[AgnosticDataRouteObject]]
  
  inline def createBrowserHistory(): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[BrowserHistory]
  inline def createBrowserHistory(options: BrowserHistoryOptions): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserHistory]
  
  inline def createHashHistory(): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")().asInstanceOf[HashHistory]
  inline def createHashHistory(options: HashHistoryOptions): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")(options.asInstanceOf[js.Any]).asInstanceOf[HashHistory]
  
  inline def createMemoryHistory(): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")().asInstanceOf[MemoryHistory]
  inline def createMemoryHistory(options: MemoryHistoryOptions): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")(options.asInstanceOf[js.Any]).asInstanceOf[MemoryHistory]
  
  inline def createPath(hasPathnameSearchHash: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(hasPathnameSearchHash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createRouter(init: RouterInit): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(init.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  inline def defer(data: Record[String, Any]): DeferredData = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(data.asInstanceOf[js.Any]).asInstanceOf[DeferredData]
  
  inline def generatePath[Path /* <: String */](path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generatePath[Path /* <: String */](
    path: Path,
    params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string} */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStaticContextFromError(routes: js.Array[AgnosticDataRouteObject], context: StaticHandlerContext, error: Any): StaticHandlerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getStaticContextFromError")(routes.asInstanceOf[js.Any], context.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[StaticHandlerContext]
  
  inline def getToPathname(to: To): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToPathname")(to.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def invariant(value: Boolean): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  inline def invariant(value: Boolean, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  inline def invariant[T](): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")().asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def invariant[T](value: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def invariant[T](value: T, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def invariant[T](value: Null, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def invariant[T](value: Unit, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  inline def isRouteErrorResponse(e: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]
  
  inline def joinPaths(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@remix-run/router", "json")
  @js.native
  val json: JsonFunction = js.native
  
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  
  inline def normalizePathname(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePathname")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
  
  @JSImport("@remix-run/router", "redirect")
  @js.native
  val redirect: RedirectFunction = js.native
  
  inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def resolveTo(toArg: To, routePathnames: js.Array[String], locationPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTo")(toArg.asInstanceOf[js.Any], routePathnames.asInstanceOf[js.Any], locationPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
  inline def resolveTo(toArg: To, routePathnames: js.Array[String], locationPathname: String, isPathRelative: Boolean): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTo")(toArg.asInstanceOf[js.Any], routePathnames.asInstanceOf[js.Any], locationPathname.asInstanceOf[js.Any], isPathRelative.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def stripBasename(pathname: String, basename: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("stripBasename")(pathname.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def unstableCreateStaticHandler(routes: js.Array[AgnosticRouteObject]): StaticHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createStaticHandler")(routes.asInstanceOf[js.Any]).asInstanceOf[StaticHandler]
  
  inline def warning(cond: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(cond.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
