package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.TypeofPageManager
import typingsJapgolly.ionicReact.distTypesComponentsIonRouterContextMod.IonRouterContextState
import typingsJapgolly.ionicReact.distTypesContextsNavContextMod.NavContextState
import typingsJapgolly.ionicReact.distTypesModelsRouteActionMod.RouteAction
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesModelsRouterDirectionMod.RouterDirection
import typingsJapgolly.ionicReact.distTypesRoutingLocationHistoryMod.LocationHistory
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingNavManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/NavManager", "NavManager")
  @js.native
  open class NavManager protected () extends PureComponent[NavManagerProps, NavContextState, Any] {
    def this(props: NavManagerProps) = this()
    
    var _isMounted: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MNavManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNavManager(): Unit = js.native
    
    def getIonRedirect(): Any = js.native
    
    def getIonRoute(): Any = js.native
    
    def getPageManager(): TypeofPageManager = js.native
    
    def getStackManager(): Any = js.native
    
    def goBack(): Unit = js.native
    def goBack(route: String): Unit = js.native
    def goBack(
      route: String,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def goBack(
      route: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def goBack(route: RouteInfo[Any]): Unit = js.native
    def goBack(
      route: RouteInfo[Any],
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    def handleHardwareBackButton(e: Any): Unit = js.native
    
    var ionRouterContextValue: IonRouterContextState = js.native
    
    def nativeGoBack(): Unit = js.native
    
    def navigate(path: String): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: Unit, options: Any): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: Unit, options: Any, tab: String): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: Unit, options: Unit, tab: String): Unit = js.native
    def navigate(path: String, direction: Unit, action: RouteAction): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: Unit, action: RouteAction, animationBuilder: Unit, options: Any): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: Unit, animationBuilder: Unit, options: Any): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: RouteAction): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: Unit,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
  }
  
  @js.native
  trait NavManagerProps extends StObject {
    
    var ionRedirect: Any = js.native
    
    var ionRoute: Any = js.native
    
    var locationHistory: LocationHistory = js.native
    
    def onChangeTab(tab: String, path: String): Unit = js.native
    def onChangeTab(tab: String, path: String, routeOptions: Any): Unit = js.native
    
    def onNativeBack(): Unit = js.native
    
    def onNavigate(path: String, action: RouteAction): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: Unit, animationBuilder: Unit, options: Any): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: RouterDirection): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: Unit,
      options: Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    
    def onNavigateBack(): Unit = js.native
    def onNavigateBack(route: String): Unit = js.native
    def onNavigateBack(
      route: String,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def onNavigateBack(
      route: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def onNavigateBack(route: RouteInfo[Any]): Unit = js.native
    def onNavigateBack(
      route: RouteInfo[Any],
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    def onResetTab(tab: String, path: String): Unit = js.native
    def onResetTab(tab: String, path: String, routeOptions: Any): Unit = js.native
    
    def onSetCurrentTab(tab: String, routeInfo: RouteInfo[Any]): Unit = js.native
    
    var routeInfo: RouteInfo[Any] = js.native
    
    var stackManager: Any = js.native
  }
}
