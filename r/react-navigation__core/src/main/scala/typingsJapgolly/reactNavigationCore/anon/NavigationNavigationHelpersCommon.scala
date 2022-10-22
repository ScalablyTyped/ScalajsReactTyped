package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationHelpersCommon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigationHelpersCommon extends StObject {
  
  var navigation: NavigationHelpersCommon[Any, Any]
}
object NavigationNavigationHelpersCommon {
  
  inline def apply(navigation: NavigationHelpersCommon[Any, Any]): NavigationNavigationHelpersCommon = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigationHelpersCommon]
  }
  
  extension [Self <: NavigationNavigationHelpersCommon](x: Self) {
    
    inline def setNavigation(value: NavigationHelpersCommon[Any, Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
  }
}
