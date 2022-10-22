package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.reachRouter.anon.Default
import typingsJapgolly.reachRouter.anon.Dictparam
import typingsJapgolly.reachRouter.anon.State
import typingsJapgolly.reachRouter.mod.^
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Link[TState](
  // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
props: PropsWithoutRef[LinkProps[TState]] & RefAttributes[HTMLAnchorElement]
): ReturnType[typingsJapgolly.reachRouter.mod.Link[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[typingsJapgolly.reachRouter.mod.Link[TState]]]
type Link[TState] = ForwardRefExoticComponent[PropsWithoutRef[LinkProps[TState]] & RefAttributes[HTMLAnchorElement]]

inline def createHistory(source: HistorySource): History = ^.asInstanceOf[js.Dynamic].applyDynamic("createHistory")(source.asInstanceOf[js.Any]).asInstanceOf[History]

inline def createMemorySource(initialPath: String): HistorySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemorySource")(initialPath.asInstanceOf[js.Any]).asInstanceOf[HistorySource]

inline def globalHistory: History = ^.asInstanceOf[js.Dynamic].selectDynamic("globalHistory").asInstanceOf[History]

inline def isRedirect(error: Any): /* is @reach/router.@reach/router.RedirectRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @reach/router.@reach/router.RedirectRequest */ Boolean]

inline def navigate: NavigateFn = ^.asInstanceOf[js.Dynamic].selectDynamic("navigate").asInstanceOf[NavigateFn]

inline def redirectTo(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useLocation(): WindowLocation[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[WindowLocation[Any]]

inline def useMatch(pathname: String): Null | Dictparam = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pathname.asInstanceOf[js.Any]).asInstanceOf[Null | Dictparam]

inline def useNavigate(): NavigateFn = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFn]

inline def useParams[TParams /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ Param in keyof TParams ]:? string} */ js.Any */](): TParams = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[TParams]

type HistoryListener = js.Function1[/* parameter */ HistoryListenerParameter, Unit]

type HistoryLocation = WindowLocation[Any] & State

type HistoryUnsubscribe = js.Function0[Unit]

type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, Node]

type MatchRenderFn[TParams] = js.Function1[/* props */ MatchRenderProps[TParams], Node]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type RouteComponentProps[TParams] = Partial[TParams] & Default

type WindowLocation[S] = (/* import warning: importer.ImportType#apply Failed type conversion: std.Window['location'] */ js.Any) & HLocation[S]
