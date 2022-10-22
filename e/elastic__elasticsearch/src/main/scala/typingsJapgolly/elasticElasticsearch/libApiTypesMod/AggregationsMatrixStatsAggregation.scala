package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMatrixStatsAggregation
  extends StObject
     with AggregationsMatrixAggregation {
  
  var mode: js.UndefOr[SortMode] = js.undefined
}
object AggregationsMatrixStatsAggregation {
  
  inline def apply(): AggregationsMatrixStatsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMatrixStatsAggregation]
  }
  
  extension [Self <: AggregationsMatrixStatsAggregation](x: Self) {
    
    inline def setMode(value: SortMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
