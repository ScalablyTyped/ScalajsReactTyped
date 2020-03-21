package typingsJapgolly.rotJs.tileGlMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsJapgolly.rotJs.backendMod.Backend
import typingsJapgolly.rotJs.typesMod.DisplayData
import typingsJapgolly.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileGL extends Backend {
  var _gl: WebGLRenderingContext
  var _program: WebGLProgram
  var _uniforms: StringDictionary[WebGLUniformLocation | Null]
  def _initWebGL(): WebGLRenderingContext
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
  def _updateSize(): Unit
  def _updateTexture(tileSet: HTMLImageElement): Unit
  def computeFontSize(): Double
}

object TileGL {
  @scala.inline
  def apply(
    _gl: WebGLRenderingContext,
    _initWebGL: CallbackTo[WebGLRenderingContext],
    _normalizedEventToPosition: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    _options: DisplayOptions,
    _program: WebGLProgram,
    _uniforms: StringDictionary[WebGLUniformLocation | Null],
    _updateSize: Callback,
    _updateTexture: HTMLImageElement => Callback,
    clear: Callback,
    computeFontSize: CallbackTo[Double],
    computeSize: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    draw: (DisplayData, Boolean) => Callback,
    eventToPosition: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    getContainer: CallbackTo[HTMLElement | Null],
    schedule: js.Function0[Unit] => Callback,
    setOptions: DisplayOptions => Callback
  ): TileGL = {
    val __obj = js.Dynamic.literal(_gl = _gl.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _program = _program.asInstanceOf[js.Any], _uniforms = _uniforms.asInstanceOf[js.Any])
    __obj.updateDynamic("_initWebGL")(_initWebGL.toJsFn)
    __obj.updateDynamic("_normalizedEventToPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => _normalizedEventToPosition(t0, t1).runNow()))
    __obj.updateDynamic("_updateSize")(_updateSize.toJsFn)
    __obj.updateDynamic("_updateTexture")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLImageElement) => _updateTexture(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("computeFontSize")(computeFontSize.toJsFn)
    __obj.updateDynamic("computeSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => computeSize(t0, t1).runNow()))
    __obj.updateDynamic("draw")(js.Any.fromFunction2((t0: typingsJapgolly.rotJs.typesMod.DisplayData, t1: scala.Boolean) => draw(t0, t1).runNow()))
    __obj.updateDynamic("eventToPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => eventToPosition(t0, t1).runNow()))
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.rotJs.typesMod.DisplayOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[TileGL]
  }
}

