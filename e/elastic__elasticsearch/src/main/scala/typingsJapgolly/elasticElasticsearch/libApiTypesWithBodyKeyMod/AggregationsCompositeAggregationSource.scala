package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCompositeAggregationSource extends StObject {
  
  var date_histogram: js.UndefOr[AggregationsDateHistogramAggregation] = js.undefined
  
  var geotile_grid: js.UndefOr[AggregationsGeoTileGridAggregation] = js.undefined
  
  var histogram: js.UndefOr[AggregationsHistogramAggregation] = js.undefined
  
  var terms: js.UndefOr[AggregationsTermsAggregation] = js.undefined
}
object AggregationsCompositeAggregationSource {
  
  inline def apply(): AggregationsCompositeAggregationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsCompositeAggregationSource]
  }
  
  extension [Self <: AggregationsCompositeAggregationSource](x: Self) {
    
    inline def setDate_histogram(value: AggregationsDateHistogramAggregation): Self = StObject.set(x, "date_histogram", value.asInstanceOf[js.Any])
    
    inline def setDate_histogramUndefined: Self = StObject.set(x, "date_histogram", js.undefined)
    
    inline def setGeotile_grid(value: AggregationsGeoTileGridAggregation): Self = StObject.set(x, "geotile_grid", value.asInstanceOf[js.Any])
    
    inline def setGeotile_gridUndefined: Self = StObject.set(x, "geotile_grid", js.undefined)
    
    inline def setHistogram(value: AggregationsHistogramAggregation): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    inline def setTerms(value: AggregationsTermsAggregation): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
