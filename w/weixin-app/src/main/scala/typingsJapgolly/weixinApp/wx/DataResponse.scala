package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: js.Object | String | scala.scalajs.js.typedarray.ArrayBuffer
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
}

object DataResponse {
  @scala.inline
  def apply(
    data: js.Object | String | scala.scalajs.js.typedarray.ArrayBuffer,
    header: js.Object,
    statusCode: Double
  ): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataResponse]
  }
}

