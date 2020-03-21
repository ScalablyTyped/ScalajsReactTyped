package typingsJapgolly.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContrastError extends Error {
  @JSName("name")
  var name_ContrastError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.ContrastError
}

object ContrastError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.ContrastError
  ): ContrastError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContrastError]
  }
}

