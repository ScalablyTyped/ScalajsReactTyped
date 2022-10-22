package typingsJapgolly.ionicReact

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesRoutingViewItemMod.ViewItem
import typingsJapgolly.node.timersMod.global.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingViewStacksMod {
  
  /* note: abstract class */ @JSImport("@ionic/react/dist/types/routing/ViewStacks", "ViewStacks")
  @js.native
  open class ViewStacks () extends StObject {
    
    def add(viewItem: ViewItem[Any]): Unit = js.native
    
    def clear(outletId: String): Timeout = js.native
    
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
    
    /* protected */ def getAllViewItems(): js.Array[ViewItem[Any]] = js.native
    
    def getChildrenToRender(
      outletId: String,
      ionRouterOutlet: Element,
      routeInfo: RouteInfo[Any],
      reRender: js.Function0[Unit],
      setInTransition: js.Function0[Unit]
    ): js.Array[Node] = js.native
    
    /* protected */ def getStackIds(): js.Array[String] = js.native
    
    def getViewItemsForOutlet(outletId: String): js.Array[ViewItem[Any]] = js.native
    
    def remove(viewItem: ViewItem[Any]): Unit = js.native
    
    /* private */ var viewStacks: Any = js.native
  }
}
