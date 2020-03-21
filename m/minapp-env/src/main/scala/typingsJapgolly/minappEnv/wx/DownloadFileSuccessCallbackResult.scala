package typingsJapgolly.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
  /** 临时文件路径。如果没传入 filePath 指定文件存储路径，则下载后的文件会存储到一个临时文件 */
  var tempFilePath: String
}

object DownloadFileSuccessCallbackResult {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): DownloadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadFileSuccessCallbackResult]
  }
}

