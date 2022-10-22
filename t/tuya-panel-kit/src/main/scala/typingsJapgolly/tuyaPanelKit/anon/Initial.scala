package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initial[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var initial: js.UndefOr[scala.Nothing] = js.undefined
  
  var params: js.UndefOr[scala.Nothing] = js.undefined
  
  var screen: js.UndefOr[scala.Nothing] = js.undefined
  
  var state: js.UndefOr[PartialState[State] | State] = js.undefined
}
object Initial {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */](): Initial[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initial[State]]
  }
  
  extension [Self <: Initial[?], State /* <: NavigationState[ParamListBase] */](x: Self & Initial[State]) {
    
    inline def setState(value: PartialState[State] | State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
