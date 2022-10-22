package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.media
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewMediaHit
  extends StObject
     with Object
     with SceneViewViewHit {
  
  /**
    * The distance from the camera position to the point geometry hit on this graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#MediaHit)
    */
  var distance: Double
  
  /**
    * An element representing a media element in [MediaLayer.source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source) that intersects the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#MediaHit)
    */
  var element: ImageElement
  
  /**
    * The media layer that contains the element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#MediaHit)
    */
  var layer: MediaLayer
  
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#MediaHit)
    */
  var mapPoint: Point
  
  var `type`: media
}
object SceneViewMediaHit {
  
  inline def apply(
    constructor: js.Function,
    distance: Double,
    element: ImageElement,
    hasOwnProperty: PropertyKey => Boolean,
    layer: MediaLayer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewMediaHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[SceneViewMediaHit]
  }
  
  extension [Self <: SceneViewMediaHit](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setElement(value: ImageElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: MediaLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setType(value: media): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
