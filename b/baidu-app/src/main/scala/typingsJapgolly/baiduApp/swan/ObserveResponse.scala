package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveResponse extends js.Object {
   // 相交区域占目标节点的布局区域的比例
  var boundingClientRect: RectArea
  var dataset: js.Any
  var id: String
  var intersectionRatio: Double
  var intersectionRect: RectArea
  var relativeRect: RectArea
  var time: Double
}

object ObserveResponse {
  @scala.inline
  def apply(
    boundingClientRect: RectArea,
    dataset: js.Any,
    id: String,
    intersectionRatio: Double,
    intersectionRect: RectArea,
    relativeRect: RectArea,
    time: Double
  ): ObserveResponse = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObserveResponse]
  }
}

