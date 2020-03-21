package typingsJapgolly.dva

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dva.dvaStrings.`@@routerSlashCALL_HISTORY_METHOD`
import typingsJapgolly.dva.dvaStrings.`@@routerSlashLOCATION_CHANGE`
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationDescriptor
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouter.mod.MemoryRouterProps
import typingsJapgolly.reactRouter.mod.Omit
import typingsJapgolly.reactRouter.mod.PromptProps
import typingsJapgolly.reactRouter.mod.RedirectProps
import typingsJapgolly.reactRouter.mod.RouteComponentProps
import typingsJapgolly.reactRouter.mod.RouteProps
import typingsJapgolly.reactRouter.mod.RouterProps
import typingsJapgolly.reactRouter.mod.StaticContext
import typingsJapgolly.reactRouter.mod.StaticRouterProps
import typingsJapgolly.reactRouter.mod.SwitchProps
import typingsJapgolly.reactRouter.mod.WithRouterProps
import typingsJapgolly.reactRouter.mod.WithRouterStatics
import typingsJapgolly.reactRouter.mod.`match`
import typingsJapgolly.reactRouterDom.mod.BrowserRouterProps
import typingsJapgolly.reactRouterDom.mod.HashRouterProps
import typingsJapgolly.reactRouterDom.mod.LinkProps
import typingsJapgolly.reactRouterDom.mod.NavLinkProps
import typingsJapgolly.reactRouterRedux.AnonRouter
import typingsJapgolly.reactRouterRedux.mod.ConnectedRouterProps
import typingsJapgolly.reactRouterRedux.mod.RouterAction
import typingsJapgolly.reactRouterRedux.mod.RouterState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class BrowserRouter ()
    extends Component[BrowserRouterProps, js.Any, js.Any]
  
  @js.native
  class HashRouter ()
    extends Component[HashRouterProps, js.Any, js.Any]
  
  @js.native
  class Link[S] ()
    extends Component[LinkProps[S], js.Any, js.Any]
  
  @js.native
  class MemoryRouter ()
    extends Component[MemoryRouterProps, js.Any, js.Any]
  
  @js.native
  class NavLink[S] ()
    extends Component[NavLinkProps[S], js.Any, js.Any]
  
  @js.native
  class Prompt ()
    extends Component[PromptProps, js.Any, js.Any]
  
  @js.native
  class Redirect ()
    extends Component[RedirectProps, js.Any, js.Any]
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends Component[T, js.Any, js.Any]
  
  @js.native
  class Router ()
    extends Component[RouterProps, js.Any, js.Any]
  
  @js.native
  class StaticRouter ()
    extends Component[StaticRouterProps, js.Any, js.Any]
  
  @js.native
  class Switch ()
    extends Component[SwitchProps, js.Any, js.Any]
  
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  def useLocation[S](): Location[S] = js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.useParams with js.Any */](): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ p in keyof Params ]: string}
    */ typingsJapgolly.dva.dvaStrings.useParams with js.Any = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.useRouteMatch with js.Any */](): `match`[Params] = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.useRouteMatch with js.Any */](path: String): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.useRouteMatch with js.Any */](path: js.Array[String]): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.dva.dvaStrings.useRouteMatch with js.Any */](path: RouteProps): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClassP[(Omit[P, String]) with WithRouterProps[C] with js.Object]) with WithRouterStatics[C] = js.native
  @js.native
  object routerRedux extends js.Object {
    @js.native
    class ConnectedRouter[State] ()
      extends Component[ConnectedRouterProps[State], js.Object, js.Any]
    
    val CALL_HISTORY_METHOD: `@@routerSlashCALL_HISTORY_METHOD` = js.native
    val LOCATION_CHANGE: `@@routerSlashLOCATION_CHANGE` = js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
    def createMatchSelector(path: String): js.Function1[/* state */ AnonRouter, `match`[js.Object] | Null] = js.native
    def go(n: Double): RouterAction = js.native
    def goBack(): RouterAction = js.native
    def goForward(): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
    @js.native
    object routerActions extends js.Object {
      var go: js.Function1[/* n */ Double, RouterAction] = js.native
      var goBack: js.Function0[RouterAction] = js.native
      var goForward: js.Function0[RouterAction] = js.native
      var push: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      var replace: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
    }
    
  }
  
}

