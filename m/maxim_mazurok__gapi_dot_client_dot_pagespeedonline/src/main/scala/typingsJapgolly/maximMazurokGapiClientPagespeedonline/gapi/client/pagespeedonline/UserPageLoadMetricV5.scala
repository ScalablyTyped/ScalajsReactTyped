package typingsJapgolly.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPageLoadMetricV5 extends StObject {
  
  /** The category of the specific time metric. */
  var category: js.UndefOr[String] = js.undefined
  
  /** Metric distributions. Proportions should sum up to 1. */
  var distributions: js.UndefOr[js.Array[Bucket]] = js.undefined
  
  /** Identifies the form factor of the metric being collected. */
  var formFactor: js.UndefOr[String] = js.undefined
  
  /** The median number of the metric, in millisecond. */
  var median: js.UndefOr[Double] = js.undefined
  
  /** Identifies the type of the metric. */
  var metricId: js.UndefOr[String] = js.undefined
  
  /** We use this field to store certain percentile value for this metric. For v4, this field contains pc50. For v5, this field contains pc90. */
  var percentile: js.UndefOr[Double] = js.undefined
}
object UserPageLoadMetricV5 {
  
  inline def apply(): UserPageLoadMetricV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPageLoadMetricV5]
  }
  
  extension [Self <: UserPageLoadMetricV5](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDistributions(value: js.Array[Bucket]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: Bucket*): Self = StObject.set(x, "distributions", js.Array(value*))
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    inline def setMetricId(value: String): Self = StObject.set(x, "metricId", value.asInstanceOf[js.Any])
    
    inline def setMetricIdUndefined: Self = StObject.set(x, "metricId", js.undefined)
    
    inline def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
    
    inline def setPercentileUndefined: Self = StObject.set(x, "percentile", js.undefined)
  }
}
