package typingsJapgolly.reactNavigation.anon

import typingsJapgolly.reactNavigation.mod.NavigationRouter
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfig
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions[Options, NavigationPropType] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, Any]] = js.undefined
  
  var router: NavigationRouter[Options, js.Object]
}
object NavigationOptions {
  
  inline def apply[Options, NavigationPropType](router: NavigationRouter[Options, js.Object]): NavigationOptions[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions[Options, NavigationPropType]]
  }
  
  extension [Self <: NavigationOptions[?, ?], Options, NavigationPropType](x: Self & (NavigationOptions[Options, NavigationPropType])) {
    
    inline def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationPropType, Any]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationPropType, Any]) & NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    inline def setRouter(value: NavigationRouter[Options, js.Object]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
