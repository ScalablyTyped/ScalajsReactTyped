package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSunburstBreadcrumbsSeparatorStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object PlotSunburstBreadcrumbsSeparatorStyleOptions {
  
  inline def apply(): PlotSunburstBreadcrumbsSeparatorStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstBreadcrumbsSeparatorStyleOptions]
  }
  
  extension [Self <: PlotSunburstBreadcrumbsSeparatorStyleOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
