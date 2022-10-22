package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcLegendMod.LegendConfig
import typingsJapgolly.vegaTypings.typesSpecLegendMod.LegendOrient
import typingsJapgolly.vegaTypings.typesSpecLegendMod.LegendType
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  var legend: typingsJapgolly.vegaLite.buildSrcLegendMod.Legend[SignalRef]
  
  var legendConfig: LegendConfig[SignalRef]
  
  var legendType: LegendType
  
  var orient: LegendOrient
}
object Legend {
  
  inline def apply(
    legend: typingsJapgolly.vegaLite.buildSrcLegendMod.Legend[SignalRef],
    legendConfig: LegendConfig[SignalRef],
    legendType: LegendType,
    orient: LegendOrient
  ): Legend = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  extension [Self <: Legend](x: Self) {
    
    inline def setLegend(value: typingsJapgolly.vegaLite.buildSrcLegendMod.Legend[SignalRef]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendConfig(value: LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    inline def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
  }
}
