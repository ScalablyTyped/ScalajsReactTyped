package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileResponse extends js.Object {
  var data: String
   // 开发者服务器返回的数据
  var statusCode: Double
}

object UploadFileResponse {
  @scala.inline
  def apply(data: String, statusCode: Double): UploadFileResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadFileResponse]
  }
}

