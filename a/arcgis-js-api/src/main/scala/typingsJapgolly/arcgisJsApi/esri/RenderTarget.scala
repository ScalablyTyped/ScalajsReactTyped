package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTarget
  extends StObject
     with Object {
  
  /**
    * The framebuffer where the [render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render) method should direct its output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
    */
  var framebuffer: Any
  
  /**
    * A viewport that fully covers `framebuffer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
    */
  var viewport: js.Array[Double]
}
object RenderTarget {
  
  inline def apply(
    constructor: js.Function,
    framebuffer: Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    viewport: js.Array[Double]
  ): RenderTarget = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], framebuffer = framebuffer.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTarget]
  }
  
  extension [Self <: RenderTarget](x: Self) {
    
    inline def setFramebuffer(value: Any): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: js.Array[Double]): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportVarargs(value: Double*): Self = StObject.set(x, "viewport", js.Array(value*))
  }
}
