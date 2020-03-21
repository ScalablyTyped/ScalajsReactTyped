package typingsJapgolly.minappEnv.ICloud

import typingsJapgolly.minappEnv.Array
import typingsJapgolly.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileURLResult extends IAPISuccessParam {
  var fileList: Array[GetTempFileURLResultItem]
}

object GetTempFileURLResult {
  @scala.inline
  def apply(errMsg: String, fileList: Array[GetTempFileURLResultItem]): GetTempFileURLResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTempFileURLResult]
  }
}

