package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.scale
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleEventInfo
  extends StObject
     with Object
     with UpdateToolEventInfo {
  
  /**
    * Returns information indicating the stage of the scale operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var `type`: `scale-start` | scale | `scale-stop`
  
  /**
    * The x scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var xScale: Double
  
  /**
    * The y scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var yScale: Double
}
object ScaleEventInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): ScaleEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEventInfo]
  }
  
  extension [Self <: ScaleEventInfo](x: Self) {
    
    inline def setType(value: `scale-start` | scale | `scale-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXScale(value: Double): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(value: Double): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
