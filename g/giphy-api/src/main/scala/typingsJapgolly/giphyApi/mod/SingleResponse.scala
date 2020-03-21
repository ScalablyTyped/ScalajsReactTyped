package typingsJapgolly.giphyApi.mod

import typingsJapgolly.giphyApi.AnonCount
import typingsJapgolly.giphyApi.AnonMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse extends BaseResponse {
  var data: GIFObject
}

object SingleResponse {
  @scala.inline
  def apply(data: GIFObject, meta: AnonMsg, pagination: AnonCount): SingleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleResponse]
  }
}

