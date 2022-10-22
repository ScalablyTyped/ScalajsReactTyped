package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingLocationHistoryMod {
  
  @JSImport("@ionic/react/dist/types/routing/LocationHistory", "LocationHistory")
  @js.native
  open class LocationHistory () extends StObject {
    
    /* private */ var _add: Any = js.native
    
    /* private */ var _areRoutesEqual: Any = js.native
    
    /* private */ var _clear: Any = js.native
    
    /* private */ var _getRouteInfosByKey: Any = js.native
    
    /* private */ var _pop: Any = js.native
    
    /* private */ var _replace: Any = js.native
    
    def add(routeInfo: RouteInfo[Any]): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def clearTabStack(tab: String): Unit = js.native
    
    def current(): RouteInfo[Any] = js.native
    
    def findLastLocation(routeInfo: RouteInfo[Any]): js.UndefOr[RouteInfo[Any]] = js.native
    
    def getCurrentRouteInfoForTab(): js.UndefOr[RouteInfo[Any]] = js.native
    def getCurrentRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[Any]] = js.native
    
    def getFirstRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[Any]] = js.native
    
    /* private */ var locationHistory: Any = js.native
    
    def previous(): RouteInfo[Any] = js.native
    
    /* private */ var tabHistory: Any = js.native
    
    def update(routeInfo: RouteInfo[Any]): Unit = js.native
  }
}
