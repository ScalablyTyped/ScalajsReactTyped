package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshapeEventInfo
  extends StObject
     with Object
     with UpdateToolEventInfo {
  
  /**
    * Returns information indicating the stage of the reshape operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ReshapeEventInfo)
    */
  var `type`: `reshape-start` | reshape | `reshape-stop`
}
object ReshapeEventInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeEventInfo]
  }
  
  extension [Self <: ReshapeEventInfo](x: Self) {
    
    inline def setType(value: `reshape-start` | reshape | `reshape-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
