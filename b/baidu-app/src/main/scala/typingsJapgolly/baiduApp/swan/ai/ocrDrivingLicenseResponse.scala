package typingsJapgolly.baiduApp.swan.ai

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baiduApp.AnonWords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrDrivingLicenseResponse extends js.Object {
  var log_id: String
   // 识别结果数，表示 words_result 的元素个数。
  var words_result: StringDictionary[AnonWords]
   // 唯一的log id，用于问题定位。
  var words_result_num: Double
}

object ocrDrivingLicenseResponse {
  @scala.inline
  def apply(log_id: String, words_result: StringDictionary[AnonWords], words_result_num: Double): ocrDrivingLicenseResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], words_result = words_result.asInstanceOf[js.Any], words_result_num = words_result_num.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ocrDrivingLicenseResponse]
  }
}

