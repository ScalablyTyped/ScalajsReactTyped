package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingFieldStatistics
  extends StObject
     with Object {
  
  /**
    * Name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var fieldName: String
  
  /**
    * Label of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var label: String
  
  /**
    * Maximum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var max: Double
  
  /**
    * Minimum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var min: Double
  
  /**
    * Model Name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var modelName: String
  
  /**
    * List of the most frequent values of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var mostFrequentValues: js.Array[Double | String]
  
  /**
    * List of sublayer ids where this field is available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var subLayerIds: js.Array[Double]
}
object BuildingFieldStatistics {
  
  inline def apply(
    constructor: js.Function,
    fieldName: String,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    max: Double,
    min: Double,
    modelName: String,
    mostFrequentValues: js.Array[Double | String],
    propertyIsEnumerable: PropertyKey => Boolean,
    subLayerIds: js.Array[Double]
  ): BuildingFieldStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], mostFrequentValues = mostFrequentValues.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), subLayerIds = subLayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingFieldStatistics]
  }
  
  extension [Self <: BuildingFieldStatistics](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setMostFrequentValues(value: js.Array[Double | String]): Self = StObject.set(x, "mostFrequentValues", value.asInstanceOf[js.Any])
    
    inline def setMostFrequentValuesVarargs(value: (Double | String)*): Self = StObject.set(x, "mostFrequentValues", js.Array(value*))
    
    inline def setSubLayerIds(value: js.Array[Double]): Self = StObject.set(x, "subLayerIds", value.asInstanceOf[js.Any])
    
    inline def setSubLayerIdsVarargs(value: Double*): Self = StObject.set(x, "subLayerIds", js.Array(value*))
  }
}
