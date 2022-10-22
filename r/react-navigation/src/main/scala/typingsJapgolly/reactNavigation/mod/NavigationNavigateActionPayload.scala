package typingsJapgolly.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigateActionPayload extends StObject {
  
  // The action to run inside the sub-router
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[NavigationParams] = js.undefined
  
  var routeName: String
}
object NavigationNavigateActionPayload {
  
  inline def apply(routeName: String): NavigationNavigateActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigateActionPayload]
  }
  
  extension [Self <: NavigationNavigateActionPayload](x: Self) {
    
    inline def setAction(value: NavigationNavigateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
