package typingsJapgolly.reactRouter

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactRouter.anon.PartialLocation
import typingsJapgolly.reactRouter.distLibContextMod.Navigator
import typingsJapgolly.reactRouter.distLibContextMod.RelativeRoutingType
import typingsJapgolly.reactRouter.distLibContextMod.RouteMatch
import typingsJapgolly.reactRouter.distLibContextMod.RouteObject
import typingsJapgolly.reactRouter.reactRouterBooleans.`false`
import typingsJapgolly.reactRouter.reactRouterBooleans.`true`
import typingsJapgolly.remixRunRouter.distHistoryMod.Action
import typingsJapgolly.remixRunRouter.distHistoryMod.InitialEntry
import typingsJapgolly.remixRunRouter.distHistoryMod.To
import typingsJapgolly.remixRunRouter.distRouterMod.Router
import typingsJapgolly.remixRunRouter.distUtilsMod.TrackedPromise
import typingsJapgolly.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibComponentsMod {
  
  @JSImport("react-router/dist/lib/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Await(hasChildrenErrorElementResolve: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(hasChildrenErrorElementResolve.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MemoryRouter(hasBasenameChildrenInitialEntriesInitialIndex: MemoryRouterProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(hasBasenameChildrenInitialEntriesInitialIndex.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def Navigate(hasToReplaceStateRelative: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(hasToReplaceStateRelative.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def Outlet(props: OutletProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  inline def Route(_props: RouteProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  inline def Router(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp: RouterProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  inline def RouterProvider(hasFallbackElementRouter: RouterProviderProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(hasFallbackElementRouter.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def Routes(hasChildrenLocation: RoutesProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(hasChildrenLocation.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  inline def createRoutesFromChildren(children: Node): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromChildren(children: Node, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def enhanceManualRouteObjects(routes: js.Array[RouteObject]): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceManualRouteObjects")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  
  inline def renderMatches(): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  trait AwaitProps extends StObject {
    
    var children: Node | AwaitResolveRenderFunction
    
    var errorElement: js.UndefOr[Node] = js.undefined
    
    var resolve: TrackedPromise | Any
  }
  object AwaitProps {
    
    inline def apply(resolve: TrackedPromise | Any): AwaitProps = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[AwaitProps]
    }
    
    extension [Self <: AwaitProps](x: Self) {
      
      inline def setChildren(value: Node | AwaitResolveRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ Awaited[Any] => japgolly.scalajs.react.facade.React.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setErrorElement(value: VdomNode): Self = StObject.set(x, "errorElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setErrorElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "errorElement", js.Array(value*))
      
      inline def setErrorElementVdomElement(value: VdomElement): Self = StObject.set(x, "errorElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setResolve(value: TrackedPromise | Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  type AwaitResolveRenderFunction = js.Function1[/* data */ Awaited[Any], japgolly.scalajs.react.facade.React.Element]
  
  trait IndexRouteProps
    extends StObject
       with _RouteProps {
    
    var action: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['action'] */ js.Any
      ] = js.undefined
    
    var caseSensitive: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['caseSensitive'] */ js.Any
      ] = js.undefined
    
    var children: Unit
    
    var element: js.UndefOr[Node | Null] = js.undefined
    
    var errorElement: js.UndefOr[Node | Null] = js.undefined
    
    var handle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['handle'] */ js.Any
      ] = js.undefined
    
    var hasErrorBoundary: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['hasErrorBoundary'] */ js.Any
      ] = js.undefined
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['id'] */ js.Any
      ] = js.undefined
    
    var index: `true`
    
    var loader: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['loader'] */ js.Any
      ] = js.undefined
    
    var path: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['path'] */ js.Any
      ] = js.undefined
    
    var shouldRevalidate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['shouldRevalidate'] */ js.Any
      ] = js.undefined
  }
  object IndexRouteProps {
    
    inline def apply(children: Unit): IndexRouteProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      __obj.asInstanceOf[IndexRouteProps]
    }
    
    extension [Self <: IndexRouteProps](x: Self) {
      
      inline def setAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['action'] */ js.Any
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCaseSensitive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['caseSensitive'] */ js.Any
      ): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setElement(value: VdomNode): Self = StObject.set(x, "element", value.rawNode.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "element", js.Array(value*))
      
      inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setErrorElement(value: VdomNode): Self = StObject.set(x, "errorElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setErrorElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "errorElement", js.Array(value*))
      
      inline def setErrorElementVdomElement(value: VdomElement): Self = StObject.set(x, "errorElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHandle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['handle'] */ js.Any
      ): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasErrorBoundary(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['hasErrorBoundary'] */ js.Any
      ): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
      
      inline def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['id'] */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLoader(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['loader'] */ js.Any
      ): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['path'] */ js.Any
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setShouldRevalidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['shouldRevalidate'] */ js.Any
      ): Self = StObject.set(x, "shouldRevalidate", value.asInstanceOf[js.Any])
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
  }
  
  type LayoutRouteProps = PathRouteProps
  
  trait MemoryRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
  }
  object MemoryRouterProps {
    
    inline def apply(): MemoryRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryRouterProps]
    }
    
    extension [Self <: MemoryRouterProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
    }
  }
  
  trait NavigateProps extends StObject {
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var to: To
  }
  object NavigateProps {
    
    inline def apply(to: To): NavigateProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateProps]
    }
    
    extension [Self <: NavigateProps](x: Self) {
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutletProps extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
  }
  object OutletProps {
    
    inline def apply(): OutletProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutletProps]
    }
    
    extension [Self <: OutletProps](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait PathRouteProps
    extends StObject
       with _RouteProps {
    
    var action: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['action'] */ js.Any
      ] = js.undefined
    
    var caseSensitive: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['caseSensitive'] */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var element: js.UndefOr[Node | Null] = js.undefined
    
    var errorElement: js.UndefOr[Node | Null] = js.undefined
    
    var handle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['handle'] */ js.Any
      ] = js.undefined
    
    var hasErrorBoundary: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['hasErrorBoundary'] */ js.Any
      ] = js.undefined
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['id'] */ js.Any
      ] = js.undefined
    
    var index: js.UndefOr[`false`] = js.undefined
    
    var loader: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['loader'] */ js.Any
      ] = js.undefined
    
    var path: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['path'] */ js.Any
      ] = js.undefined
    
    var shouldRevalidate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['shouldRevalidate'] */ js.Any
      ] = js.undefined
  }
  object PathRouteProps {
    
    inline def apply(): PathRouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathRouteProps]
    }
    
    extension [Self <: PathRouteProps](x: Self) {
      
      inline def setAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['action'] */ js.Any
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCaseSensitive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['caseSensitive'] */ js.Any
      ): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setElement(value: VdomNode): Self = StObject.set(x, "element", value.rawNode.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "element", js.Array(value*))
      
      inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setErrorElement(value: VdomNode): Self = StObject.set(x, "errorElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setErrorElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "errorElement", js.Array(value*))
      
      inline def setErrorElementVdomElement(value: VdomElement): Self = StObject.set(x, "errorElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHandle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['handle'] */ js.Any
      ): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasErrorBoundary(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['hasErrorBoundary'] */ js.Any
      ): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
      
      inline def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['id'] */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLoader(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['loader'] */ js.Any
      ): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['path'] */ js.Any
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setShouldRevalidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['shouldRevalidate'] */ js.Any
      ): Self = StObject.set(x, "shouldRevalidate", value.asInstanceOf[js.Any])
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactRouter.distLibComponentsMod.PathRouteProps
    - typingsJapgolly.reactRouter.distLibComponentsMod.LayoutRouteProps
    - typingsJapgolly.reactRouter.distLibComponentsMod.IndexRouteProps
  */
  type RouteProps = _RouteProps | LayoutRouteProps
  
  trait RouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var location: PartialLocation | String
    
    var navigationType: js.UndefOr[Action] = js.undefined
    
    var navigator: Navigator
    
    var static: js.UndefOr[Boolean] = js.undefined
  }
  object RouterProps {
    
    inline def apply(location: PartialLocation | String, navigator: Navigator): RouterProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterProps]
    }
    
    extension [Self <: RouterProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigationType(value: Action): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
      
      inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
      
      inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  trait RouterProviderProps extends StObject {
    
    var fallbackElement: js.UndefOr[Node] = js.undefined
    
    var router: Router
  }
  object RouterProviderProps {
    
    inline def apply(router: Router): RouterProviderProps = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterProviderProps]
    }
    
    extension [Self <: RouterProviderProps](x: Self) {
      
      inline def setFallbackElement(value: VdomNode): Self = StObject.set(x, "fallbackElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFallbackElementNull: Self = StObject.set(x, "fallbackElement", null)
      
      inline def setFallbackElementUndefined: Self = StObject.set(x, "fallbackElement", js.undefined)
      
      inline def setFallbackElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "fallbackElement", js.Array(value*))
      
      inline def setFallbackElementVdomElement(value: VdomElement): Self = StObject.set(x, "fallbackElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutesProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var location: js.UndefOr[PartialLocation | String] = js.undefined
  }
  object RoutesProps {
    
    inline def apply(): RoutesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutesProps]
    }
    
    extension [Self <: RoutesProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  trait _RouteProps extends StObject
  object _RouteProps {
    
    inline def IndexRouteProps(children: Unit): typingsJapgolly.reactRouter.distLibComponentsMod.IndexRouteProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      __obj.asInstanceOf[typingsJapgolly.reactRouter.distLibComponentsMod.IndexRouteProps]
    }
    
    inline def PathRouteProps(): typingsJapgolly.reactRouter.distLibComponentsMod.PathRouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.reactRouter.distLibComponentsMod.PathRouteProps]
    }
  }
}
