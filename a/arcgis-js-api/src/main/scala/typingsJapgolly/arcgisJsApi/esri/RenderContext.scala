package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContext
  extends StObject
     with Object {
  
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  def bindRenderTarget(): scala.Unit
  
  /**
    * The camera used to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var camera: RenderCamera
  
  /**
    * The WebGL rendering context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var gl: WebGLRenderingContext
  
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  def resetWebGLState(): scala.Unit
  
  /**
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight
}
object RenderContext {
  
  inline def apply(
    bindRenderTarget: Callback,
    camera: RenderCamera,
    constructor: js.Function,
    gl: WebGLRenderingContext,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resetWebGLState: Callback,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(bindRenderTarget = bindRenderTarget.toJsFn, camera = camera.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resetWebGLState = resetWebGLState.toJsFn, sunLight = sunLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext]
  }
  
  extension [Self <: RenderContext](x: Self) {
    
    inline def setBindRenderTarget(value: Callback): Self = StObject.set(x, "bindRenderTarget", value.toJsFn)
    
    inline def setCamera(value: RenderCamera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setResetWebGLState(value: Callback): Self = StObject.set(x, "resetWebGLState", value.toJsFn)
    
    inline def setSunLight(value: SunLight): Self = StObject.set(x, "sunLight", value.asInstanceOf[js.Any])
  }
}
