package typingsJapgolly.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeError extends Error {
  @JSName("name")
  var name_TypeError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.TypeError
}

object TypeError {
  @scala.inline
  def apply(message: String, method: String, name: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.TypeError): TypeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeError]
  }
}

