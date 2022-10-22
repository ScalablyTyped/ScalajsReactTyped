package typingsJapgolly.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  var geometryOption: typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption
  
  var legend: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend
  
  var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  
  var yField: String
}
object Legend {
  
  inline def apply(
    geometryOption: typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption,
    legend: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend,
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    yField: String
  ): Legend = {
    val __obj = js.Dynamic.literal(geometryOption = geometryOption.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  extension [Self <: Legend](x: Self) {
    
    inline def setGeometryOption(value: typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption): Self = StObject.set(x, "geometryOption", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
  }
}
