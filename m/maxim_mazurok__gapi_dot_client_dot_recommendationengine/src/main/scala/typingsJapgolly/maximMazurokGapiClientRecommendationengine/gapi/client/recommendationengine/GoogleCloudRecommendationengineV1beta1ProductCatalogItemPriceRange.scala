package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange extends StObject {
  
  /** Required. The maximum product price. */
  var max: js.UndefOr[Double] = js.undefined
  
  /** Required. The minimum product price. */
  var min: js.UndefOr[Double] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
