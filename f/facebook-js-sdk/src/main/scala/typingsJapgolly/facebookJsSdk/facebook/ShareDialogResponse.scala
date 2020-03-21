package typingsJapgolly.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogResponse extends DialogResponse {
  var post_id: String
}

object ShareDialogResponse {
  @scala.inline
  def apply(post_id: String, error_code: Int | Double = null, error_message: String = null): ShareDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogResponse]
  }
}

