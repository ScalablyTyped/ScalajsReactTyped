package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorUpdateEventInfo
  extends StObject
     with Object
     with CreateToolEventInfo {
  
  /**
    * An array of numbers representing the coordinates of the cursor location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
    */
  var coordinates: js.Array[Double]
  
  /**
    * Type is always `cursor-update`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#CursorUpdateEventInfo)
    */
  var `type`: `cursor-update`
}
object CursorUpdateEventInfo {
  
  inline def apply(
    constructor: js.Function,
    coordinates: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CursorUpdateEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("cursor-update")
    __obj.asInstanceOf[CursorUpdateEventInfo]
  }
  
  extension [Self <: CursorUpdateEventInfo](x: Self) {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: `cursor-update`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
