package typingsJapgolly.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigation.mod.NavigationInitAction
  - typingsJapgolly.reactNavigation.mod.NavigationNavigateAction
  - typingsJapgolly.reactNavigation.mod.NavigationBackAction
*/
trait NavigationTabAction
  extends StObject
     with _NavigationAction
object NavigationTabAction {
  
  inline def NavigationBackAction(): typingsJapgolly.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationBackAction]
  }
  
  inline def NavigationInitAction(): typingsJapgolly.reactNavigation.mod.NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/INIT")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationInitAction]
  }
  
  inline def NavigationNavigateAction(routeName: String): typingsJapgolly.reactNavigation.mod.NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/NAVIGATE")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationNavigateAction]
  }
}
