package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rotate-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`rotate-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rotate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.scale
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.MoveEventInfo
  - typingsJapgolly.arcgisJsApi.esri.ReshapeEventInfo
  - typingsJapgolly.arcgisJsApi.esri.RotateEventInfo
  - typingsJapgolly.arcgisJsApi.esri.ScaleEventInfo
  - typingsJapgolly.arcgisJsApi.esri.SelectionChangeEventInfo
  - typingsJapgolly.arcgisJsApi.esri.VertexAddEventInfo
  - typingsJapgolly.arcgisJsApi.esri.VertexRemoveEventInfo
*/
trait UpdateToolEventInfo extends StObject
object UpdateToolEventInfo {
  
  inline def MoveEventInfo(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `move-start` | move | `move-stop`
  ): typingsJapgolly.arcgisJsApi.esri.MoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mover = mover.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.MoveEventInfo]
  }
  
  inline def ReshapeEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): typingsJapgolly.arcgisJsApi.esri.ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.ReshapeEventInfo]
  }
  
  inline def RotateEventInfo(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `rotate-start` | rotate | `rotate-stop`
  ): typingsJapgolly.arcgisJsApi.esri.RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.RotateEventInfo]
  }
  
  inline def ScaleEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): typingsJapgolly.arcgisJsApi.esri.ScaleEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.ScaleEventInfo]
  }
  
  inline def SelectionChangeEventInfo(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    removed: js.Array[Graphic]
  ): typingsJapgolly.arcgisJsApi.esri.SelectionChangeEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selection-change")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SelectionChangeEventInfo]
  }
  
  inline def VertexAddEventInfo(
    added: js.Array[Double],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertices: js.Array[VertexAddEventInfoVertices]
  ): typingsJapgolly.arcgisJsApi.esri.VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-add")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.VertexAddEventInfo]
  }
  
  inline def VertexRemoveEventInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    removed: js.Array[Double],
    vertices: js.Array[VertexRemoveEventInfoVertices]
  ): typingsJapgolly.arcgisJsApi.esri.VertexRemoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), removed = removed.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-remove")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.VertexRemoveEventInfo]
  }
}
