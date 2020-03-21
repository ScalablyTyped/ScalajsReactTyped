package typingsJapgolly.baiduApp.swan.ai

import typingsJapgolly.baiduApp.AnonScore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait animalClassifyResponse extends js.Object {
  var log_id: Double
   // 识别结果数，标识返回结果数目。
  var result: js.Array[AnonScore]
   // 	唯一的log id，用于问题定位。
  var result_num: Double
}

object animalClassifyResponse {
  @scala.inline
  def apply(log_id: Double, result: js.Array[AnonScore], result_num: Double): animalClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[animalClassifyResponse]
  }
}

