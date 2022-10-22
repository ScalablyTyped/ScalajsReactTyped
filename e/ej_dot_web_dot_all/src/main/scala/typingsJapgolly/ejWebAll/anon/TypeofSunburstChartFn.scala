package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.datavisualization.SunburstChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSunburstChartFn extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: SunburstChart
}
object TypeofSunburstChartFn {
  
  inline def apply(Locale: Any, fn: SunburstChart): TypeofSunburstChartFn = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSunburstChartFn]
  }
  
  extension [Self <: TypeofSunburstChartFn](x: Self) {
    
    inline def setFn(value: SunburstChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
