package typingsJapgolly.ionicReact

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesRoutingViewItemMod.ViewItem
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingRouteManagerContextMod {
  
  @JSImport("@ionic/react/dist/types/routing/RouteManagerContext", "RouteManagerContext")
  @js.native
  val RouteManagerContext: Context[RouteManagerContextState] = js.native
  
  @js.native
  trait RouteManagerContextState extends StObject {
    
    def addViewItem(viewItem: ViewItem[Any]): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def clearOutlet(outletId: String): Unit = js.native
    
    def createViewItem(outletId: String, reactElement: Element, routeInfo: RouteInfo[Any]): ViewItem[Any] = js.native
    def createViewItem(outletId: String, reactElement: Element, routeInfo: RouteInfo[Any], page: HTMLElement): ViewItem[Any] = js.native
    
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[Any]): js.UndefOr[ViewItem[Any]] = js.native
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[Any], outletId: String): js.UndefOr[ViewItem[Any]] = js.native
    
    def findViewItemByPathname(pathname: String): js.UndefOr[ViewItem[Any]] = js.native
    def findViewItemByPathname(pathname: String, outletId: String): js.UndefOr[ViewItem[Any]] = js.native
    
    def findViewItemByRouteInfo(routeInfo: RouteInfo[Any]): js.UndefOr[ViewItem[Any]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[Any], outletId: String): js.UndefOr[ViewItem[Any]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[Any], outletId: String, updateMatch: Boolean): js.UndefOr[ViewItem[Any]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[Any], outletId: Unit, updateMatch: Boolean): js.UndefOr[ViewItem[Any]] = js.native
    
    def getChildrenToRender(
      outletId: String,
      ionRouterOutlet: Element,
      routeInfo: RouteInfo[Any],
      reRender: js.Function0[Unit]
    ): js.Array[Node] = js.native
    
    def goBack(): Unit = js.native
    
    def unMountViewItem(viewItem: ViewItem[Any]): Unit = js.native
  }
}
