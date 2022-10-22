package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsLastRoute
  extends StObject
     with RouteLayerSolveResult {
  
  /**
    * Collection of point barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  @JSName("pointBarriers")
  var pointBarriers_DirectionsLastRoute: Collection[PointBarrier]
  
  /**
    * Collection of polygon barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  @JSName("polygonBarriers")
  var polygonBarriers_DirectionsLastRoute: Collection[PolygonBarrier]
  
  /**
    * Collection of polyline barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  @JSName("polylineBarriers")
  var polylineBarriers_DirectionsLastRoute: Collection[PolylineBarrier]
}
object DirectionsLastRoute {
  
  inline def apply(
    constructor: js.Function,
    directionLines: Collection[DirectionLine],
    directionPoints: Collection[DirectionPoint],
    hasOwnProperty: PropertyKey => Boolean,
    pointBarriers: Collection[PointBarrier],
    polygonBarriers: Collection[PolygonBarrier],
    polylineBarriers: Collection[PolylineBarrier],
    propertyIsEnumerable: PropertyKey => Boolean,
    routeInfo: RouteInfo,
    stops: Collection[Stop]
  ): DirectionsLastRoute = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], directionLines = directionLines.asInstanceOf[js.Any], directionPoints = directionPoints.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pointBarriers = pointBarriers.asInstanceOf[js.Any], polygonBarriers = polygonBarriers.asInstanceOf[js.Any], polylineBarriers = polylineBarriers.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), routeInfo = routeInfo.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsLastRoute]
  }
  
  extension [Self <: DirectionsLastRoute](x: Self) {
    
    inline def setPointBarriers(value: Collection[PointBarrier]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriers(value: Collection[PolygonBarrier]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriers(value: Collection[PolylineBarrier]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
  }
}
