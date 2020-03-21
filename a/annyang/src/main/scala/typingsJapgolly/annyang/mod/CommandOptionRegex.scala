package typingsJapgolly.annyang.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptionRegex extends js.Object {
  var regexp: js.RegExp
  def callback(): Unit
}

object CommandOptionRegex {
  @scala.inline
  def apply(callback: Callback, regexp: js.RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[CommandOptionRegex]
  }
}

