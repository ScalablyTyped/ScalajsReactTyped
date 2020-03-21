package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.mapboxGl.mapboxGlStrings.`2d`
import typingsJapgolly.mapboxGl.mapboxGlStrings.`3d`
import typingsJapgolly.mapboxGl.mapboxGlStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLayerInterface extends js.Object {
  /** A unique layer id. */
  var id: String
  /**
    * Optional method called when the layer has been added to the Map with Map#addLayer.
    * This gives the layer a chance to initialize gl resources and register event listeners.
    * @param map The Map this custom layer was just added to.
    * @param gl The gl context for the map.
    */
  var onAdd: js.UndefOr[js.Function2[/* map */ Map, /* gl */ WebGLRenderingContext, Unit]] = js.undefined
  /**
    * Optional method called when the layer has been removed from the Map with Map#removeLayer.
    * This gives the layer a chance to clean up gl resources and event listeners.
    * @param map The Map this custom layer was just added to.
    * @param gl The gl context for the map.
    */
  var onRemove: js.UndefOr[js.Function2[/* map */ Map, /* gl */ WebGLRenderingContext, Unit]] = js.undefined
  /**
    * Optional method called during a render frame to allow a layer to prepare resources
    * or render into a texture.
    *
    * The layer cannot make any assumptions about the current GL state and must bind a framebuffer
    * before rendering.
    * @param gl The map's gl context.
    * @param matrix The map's camera matrix. It projects spherical mercator coordinates to gl
    *               coordinates. The mercator coordinate  [0, 0] represents the top left corner of
    *               the mercator world and  [1, 1] represents the bottom right corner. When the
    *               renderingMode is  "3d" , the z coordinate is conformal. A box with identical
    *               x, y, and z lengths in mercator units would be rendered as a cube.
    *               MercatorCoordinate .fromLatLng can be used to project a  LngLat to a mercator
    *               coordinate.
    */
  var prerender: js.UndefOr[
    js.Function2[/* gl */ WebGLRenderingContext, /* matrix */ js.Array[Double], Unit]
  ] = js.undefined
  /* Either "2d" or "3d". Defaults to  "2d". */
  var renderingMode: js.UndefOr[`2d` | `3d`] = js.undefined
  /* The layer's type. Must be "custom". */
  var `type`: custom
  /**
    * Called during a render frame allowing the layer to draw into the GL context.
    *
    * The layer can assume blending and depth state is set to allow the layer to properly blend
    * and clip other layers. The layer cannot make any other assumptions about the current GL state.
    *
    * If the layer needs to render to a texture, it should implement the prerender method to do this
    * and only use the render method for drawing directly into the main framebuffer.
    *
    * The blend function is set to gl.blendFunc(gl.ONE, gl.ONE_MINUS_SRC_ALPHA). This expects
    * colors to be provided in premultiplied alpha form where the r, g and b values are already
    * multiplied by the a value. If you are unable to provide colors in premultiplied form you may
    * want to change the blend function to
    * gl.blendFuncSeparate(gl.SRC_ALPHA, gl.ONE_MINUS_SRC_ALPHA, gl.ONE, gl.ONE_MINUS_SRC_ALPHA).
    *
    * @param gl The map's gl context.
    * @param matrix The map's camera matrix. It projects spherical mercator coordinates to gl
    *               coordinates. The mercator coordinate  [0, 0] represents the top left corner of
    *               the mercator world and  [1, 1] represents the bottom right corner. When the
    *               renderingMode is  "3d" , the z coordinate is conformal. A box with identical
    *               x, y, and z lengths in mercator units would be rendered as a cube.
    *               MercatorCoordinate .fromLatLng can be used to project a  LngLat to a mercator
    *               coordinate.
    */
  def render(gl: WebGLRenderingContext, matrix: js.Array[Double]): Unit
}

object CustomLayerInterface {
  @scala.inline
  def apply(
    id: String,
    render: (WebGLRenderingContext, js.Array[Double]) => Callback,
    `type`: custom,
    onAdd: (/* map */ Map, /* gl */ WebGLRenderingContext) => Callback = null,
    onRemove: (/* map */ Map, /* gl */ WebGLRenderingContext) => Callback = null,
    prerender: (/* gl */ WebGLRenderingContext, /* matrix */ js.Array[Double]) => Callback = null,
    renderingMode: `2d` | `3d` = null
  ): CustomLayerInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.WebGLRenderingContext, t1: js.Array[scala.Double]) => render(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2((t0: /* map */ typingsJapgolly.mapboxGl.mod.Map, t1: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onAdd(t0, t1).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2((t0: /* map */ typingsJapgolly.mapboxGl.mod.Map, t1: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onRemove(t0, t1).runNow()))
    if (prerender != null) __obj.updateDynamic("prerender")(js.Any.fromFunction2((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext, t1: /* matrix */ js.Array[scala.Double]) => prerender(t0, t1).runNow()))
    if (renderingMode != null) __obj.updateDynamic("renderingMode")(renderingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLayerInterface]
  }
}

