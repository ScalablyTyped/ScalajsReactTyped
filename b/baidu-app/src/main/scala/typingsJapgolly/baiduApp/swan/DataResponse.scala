package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
  var header: js.Any
  var result: String
  var statusCode: Double
}

object DataResponse {
  @scala.inline
  def apply(
    data: String | scala.scalajs.js.typedarray.ArrayBuffer,
    header: js.Any,
    result: String,
    statusCode: Double
  ): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataResponse]
  }
}

