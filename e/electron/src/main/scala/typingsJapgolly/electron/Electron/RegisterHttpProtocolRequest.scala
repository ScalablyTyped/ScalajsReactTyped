package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterHttpProtocolRequest extends js.Object {
  var headers: Headers
  var method: String
  var referrer: String
  var uploadData: js.Array[UploadData]
  var url: String
}

object RegisterHttpProtocolRequest {
  @scala.inline
  def apply(headers: Headers, method: String, referrer: String, uploadData: js.Array[UploadData], url: String): RegisterHttpProtocolRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], uploadData = uploadData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterHttpProtocolRequest]
  }
}

