package typingsJapgolly.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotType extends StObject {
  
  var plotType: String
  
  var statistic: typingsJapgolly.antvG2plot.libTypesStatisticMod.Statistic
}
object PlotType {
  
  inline def apply(plotType: String, statistic: typingsJapgolly.antvG2plot.libTypesStatisticMod.Statistic): PlotType = {
    val __obj = js.Dynamic.literal(plotType = plotType.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotType]
  }
  
  extension [Self <: PlotType](x: Self) {
    
    inline def setPlotType(value: String): Self = StObject.set(x, "plotType", value.asInstanceOf[js.Any])
    
    inline def setStatistic(value: typingsJapgolly.antvG2plot.libTypesStatisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
  }
}
