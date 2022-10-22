package typingsJapgolly.tuyaPanelKit

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Extract
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionHelpers
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabRouterOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.CommonNavigationAction
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationRoute
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Router
import typingsJapgolly.tuyaPanelKit.anon.KeyType
import typingsJapgolly.tuyaPanelKit.anon.NameString
import typingsJapgolly.tuyaPanelKit.anon.`6`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationRoutersDrawerRouterMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOpenByDefaultRest.asInstanceOf[js.Any]).asInstanceOf[Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction]]
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
    
    inline def openDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def toggleDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[DrawerActionType]
  }
  
  trait DrawerActionHelpers[ParamList /* <: ParamListBase */]
    extends StObject
       with TabActionHelpers[ParamList] {
    
    /**
      * Close the drawer sidebar.
      */
    def closeDrawer(): Unit
    
    /**
      * Open the drawer sidebar.
      */
    def openDrawer(): Unit
    
    /**
      * Open the drawer sidebar if closed, or close if opened.
      */
    def toggleDrawer(): Unit
  }
  object DrawerActionHelpers {
    
    inline def apply[ParamList /* <: ParamListBase */](
      closeDrawer: Callback,
      jumpTo: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any => Callback,
      openDrawer: Callback,
      toggleDrawer: Callback
    ): DrawerActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(closeDrawer = closeDrawer.toJsFn, jumpTo = js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any) => jumpTo(t0).runNow()), openDrawer = openDrawer.toJsFn, toggleDrawer = toggleDrawer.toJsFn)
      __obj.asInstanceOf[DrawerActionHelpers[ParamList]]
    }
    
    extension [Self <: DrawerActionHelpers[?], ParamList /* <: ParamListBase */](x: Self & DrawerActionHelpers[ParamList]) {
      
      inline def setCloseDrawer(value: Callback): Self = StObject.set(x, "closeDrawer", value.toJsFn)
      
      inline def setOpenDrawer(value: Callback): Self = StObject.set(x, "openDrawer", value.toJsFn)
      
      inline def setToggleDrawer(value: Callback): Self = StObject.set(x, "toggleDrawer", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType
    - typingsJapgolly.tuyaPanelKit.anon.`5`
  */
  trait DrawerActionType extends StObject
  object DrawerActionType {
    
    inline def `5`(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): typingsJapgolly.tuyaPanelKit.anon.`5` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.`5`]
    }
    
    inline def TabActionType(payload: NameString): typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JUMP_TO")
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType]
    }
  }
  
  /* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.TabNavigationState<ParamList>, 'type' | 'history'> & {  type :'drawer',   history :std.Array<{  type :'route',   key :string} | {  type :'drawer'}>} */
  trait DrawerNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys and drawer open status.
      */
    // tslint:disable-next-line array-type
    var history: js.Array[KeyType | `6`]
    
    var index: Double
    
    var key: String
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]]
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    
    var stale: `false`
    
    /**
      * Type of the router, in this case, it's drawer.
      */
    var `type`: drawer
  }
  object DrawerNavigationState {
    
    inline def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType | `6`],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    ): DrawerNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")("drawer")
      __obj.asInstanceOf[DrawerNavigationState[ParamList]]
    }
    
    extension [Self <: DrawerNavigationState[?], ParamList /* <: ParamListBase */](x: Self & DrawerNavigationState[ParamList]) {
      
      inline def setHistory(value: js.Array[KeyType | `6`]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: (KeyType | `6`)*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawerRouterOptions
    extends StObject
       with TabRouterOptions {
    
    var openByDefault: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerRouterOptions {
    
    inline def apply(): DrawerRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerRouterOptions]
    }
    
    extension [Self <: DrawerRouterOptions](x: Self) {
      
      inline def setOpenByDefault(value: Boolean): Self = StObject.set(x, "openByDefault", value.asInstanceOf[js.Any])
      
      inline def setOpenByDefaultUndefined: Self = StObject.set(x, "openByDefault", js.undefined)
    }
  }
}
