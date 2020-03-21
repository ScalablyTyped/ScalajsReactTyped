package typingsJapgolly.webgl2

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmap extends js.Object {
  val height: Double
  val width: Double
  def close(): Unit
}

object ImageBitmap {
  @scala.inline
  def apply(close: Callback, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[ImageBitmap]
  }
}

