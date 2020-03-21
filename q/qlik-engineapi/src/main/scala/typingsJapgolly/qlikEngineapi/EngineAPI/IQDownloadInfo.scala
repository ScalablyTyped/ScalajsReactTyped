package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQDownloadInfo extends js.Object {
  /**
    * FileSize of the generated QVF
    */
  var qFileSize: Double
  /**
    * URL of the generated QVF
    */
  var qUrl: String
}

object IQDownloadInfo {
  @scala.inline
  def apply(qFileSize: Double, qUrl: String): IQDownloadInfo = {
    val __obj = js.Dynamic.literal(qFileSize = qFileSize.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IQDownloadInfo]
  }
}

