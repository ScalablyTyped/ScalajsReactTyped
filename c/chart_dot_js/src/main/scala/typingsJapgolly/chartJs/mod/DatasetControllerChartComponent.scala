package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.anon.DataElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetControllerChartComponent
  extends StObject
     with ChartComponent {
  
  @JSName("defaults")
  var defaults_DatasetControllerChartComponent: DataElementType
}
object DatasetControllerChartComponent {
  
  inline def apply(defaults: DataElementType, id: String): DatasetControllerChartComponent = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetControllerChartComponent]
  }
  
  extension [Self <: DatasetControllerChartComponent](x: Self) {
    
    inline def setDefaults(value: DataElementType): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
  }
}
