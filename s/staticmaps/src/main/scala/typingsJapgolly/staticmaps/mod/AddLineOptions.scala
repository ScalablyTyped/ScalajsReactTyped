package typingsJapgolly.staticmaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddLineOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var coords: js.Array[js.Tuple2[Double, Double]]
  var width: js.UndefOr[Double] = js.undefined
}

object AddLineOptions {
  @scala.inline
  def apply(coords: js.Array[js.Tuple2[Double, Double]], color: String = null, width: Int | Double = null): AddLineOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLineOptions]
  }
}

