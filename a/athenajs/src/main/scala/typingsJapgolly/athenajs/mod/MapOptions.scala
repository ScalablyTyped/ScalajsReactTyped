package typingsJapgolly.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var buffer: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var height: Double
  var src: String
  var tileHeight: Double
  var tileWidth: Double
  var viewportH: js.UndefOr[Double] = js.undefined
  var viewportW: js.UndefOr[Double] = js.undefined
  var width: Double
}

object MapOptions {
  @scala.inline
  def apply(
    height: Double,
    src: String,
    tileHeight: Double,
    tileWidth: Double,
    width: Double,
    buffer: scala.scalajs.js.typedarray.ArrayBuffer = null,
    viewportH: Int | Double = null,
    viewportW: Int | Double = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (viewportH != null) __obj.updateDynamic("viewportH")(viewportH.asInstanceOf[js.Any])
    if (viewportW != null) __obj.updateDynamic("viewportW")(viewportW.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

