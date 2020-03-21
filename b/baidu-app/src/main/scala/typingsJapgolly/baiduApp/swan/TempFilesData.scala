package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFilesData extends js.Object {
  /** 文件的临时路径 */
  var tempFilePaths: String
  /**
  		 * 图片的本地文件列表，每一项是一个 File 对象
  		 * @version 1.2.0
  		 */
  var tempFiles: js.Array[TempFile]
}

object TempFilesData {
  @scala.inline
  def apply(tempFilePaths: String, tempFiles: js.Array[TempFile]): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TempFilesData]
  }
}

