package typingsJapgolly.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivacyError extends Error {
  @JSName("name")
  var name_PrivacyError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.PrivacyError
}

object PrivacyError {
  @scala.inline
  def apply(message: String, method: String, name: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.PrivacyError): PrivacyError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrivacyError]
  }
}

