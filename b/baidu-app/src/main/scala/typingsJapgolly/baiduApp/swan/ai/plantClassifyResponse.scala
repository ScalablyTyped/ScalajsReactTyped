package typingsJapgolly.baiduApp.swan.ai

import typingsJapgolly.baiduApp.AnonScore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plantClassifyResponse extends js.Object {
  var log_id: Double
   // 	唯一的log id，用于问题定位。
  var result: js.Array[AnonScore]
}

object plantClassifyResponse {
  @scala.inline
  def apply(log_id: Double, result: js.Array[AnonScore]): plantClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[plantClassifyResponse]
  }
}

