package typingsJapgolly.rnFetchBlob.mod

import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings._empty
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.ascii
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.base64
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.blob
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.json
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.path
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.text
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: text | blob | _empty | json
  var rnfbEncode: path | base64 | ascii | utf8
  var state: Double
  var status: Double
  var taskId: String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: text | blob | _empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}

