package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Pager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPager extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Pager
}
object TypeofPager {
  
  inline def apply(Locale: Any, fn: Pager): TypeofPager = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPager]
  }
  
  extension [Self <: TypeofPager](x: Self) {
    
    inline def setFn(value: Pager): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
