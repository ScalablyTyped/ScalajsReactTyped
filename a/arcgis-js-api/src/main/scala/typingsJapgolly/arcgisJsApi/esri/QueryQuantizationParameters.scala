package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`lower-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`upper-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.edit
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.view
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQuantizationParameters
  extends StObject
     with Object {
  
  /**
    * An extent defining the quantization grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#quantizationParameters)
    */
  var extent: js.UndefOr[Extent] = js.undefined
  
  /**
    * Geometry coordinates are optimized for viewing and displaying of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#quantizationParameters)
    */
  var mode: js.UndefOr[view | edit] = js.undefined
  
  /**
    * The integer's coordinates will be returned relative to the origin position defined by this property value.
    *
    * @default upper-left
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#quantizationParameters)
    */
  var originPosition: js.UndefOr[`upper-left` | `lower-left`] = js.undefined
  
  /**
    * The size of one pixel in the units of the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outSpatialReference).
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#quantizationParameters)
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}
object QueryQuantizationParameters {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): QueryQuantizationParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[QueryQuantizationParameters]
  }
  
  extension [Self <: QueryQuantizationParameters](x: Self) {
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setMode(value: view | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOriginPosition(value: `upper-left` | `lower-left`): Self = StObject.set(x, "originPosition", value.asInstanceOf[js.Any])
    
    inline def setOriginPositionUndefined: Self = StObject.set(x, "originPosition", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
