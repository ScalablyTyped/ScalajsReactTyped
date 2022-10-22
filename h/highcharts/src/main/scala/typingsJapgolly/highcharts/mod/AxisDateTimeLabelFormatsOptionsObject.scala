package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDateTimeLabelFormatsOptionsObject extends StObject {
  
  var main: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
}
object AxisDateTimeLabelFormatsOptionsObject {
  
  inline def apply(): AxisDateTimeLabelFormatsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDateTimeLabelFormatsOptionsObject]
  }
  
  extension [Self <: AxisDateTimeLabelFormatsOptionsObject](x: Self) {
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
