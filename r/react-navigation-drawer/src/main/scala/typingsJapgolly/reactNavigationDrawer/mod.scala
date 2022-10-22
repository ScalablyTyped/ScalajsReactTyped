package typingsJapgolly.reactNavigationDrawer

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Node
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNavigation.mod.CreateNavigatorConfig
import typingsJapgolly.reactNavigation.mod.NavigationNavigator
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationRouteConfigMap
import typingsJapgolly.reactNavigation.mod.NavigationState
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import typingsJapgolly.reactNavigationDrawer.anon.ActiveBackgroundColor
import typingsJapgolly.reactNavigationDrawer.anon.GetActionCreators
import typingsJapgolly.reactNavigationDrawer.anon.InitialRouteName
import typingsJapgolly.reactNavigationDrawer.anon.Lazy
import typingsJapgolly.reactNavigationDrawer.anon.Loaded
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerConfig
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerRouterConfig
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerNavigatorItemsMod.default
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerViewMod.Props
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerViewMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-navigation-drawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DrawerActions {
    
    @JSImport("react-navigation-drawer", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.CLOSE_DRAWER")
    @js.native
    val CLOSE_DRAWER: /* "Navigation/CLOSE_DRAWER" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.DRAWER_CLOSED")
    @js.native
    val DRAWER_CLOSED: /* "Navigation/DRAWER_CLOSED" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.DRAWER_OPENED")
    @js.native
    val DRAWER_OPENED: /* "Navigation/DRAWER_OPENED" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.MARK_DRAWER_ACTIVE")
    @js.native
    val MARK_DRAWER_ACTIVE: /* "Navigation/MARK_DRAWER_ACTIVE" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.MARK_DRAWER_IDLE")
    @js.native
    val MARK_DRAWER_IDLE: /* "Navigation/MARK_DRAWER_IDLE" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.MARK_DRAWER_SETTLING")
    @js.native
    val MARK_DRAWER_SETTLING: /* "Navigation/MARK_DRAWER_SETTLING" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.OPEN_DRAWER")
    @js.native
    val OPEN_DRAWER: /* "Navigation/OPEN_DRAWER" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.TOGGLE_DRAWER")
    @js.native
    val TOGGLE_DRAWER: /* "Navigation/TOGGLE_DRAWER" */ String = js.native
    
    inline def closeDrawer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[Any]
    inline def closeDrawer(payload: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def openDrawer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[Any]
    inline def openDrawer(payload: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def toggleDrawer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[Any]
    inline def toggleDrawer(payload: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("react-navigation-drawer", "DrawerGestureContext")
  @js.native
  val DrawerGestureContext: Context[RefHandle[Any] | Null] = js.native
  
  @JSImport("react-navigation-drawer", "DrawerItems")
  @js.native
  open class DrawerItems () extends default
  /* static members */
  object DrawerItems {
    
    @JSImport("react-navigation-drawer", "DrawerItems")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerItems.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer", "DrawerItems.defaultProps")
    @js.native
    def defaultProps: ActiveBackgroundColor = js.native
    inline def defaultProps_=(x: ActiveBackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-navigation-drawer", "DrawerNavigatorItems")
  @js.native
  open class DrawerNavigatorItems () extends default
  /* static members */
  object DrawerNavigatorItems {
    
    @JSImport("react-navigation-drawer", "DrawerNavigatorItems")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerNavigatorItems.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer", "DrawerNavigatorItems.defaultProps")
    @js.native
    def defaultProps: ActiveBackgroundColor = js.native
    inline def defaultProps_=(x: ActiveBackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-navigation-drawer", "DrawerProgressContext")
  @js.native
  val DrawerProgressContext: Context[Node | Null] = js.native
  
  inline def DrawerRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any]): GetActionCreators = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[GetActionCreators]
  inline def DrawerRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any], config: InitialRouteName): GetActionCreators = (^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[GetActionCreators]
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @JSImport("react-navigation-drawer", "DrawerSidebar")
  @js.native
  open class DrawerSidebar ()
    extends typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerSidebarMod.default
  
  @JSImport("react-navigation-drawer", "DrawerView")
  @js.native
  open class DrawerView ()
    extends typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerViewMod.default
  /* static members */
  object DrawerView {
    
    @JSImport("react-navigation-drawer", "DrawerView")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerView.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer", "DrawerView.defaultProps")
    @js.native
    def defaultProps: Lazy = js.native
    inline def defaultProps_=(x: Lazy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: Props, prevState: State): Loaded = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[Loaded]
  }
  
  inline def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any], 
      Any
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDrawerNavigator")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  inline def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any], 
      Any
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any]
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDrawerNavigator")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
}
