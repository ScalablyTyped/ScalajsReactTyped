package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.BoundingBoxCenter
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CenterOfMass
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.OnPolygon
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementPolygonCenter
  extends StObject
     with Object
     with MarkerPlacement {
  
  /**
    * A value indicating whether the marker should be clipped if it extends pasts the boundary of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var clipAtBoundary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The method used to determine the polygon center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var method: js.UndefOr[OnPolygon | CenterOfMass | BoundingBoxCenter] = js.undefined
  
  /**
    * The value which offsets the marker horizontally from the center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The value which offsets the marker vertically from the center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementPolygonCenter)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter
}
object CIMMarkerPlacementPolygonCenter {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMMarkerPlacementPolygonCenter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementPolygonCenter")
    __obj.asInstanceOf[CIMMarkerPlacementPolygonCenter]
  }
  
  extension [Self <: CIMMarkerPlacementPolygonCenter](x: Self) {
    
    inline def setClipAtBoundary(value: Boolean): Self = StObject.set(x, "clipAtBoundary", value.asInstanceOf[js.Any])
    
    inline def setClipAtBoundaryUndefined: Self = StObject.set(x, "clipAtBoundary", js.undefined)
    
    inline def setMethod(value: OnPolygon | CenterOfMass | BoundingBoxCenter): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
