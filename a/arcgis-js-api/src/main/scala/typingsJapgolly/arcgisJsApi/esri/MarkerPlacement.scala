package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LineBeginning
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LineEnd
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LineMiddle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.SegmentMidpoint
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAlongLineSameSize
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAtExtremities
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAtRatioPositions
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementInsidePolygon
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementOnLine
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementOnVertices
  - typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementPolygonCenter
*/
trait MarkerPlacement extends StObject
object MarkerPlacement {
  
  inline def CIMMarkerPlacementAlongLineSameSize(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    placementTemplate: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAlongLineSameSize = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), placementTemplate = placementTemplate.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineSameSize")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAlongLineSameSize]
  }
  
  inline def CIMMarkerPlacementAtExtremities(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAtExtremities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementAtExtremities")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAtExtremities]
  }
  
  inline def CIMMarkerPlacementAtRatioPositions(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    positionArray: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAtRatioPositions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), positionArray = positionArray.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementAtRatioPositions")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementAtRatioPositions]
  }
  
  inline def CIMMarkerPlacementInsidePolygon(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementInsidePolygon = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementInsidePolygon")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementInsidePolygon]
  }
  
  inline def CIMMarkerPlacementOnLine(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relativeTo: LineMiddle | LineBeginning | LineEnd | SegmentMidpoint
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementOnLine = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerPlacementOnLine")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementOnLine]
  }
  
  inline def CIMMarkerPlacementOnVertices(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementOnVertices = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementOnVertices")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementOnVertices]
  }
  
  inline def CIMMarkerPlacementPolygonCenter(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementPolygonCenter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementPolygonCenter")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMMarkerPlacementPolygonCenter]
  }
}
