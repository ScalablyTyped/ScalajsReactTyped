package typingsJapgolly.kineticjs.Kinetic

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvas extends js.Object {
  var _canvas: HTMLCanvasElement
  var height: Double
  var width: Double
  def getPixelRatio(): Double
  def setPixelRatio(pixelRatio: Double): js.Any
}

object ICanvas {
  @scala.inline
  def apply(
    _canvas: HTMLCanvasElement,
    getPixelRatio: CallbackTo[Double],
    height: Double,
    setPixelRatio: Double => CallbackTo[js.Any],
    width: Double
  ): ICanvas = {
    val __obj = js.Dynamic.literal(_canvas = _canvas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("getPixelRatio")(getPixelRatio.toJsFn)
    __obj.updateDynamic("setPixelRatio")(js.Any.fromFunction1((t0: scala.Double) => setPixelRatio(t0).runNow()))
    __obj.asInstanceOf[ICanvas]
  }
}

