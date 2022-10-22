package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.PivotChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotChart extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PivotChart
}
object TypeofPivotChart {
  
  inline def apply(Locale: Any, fn: PivotChart): TypeofPivotChart = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotChart]
  }
  
  extension [Self <: TypeofPivotChart](x: Self) {
    
    inline def setFn(value: PivotChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
