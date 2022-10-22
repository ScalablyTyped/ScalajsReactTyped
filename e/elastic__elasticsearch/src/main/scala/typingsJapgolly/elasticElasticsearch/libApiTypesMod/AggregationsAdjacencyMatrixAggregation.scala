package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAdjacencyMatrixAggregation
  extends StObject
     with AggregationsAggregation {
  
  var filters: js.UndefOr[Record[String, QueryDslQueryContainer]] = js.undefined
}
object AggregationsAdjacencyMatrixAggregation {
  
  inline def apply(): AggregationsAdjacencyMatrixAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAdjacencyMatrixAggregation]
  }
  
  extension [Self <: AggregationsAdjacencyMatrixAggregation](x: Self) {
    
    inline def setFilters(value: Record[String, QueryDslQueryContainer]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
  }
}
