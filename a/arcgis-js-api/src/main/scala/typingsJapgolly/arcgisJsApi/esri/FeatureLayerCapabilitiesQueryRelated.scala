package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerCapabilitiesQueryRelated
  extends StObject
     with Object {
  
  /**
    * Indicates if the [relationship query operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) supports a cache hint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCacheHint: Boolean
  
  /**
    * Indicates if the layer's query response includes the number of features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCount: Boolean
  
  /**
    * Indicates if the related features or records returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean
  
  /**
    * Indicates if the query response supports pagination for related features or records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsPagination: Boolean
}
object FeatureLayerCapabilitiesQueryRelated {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCacheHint: Boolean,
    supportsCount: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean
  ): FeatureLayerCapabilitiesQueryRelated = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any], supportsCount = supportsCount.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesQueryRelated]
  }
  
  extension [Self <: FeatureLayerCapabilitiesQueryRelated](x: Self) {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
    
    inline def setSupportsCount(value: Boolean): Self = StObject.set(x, "supportsCount", value.asInstanceOf[js.Any])
    
    inline def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
  }
}
