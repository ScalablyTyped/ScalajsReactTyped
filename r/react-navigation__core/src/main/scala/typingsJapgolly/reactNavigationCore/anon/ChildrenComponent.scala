package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteConfigComponent
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */]
  extends StObject
     with RouteConfigComponent[ParamList, RouteName] {
  
  /**
    * Render callback to render content of this screen.
    */
  def children(props: NavigationRoute[ParamList, RouteName]): Node
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  var getComponent: js.UndefOr[scala.Nothing] = js.undefined
}
object ChildrenComponent {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: NavigationRoute[ParamList, RouteName] => Node): ChildrenComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ChildrenComponent[ParamList, RouteName]]
  }
  
  extension [Self <: ChildrenComponent[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (ChildrenComponent[ParamList, RouteName])) {
    
    inline def setChildren(value: NavigationRoute[ParamList, RouteName] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
