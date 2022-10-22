package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsLinearMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsSimpleMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsEwmaMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsHoltMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsHoltWintersMovingAverageAggregation
*/
trait AggregationsMovingAverageAggregation extends StObject
object AggregationsMovingAverageAggregation {
  
  inline def AggregationsEwmaMovingAverageAggregation(settings: AggregationsEwmaModelSettings): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsEwmaMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "ewma", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsEwmaMovingAverageAggregation]
  }
  
  inline def AggregationsHoltMovingAverageAggregation(settings: AggregationsHoltLinearModelSettings): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsHoltMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsHoltMovingAverageAggregation]
  }
  
  inline def AggregationsHoltWintersMovingAverageAggregation(settings: AggregationsHoltWintersModelSettings): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsHoltWintersMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt_winters", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsHoltWintersMovingAverageAggregation]
  }
  
  inline def AggregationsLinearMovingAverageAggregation(settings: EmptyObject): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsLinearMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "linear", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsLinearMovingAverageAggregation]
  }
  
  inline def AggregationsSimpleMovingAverageAggregation(settings: EmptyObject): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsSimpleMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "simple", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsSimpleMovingAverageAggregation]
  }
}
