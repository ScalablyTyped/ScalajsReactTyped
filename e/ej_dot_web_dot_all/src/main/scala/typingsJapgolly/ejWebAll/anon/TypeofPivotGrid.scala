package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.PivotGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotGrid extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PivotGrid
}
object TypeofPivotGrid {
  
  inline def apply(Locale: Any, fn: PivotGrid): TypeofPivotGrid = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGrid]
  }
  
  extension [Self <: TypeofPivotGrid](x: Self) {
    
    inline def setFn(value: PivotGrid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
