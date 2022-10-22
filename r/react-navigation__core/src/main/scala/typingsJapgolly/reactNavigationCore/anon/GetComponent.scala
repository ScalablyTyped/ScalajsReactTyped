package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteConfigComponent
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.ScreenComponentType
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */]
  extends StObject
     with RouteConfigComponent[ParamList, RouteName] {
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Lazily get a React component to render for this screen.
    */
  def getComponent(): ScreenComponentType[ParamList, RouteName]
}
object GetComponent {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](getComponent: CallbackTo[ScreenComponentType[ParamList, RouteName]]): GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(getComponent = getComponent.toJsFn)
    __obj.asInstanceOf[GetComponent[ParamList, RouteName]]
  }
  
  extension [Self <: GetComponent[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (GetComponent[ParamList, RouteName])) {
    
    inline def setGetComponent(value: CallbackTo[ScreenComponentType[ParamList, RouteName]]): Self = StObject.set(x, "getComponent", value.toJsFn)
  }
}
