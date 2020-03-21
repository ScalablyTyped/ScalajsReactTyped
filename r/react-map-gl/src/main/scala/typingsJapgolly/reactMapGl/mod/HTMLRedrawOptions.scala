package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLRedrawOptions extends js.Object {
  var height: Double
  var width: Double
  def project(lnglat: js.Array[Double]): js.Array[Double]
  def unproject(xy: js.Array[Double]): js.Array[Double]
}

object HTMLRedrawOptions {
  @scala.inline
  def apply(
    height: Double,
    project: js.Array[Double] => CallbackTo[js.Array[Double]],
    unproject: js.Array[Double] => CallbackTo[js.Array[Double]],
    width: Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("project")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => project(t0).runNow()))
    __obj.updateDynamic("unproject")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => unproject(t0).runNow()))
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
}

