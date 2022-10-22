package typingsJapgolly.reactNavigation.anon

import typingsJapgolly.reactNavigation.mod.NavigationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nav extends StObject {
  
  var nav: NavigationState | Null
}
object Nav {
  
  inline def apply(): Nav = {
    val __obj = js.Dynamic.literal(nav = null)
    __obj.asInstanceOf[Nav]
  }
  
  extension [Self <: Nav](x: Self) {
    
    inline def setNav(value: NavigationState): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavNull: Self = StObject.set(x, "nav", null)
  }
}
