package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: String
  /** 调用结果 */
  var errMsg: String
  /** 文件大小，单位：B */
  var size: Double
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(digest: String, errMsg: String, size: Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

