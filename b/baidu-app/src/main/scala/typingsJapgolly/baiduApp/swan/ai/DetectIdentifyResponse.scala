package typingsJapgolly.baiduApp.swan.ai

import typingsJapgolly.baiduApp.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectIdentifyResponse extends js.Object {
  var log_id: Double
   // 	唯一的log id，用于问题定位。
  var result: AnonHeight
}

object DetectIdentifyResponse {
  @scala.inline
  def apply(log_id: Double, result: AnonHeight): DetectIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectIdentifyResponse]
  }
}

