package typingsJapgolly.baiduApp.swan.ai

import typingsJapgolly.baiduApp.AnonPass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textReviewResponse extends js.Object {
  var log_id: String
   // 唯一的log id，用于问题定位。
  var result: AnonPass
}

object textReviewResponse {
  @scala.inline
  def apply(log_id: String, result: AnonPass): textReviewResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[textReviewResponse]
  }
}

