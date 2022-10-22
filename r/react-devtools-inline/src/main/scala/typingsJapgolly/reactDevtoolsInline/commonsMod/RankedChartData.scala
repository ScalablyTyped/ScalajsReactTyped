package typingsJapgolly.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankedChartData extends StObject {
  
  var maxValue: Double
  
  var nodes: js.Array[ChartNode]
}
object RankedChartData {
  
  inline def apply(maxValue: Double, nodes: js.Array[ChartNode]): RankedChartData = {
    val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankedChartData]
  }
  
  extension [Self <: RankedChartData](x: Self) {
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[ChartNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: ChartNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
