package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRedrawOptions extends HTMLRedrawOptions {
  var ctx: CanvasRenderingContext2D
}

object CanvasRedrawOptions {
  @scala.inline
  def apply(
    ctx: CanvasRenderingContext2D,
    height: Double,
    project: js.Array[Double] => CallbackTo[js.Array[Double]],
    unproject: js.Array[Double] => CallbackTo[js.Array[Double]],
    width: Double
  ): CanvasRedrawOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("project")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => project(t0).runNow()))
    __obj.updateDynamic("unproject")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => unproject(t0).runNow()))
    __obj.asInstanceOf[CanvasRedrawOptions]
  }
}

