package typingsJapgolly.reactRouterGuard

import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.history.mod.History
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.LazyExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactRouter.distLibComponentsMod.RouteProps
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProps
import typingsJapgolly.reactRouterDom.mod.BrowserRouterProps
import typingsJapgolly.reactRouterDom.mod.LinkProps
import typingsJapgolly.reactRouterDom.mod.NavLinkProps
import typingsJapgolly.reactRouterGuard.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-guard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BrowserRouter(hasBasenameChildrenWindow: BrowserRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BrowserRouter")(hasBasenameChildrenWindow.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-router-guard", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[LinkProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  @JSImport("react-router-guard", "NavLink")
  @js.native
  val NavLink: ForwardRefExoticComponent[NavLinkProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  inline def Route(_props: RouteProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  inline def Router(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp: RouterProps): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  open class RouterGuard[T] protected () extends Component[RouterGuardProps, Any, Any] {
    def this(props: RouterGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterGuardProps, context: Any) = this()
  }
  
  @JSImport("react-router-guard", "history")
  @js.native
  val history: History = js.native
  
  inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
  
  trait RouterGuardConfigProps extends StObject {
    
    var canActivate: js.UndefOr[js.Array[js.Function0[js.Promise[Any]]]] = js.undefined
    
    var component: LazyExoticComponent[Any]
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouterGuardConfigProps]] = js.undefined
  }
  object RouterGuardConfigProps {
    
    inline def apply(component: LazyExoticComponent[Any], path: String): RouterGuardConfigProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterGuardConfigProps]
    }
    
    extension [Self <: RouterGuardConfigProps](x: Self) {
      
      inline def setCanActivate(value: js.Array[js.Function0[js.Promise[Any]]]): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
      
      inline def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
      
      inline def setCanActivateVarargs(value: js.Function0[js.Promise[Any]]*): Self = StObject.set(x, "canActivate", js.Array(value*))
      
      inline def setComponent(value: LazyExoticComponent[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRoutes(value: js.Array[RouterGuardConfigProps]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: RouterGuardConfigProps*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  trait RouterGuardProps extends StObject {
    
    var config: js.Array[RouterGuardConfigProps]
    
    var history: js.UndefOr[History] = js.undefined
    
    var loading: js.UndefOr[Boolean | japgolly.scalajs.react.facade.React.Element] = js.undefined
  }
  object RouterGuardProps {
    
    inline def apply(config: js.Array[RouterGuardConfigProps]): RouterGuardProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterGuardProps]
    }
    
    extension [Self <: RouterGuardProps](x: Self) {
      
      inline def setConfig(value: js.Array[RouterGuardConfigProps]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigVarargs(value: RouterGuardConfigProps*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setLoading(value: Boolean | japgolly.scalajs.react.facade.React.Element): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLoadingVdomElement(value: VdomElement): Self = StObject.set(x, "loading", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
