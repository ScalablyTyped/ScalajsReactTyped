package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFilesData extends js.Object {
  /** 文件的临时路径 */
  var tempFilePaths: String
}

object TempFilesData {
  @scala.inline
  def apply(tempFilePaths: String): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TempFilesData]
  }
}

