package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ISO8601
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.time
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDimension
  extends StObject
     with Object {
  
  /**
    * Default value(s) for the time dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimension)
    */
  var default: js.Array[js.Date | TimeDimensionInterval]
  
  /**
    * Available value(s) for the time dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimension)
    */
  var extent: js.Array[js.Date | TimeDimensionInterval]
  
  /**
    * Indicates whether multiple values of the dimension may be requested.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimension)
    */
  var multipleValues: Boolean
  
  /**
    * Name of dimensional axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimension)
    */
  var name: time
  
  /**
    * Indicates whether the nearest value of the dimension will be returned in response to a request for a nearby value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimension)
    */
  var nearestValue: Boolean
  
  /**
    * Units of dimensional axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimension)
    */
  var units: ISO8601
}
object TimeDimension {
  
  inline def apply(
    constructor: js.Function,
    default: js.Array[js.Date | TimeDimensionInterval],
    extent: js.Array[js.Date | TimeDimensionInterval],
    hasOwnProperty: PropertyKey => Boolean,
    multipleValues: Boolean,
    nearestValue: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TimeDimension = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), multipleValues = multipleValues.asInstanceOf[js.Any], name = "time", nearestValue = nearestValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), units = "ISO8601")
    __obj.asInstanceOf[TimeDimension]
  }
  
  extension [Self <: TimeDimension](x: Self) {
    
    inline def setDefault(value: js.Array[js.Date | TimeDimensionInterval]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultVarargs(value: (js.Date | TimeDimensionInterval)*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setExtent(value: js.Array[js.Date | TimeDimensionInterval]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentVarargs(value: (js.Date | TimeDimensionInterval)*): Self = StObject.set(x, "extent", js.Array(value*))
    
    inline def setMultipleValues(value: Boolean): Self = StObject.set(x, "multipleValues", value.asInstanceOf[js.Any])
    
    inline def setName(value: time): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNearestValue(value: Boolean): Self = StObject.set(x, "nearestValue", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: ISO8601): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
