package typingsJapgolly.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTrackLanguageError extends Error {
  @JSName("name")
  var name_InvalidTrackLanguageError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.InvalidTrackLanguageError
}

object InvalidTrackLanguageError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.InvalidTrackLanguageError
  ): InvalidTrackLanguageError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InvalidTrackLanguageError]
  }
}

