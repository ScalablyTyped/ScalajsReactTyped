package typingsJapgolly.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTextMetrics extends js.Object {
  /**
    * 文本的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CanvasTextMetrics {
  @scala.inline
  def apply(width: Int | Double = null): CanvasTextMetrics = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextMetrics]
  }
}

