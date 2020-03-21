package typingsJapgolly.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMarker extends js.Object {
  /**
    * 该图例项 marker 的填充颜色
    */
  var fill: String
  var marker: js.UndefOr[String | js.Function] = js.undefined
  /**
    * 图例项的文本内容
    */
  var value: String
}

object AnonMarker {
  @scala.inline
  def apply(fill: String, value: String, marker: String | js.Function = null): AnonMarker = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarker]
  }
}

