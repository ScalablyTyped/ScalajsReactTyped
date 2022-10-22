package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunLight
  extends StObject
     with Object {
  
  /**
    * The ambient light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var ambient: ColorAndIntensity
  
  /**
    * The diffuse light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var diffuse: ColorAndIntensity
  
  /**
    * The incident light direction in render coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var direction: ArrayLike[Double]
}
object SunLight {
  
  inline def apply(
    ambient: ColorAndIntensity,
    constructor: js.Function,
    diffuse: ColorAndIntensity,
    direction: ArrayLike[Double],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SunLight = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SunLight]
  }
  
  extension [Self <: SunLight](x: Self) {
    
    inline def setAmbient(value: ColorAndIntensity): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    inline def setDiffuse(value: ColorAndIntensity): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: ArrayLike[Double]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
