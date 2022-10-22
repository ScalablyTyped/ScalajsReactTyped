package typingsJapgolly.gatsbyjsReachRouter

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.gatsbyjsReachRouter.anon.ReadonlyLocationProps
import typingsJapgolly.gatsbyjsReachRouter.anon.ReadonlyLocationProviderP
import typingsJapgolly.gatsbyjsReachRouter.anon.ReadonlyRouterPropsHTMLPr
import typingsJapgolly.gatsbyjsReachRouter.anon.ReadonlyServerLocationPro
import typingsJapgolly.reachRouter.anon.Dictparam
import typingsJapgolly.reachRouter.mod.History
import typingsJapgolly.reachRouter.mod.HistorySource
import typingsJapgolly.reachRouter.mod.LinkProps
import typingsJapgolly.reachRouter.mod.LocationProps
import typingsJapgolly.reachRouter.mod.LocationProviderProps
import typingsJapgolly.reachRouter.mod.MatchProps
import typingsJapgolly.reachRouter.mod.NavigateFn
import typingsJapgolly.reachRouter.mod.RedirectProps
import typingsJapgolly.reachRouter.mod.RouteComponentProps
import typingsJapgolly.reachRouter.mod.RouterProps
import typingsJapgolly.reachRouter.mod.ServerLocationProps
import typingsJapgolly.reachRouter.mod.WindowLocation
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@gatsbyjs/reach-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Link[TState](
    // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[TState]] & RefAttributes[HTMLAnchorElement]
  ): ReturnType[typingsJapgolly.reachRouter.mod.Link[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[typingsJapgolly.reachRouter.mod.Link[TState]]]
  
  @JSImport("@gatsbyjs/reach-router", "Location")
  @js.native
  open class Location protected ()
    extends typingsJapgolly.reachRouter.mod.Location {
    def this(props: ReadonlyLocationProps) = this()
    def this(props: LocationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProps, context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "LocationProvider")
  @js.native
  open class LocationProvider protected ()
    extends typingsJapgolly.reachRouter.mod.LocationProvider {
    def this(props: ReadonlyLocationProviderP) = this()
    def this(props: LocationProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProviderProps, context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "Match")
  @js.native
  open class Match[TParams] protected ()
    extends typingsJapgolly.reachRouter.mod.Match[TParams] {
    def this(props: MatchProps[TParams]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MatchProps[TParams], context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "Redirect")
  @js.native
  open class Redirect[TState] protected ()
    extends typingsJapgolly.reachRouter.mod.Redirect[TState] {
    def this(props: RouteComponentProps[RedirectProps[TState]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouteComponentProps[RedirectProps[TState]], context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "Router")
  @js.native
  open class Router protected ()
    extends typingsJapgolly.reachRouter.mod.Router {
    def this(props: RouterProps & HTMLProps[HTMLDivElement]) = this()
    def this(props: ReadonlyRouterPropsHTMLPr) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps & HTMLProps[HTMLDivElement], context: Any) = this()
  }
  
  @JSImport("@gatsbyjs/reach-router", "ServerLocation")
  @js.native
  open class ServerLocation protected ()
    extends typingsJapgolly.reachRouter.mod.ServerLocation {
    def this(props: ReadonlyServerLocationPro) = this()
    def this(props: ServerLocationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ServerLocationProps, context: Any) = this()
  }
  
  inline def createHistory(source: HistorySource): History = ^.asInstanceOf[js.Dynamic].applyDynamic("createHistory")(source.asInstanceOf[js.Any]).asInstanceOf[History]
  
  inline def createMemorySource(initialPath: String): HistorySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemorySource")(initialPath.asInstanceOf[js.Any]).asInstanceOf[HistorySource]
  
  @JSImport("@gatsbyjs/reach-router", "globalHistory")
  @js.native
  val globalHistory: History = js.native
  
  inline def isRedirect(error: Any): /* is @reach/router.@reach/router.RedirectRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @reach/router.@reach/router.RedirectRequest */ Boolean]
  
  @JSImport("@gatsbyjs/reach-router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  inline def redirectTo(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useLocation(): WindowLocation[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[WindowLocation[Any]]
  
  inline def useMatch(pathname: String): Null | Dictparam = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pathname.asInstanceOf[js.Any]).asInstanceOf[Null | Dictparam]
  
  inline def useNavigate(): NavigateFn = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFn]
  
  inline def useParams[TParams /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ Param in keyof TParams ]:? string} */ js.Any */](): TParams = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[TParams]
}
