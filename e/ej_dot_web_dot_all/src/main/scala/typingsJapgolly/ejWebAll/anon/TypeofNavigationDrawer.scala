package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.NavigationDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNavigationDrawer extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: NavigationDrawer
}
object TypeofNavigationDrawer {
  
  inline def apply(Locale: Any, fn: NavigationDrawer): TypeofNavigationDrawer = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNavigationDrawer]
  }
  
  extension [Self <: TypeofNavigationDrawer](x: Self) {
    
    inline def setFn(value: NavigationDrawer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
