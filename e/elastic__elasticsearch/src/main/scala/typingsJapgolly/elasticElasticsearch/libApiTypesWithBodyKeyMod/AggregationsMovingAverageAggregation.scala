package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLinearMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsEwmaMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltMovingAverageAggregation
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltWintersMovingAverageAggregation
*/
trait AggregationsMovingAverageAggregation extends StObject
object AggregationsMovingAverageAggregation {
  
  inline def AggregationsEwmaMovingAverageAggregation(settings: AggregationsEwmaModelSettings): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsEwmaMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "ewma", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsEwmaMovingAverageAggregation]
  }
  
  inline def AggregationsHoltMovingAverageAggregation(settings: AggregationsHoltLinearModelSettings): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltMovingAverageAggregation]
  }
  
  inline def AggregationsHoltWintersMovingAverageAggregation(settings: AggregationsHoltWintersModelSettings): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltWintersMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt_winters", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsHoltWintersMovingAverageAggregation]
  }
  
  inline def AggregationsLinearMovingAverageAggregation(settings: EmptyObject): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLinearMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "linear", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsLinearMovingAverageAggregation]
  }
  
  inline def AggregationsSimpleMovingAverageAggregation(settings: EmptyObject): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "simple", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSimpleMovingAverageAggregation]
  }
}
