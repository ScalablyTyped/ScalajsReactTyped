package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoData extends js.Object {
  /** 选定视频的时间长度 */
  var duration: Double
  /** 返回选定视频的长 */
  var height: Double
  /** 选定视频的数据量大小 */
  var size: Double
  /** 选定视频的临时文件路径 */
  var tempFilePath: String
  /** 返回选定视频的宽 */
  var width: Double
}

object VideoData {
  @scala.inline
  def apply(duration: Double, height: Double, size: Double, tempFilePath: String, width: Double): VideoData = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VideoData]
  }
}

