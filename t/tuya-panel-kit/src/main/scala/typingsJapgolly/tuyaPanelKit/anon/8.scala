package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var state: js.UndefOr[NavigationState[ParamListBase] | PartialStateNavigationSta] = js.undefined
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setState(value: NavigationState[ParamListBase] | PartialStateNavigationSta): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
