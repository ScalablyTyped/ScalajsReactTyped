package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSolveResultProperties extends StObject {
  
  /**
    * Message received when the solve is complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.undefined
  
  /**
    * Point barriers are an array of graphics with point geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * Polygon barriers are an array of graphics with polygon geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * Polyline barriers are an array of graphics with polyline geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * An array of route results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#routeResults)
    */
  var routeResults: js.UndefOr[js.Array[RouteResultProperties]] = js.undefined
}
object RouteSolveResultProperties {
  
  inline def apply(): RouteSolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSolveResultProperties]
  }
  
  extension [Self <: RouteSolveResultProperties](x: Self) {
    
    inline def setMessages(value: js.Array[NAMessageProperties]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: NAMessageProperties*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setPointBarriers(value: js.Array[GraphicProperties]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPointBarriersVarargs(value: GraphicProperties*): Self = StObject.set(x, "pointBarriers", js.Array(value*))
    
    inline def setPolygonBarriers(value: js.Array[GraphicProperties]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolygonBarriersVarargs(value: GraphicProperties*): Self = StObject.set(x, "polygonBarriers", js.Array(value*))
    
    inline def setPolylineBarriers(value: js.Array[GraphicProperties]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setPolylineBarriersVarargs(value: GraphicProperties*): Self = StObject.set(x, "polylineBarriers", js.Array(value*))
    
    inline def setRouteResults(value: js.Array[RouteResultProperties]): Self = StObject.set(x, "routeResults", value.asInstanceOf[js.Any])
    
    inline def setRouteResultsUndefined: Self = StObject.set(x, "routeResults", js.undefined)
    
    inline def setRouteResultsVarargs(value: RouteResultProperties*): Self = StObject.set(x, "routeResults", js.Array(value*))
  }
}
