package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToolbar extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Toolbar
}
object TypeofToolbar {
  
  inline def apply(Locale: Any, fn: Toolbar): TypeofToolbar = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToolbar]
  }
  
  extension [Self <: TypeofToolbar](x: Self) {
    
    inline def setFn(value: Toolbar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
