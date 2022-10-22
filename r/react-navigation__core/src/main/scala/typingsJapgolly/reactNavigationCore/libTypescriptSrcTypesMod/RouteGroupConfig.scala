package typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNavigationCore.anon.NavigationAny
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteGroupConfig[ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */] extends StObject {
  
  /**
    * Children React Elements to extract the route configuration from.
    * Only `Screen`, `Group` and `React.Fragment` are supported as children.
    */
  var children: Node
  
  /**
    * Optional key for the screens in this group.
    * If the key changes, all existing screens in this group will be removed or reset.
    */
  var navigationKey: js.UndefOr[String] = js.undefined
  
  /**
    * Navigator options for this screen.
    */
  var screenOptions: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ NavigationAny[ParamList], ScreenOptions])
  ] = js.undefined
}
object RouteGroupConfig {
  
  inline def apply[ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */](): RouteGroupConfig[ParamList, ScreenOptions] = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[RouteGroupConfig[ParamList, ScreenOptions]]
  }
  
  extension [Self <: RouteGroupConfig[?, ?], ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */](x: Self & (RouteGroupConfig[ParamList, ScreenOptions])) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNavigationKey(value: String): Self = StObject.set(x, "navigationKey", value.asInstanceOf[js.Any])
    
    inline def setNavigationKeyUndefined: Self = StObject.set(x, "navigationKey", js.undefined)
    
    inline def setScreenOptions(value: ScreenOptions | (js.Function1[/* props */ NavigationAny[ParamList], ScreenOptions])): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
    
    inline def setScreenOptionsFunction1(value: /* props */ NavigationAny[ParamList] => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
    
    inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
  }
}
