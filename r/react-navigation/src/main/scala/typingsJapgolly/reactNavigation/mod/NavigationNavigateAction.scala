package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigateAction
  extends StObject
     with NavigationNavigateActionPayload
     with NavigationStackAction
     with NavigationTabAction {
  
  var `type`: NavigationSlashNAVIGATE
}
object NavigationNavigateAction {
  
  inline def apply(routeName: String): NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/NAVIGATE")
    __obj.asInstanceOf[NavigationNavigateAction]
  }
  
  extension [Self <: NavigationNavigateAction](x: Self) {
    
    inline def setType(value: NavigationSlashNAVIGATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
