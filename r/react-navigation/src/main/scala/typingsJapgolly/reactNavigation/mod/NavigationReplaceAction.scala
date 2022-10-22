package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationReplaceAction
  extends StObject
     with NavigationStackAction {
  
  var action: js.UndefOr[NavigationAction] = js.undefined
  
  var key: String
  
  var params: js.UndefOr[NavigationParams] = js.undefined
  
  var routeName: String
  
  var `type`: NavigationSlashREPLACE
}
object NavigationReplaceAction {
  
  inline def apply(key: String, routeName: String): NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/REPLACE")
    __obj.asInstanceOf[NavigationReplaceAction]
  }
  
  extension [Self <: NavigationReplaceAction](x: Self) {
    
    inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    inline def setType(value: NavigationSlashREPLACE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
