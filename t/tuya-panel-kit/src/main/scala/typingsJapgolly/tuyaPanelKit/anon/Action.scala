package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: NavigationAction
}
object Action {
  
  inline def apply(action: NavigationAction): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
