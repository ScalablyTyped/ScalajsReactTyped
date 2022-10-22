package typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNavigationCore.anon.NavigationRoute
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigationCore.anon.Component[ParamList, RouteName]
  - typingsJapgolly.reactNavigationCore.anon.GetComponent[ParamList, RouteName]
  - typingsJapgolly.reactNavigationCore.anon.ChildrenComponent[ParamList, RouteName]
*/
trait RouteConfigComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject
object RouteConfigComponent {
  
  inline def ChildrenComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: NavigationRoute[ParamList, RouteName] => Node): typingsJapgolly.reactNavigationCore.anon.ChildrenComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[typingsJapgolly.reactNavigationCore.anon.ChildrenComponent[ParamList, RouteName]]
  }
  
  inline def Component[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](component: ScreenComponentType[ParamList, RouteName]): typingsJapgolly.reactNavigationCore.anon.Component[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNavigationCore.anon.Component[ParamList, RouteName]]
  }
  
  inline def GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](getComponent: CallbackTo[ScreenComponentType[ParamList, RouteName]]): typingsJapgolly.reactNavigationCore.anon.GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(getComponent = getComponent.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.reactNavigationCore.anon.GetComponent[ParamList, RouteName]]
  }
}
