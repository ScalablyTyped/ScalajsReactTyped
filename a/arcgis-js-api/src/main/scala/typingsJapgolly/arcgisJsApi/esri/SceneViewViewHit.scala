package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.SceneViewGraphicHit
  - typingsJapgolly.arcgisJsApi.esri.SceneViewMediaHit
*/
trait SceneViewViewHit extends StObject
object SceneViewViewHit {
  
  inline def SceneViewGraphicHit(
    constructor: js.Function,
    distance: Double,
    graphic: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    layer: Layer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.SceneViewGraphicHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("graphic")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SceneViewGraphicHit]
  }
  
  inline def SceneViewMediaHit(
    constructor: js.Function,
    distance: Double,
    element: ImageElement,
    hasOwnProperty: PropertyKey => Boolean,
    layer: MediaLayer,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.SceneViewMediaHit = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("media")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SceneViewMediaHit]
  }
}
