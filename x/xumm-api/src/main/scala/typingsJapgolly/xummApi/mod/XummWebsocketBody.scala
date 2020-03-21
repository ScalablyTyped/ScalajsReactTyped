package typingsJapgolly.xummApi.mod

import typingsJapgolly.xummApi.AnonWeb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummWebsocketBody extends js.Object {
  var custom_meta: XummCustomMeta
  var payload_uuidv4: String
  var reference_call_uuidv4: String
  var return_url: AnonWeb
  var signed: Boolean
  var user_token: Boolean
}

object XummWebsocketBody {
  @scala.inline
  def apply(
    custom_meta: XummCustomMeta,
    payload_uuidv4: String,
    reference_call_uuidv4: String,
    return_url: AnonWeb,
    signed: Boolean,
    user_token: Boolean
  ): XummWebsocketBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], reference_call_uuidv4 = reference_call_uuidv4.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XummWebsocketBody]
  }
}

