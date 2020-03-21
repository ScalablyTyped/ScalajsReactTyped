package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext extends Object {
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
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def bindRenderTarget(): Unit
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def resetWebGLState(): Unit
}

object RenderContext {
  @scala.inline
  def apply(
    bindRenderTarget: Callback,
    camera: RenderCamera,
    constructor: js.Function,
    gl: WebGLRenderingContext,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    resetWebGLState: Callback,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], sunLight = sunLight.asInstanceOf[js.Any])
    __obj.updateDynamic("bindRenderTarget")(bindRenderTarget.toJsFn)
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("resetWebGLState")(resetWebGLState.toJsFn)
    __obj.asInstanceOf[RenderContext]
  }
}

