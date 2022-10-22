package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.PivotPager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotPager extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PivotPager
}
object TypeofPivotPager {
  
  inline def apply(Locale: Any, fn: PivotPager): TypeofPivotPager = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotPager]
  }
  
  extension [Self <: TypeofPivotPager](x: Self) {
    
    inline def setFn(value: PivotPager): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
