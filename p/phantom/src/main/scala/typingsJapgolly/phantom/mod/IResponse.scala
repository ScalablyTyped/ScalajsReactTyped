package typingsJapgolly.phantom.mod

import typingsJapgolly.phantom.AnonName
import typingsJapgolly.phantom.phantomStrings.end
import typingsJapgolly.phantom.phantomStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var bodySize: Double
  var contentType: String
  var headers: js.Array[AnonName]
  var id: String
  var redirectURL: String
  var stage: start | end
  var status: Double
  var statusText: String
  var time: js.Date
  var url: String
}

object IResponse {
  @scala.inline
  def apply(
    bodySize: Double,
    contentType: String,
    headers: js.Array[AnonName],
    id: String,
    redirectURL: String,
    stage: start | end,
    status: Double,
    statusText: String,
    time: js.Date,
    url: String
  ): IResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResponse]
  }
}

