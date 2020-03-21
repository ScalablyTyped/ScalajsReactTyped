package typingsJapgolly.qiniuJs

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDist extends js.Object {
  var dist: Blob
  	// 压缩后的图片宽度
  var height: Double
  	// 压缩后输出的 blob 对象，或原始的 file，具体看下面的 options 配置
  var width: Double
}

object AnonDist {
  @scala.inline
  def apply(dist: Blob, height: Double, width: Double): AnonDist = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDist]
  }
}

