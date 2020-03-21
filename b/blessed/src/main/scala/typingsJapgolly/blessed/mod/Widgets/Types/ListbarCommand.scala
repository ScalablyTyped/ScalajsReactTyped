package typingsJapgolly.blessed.mod.Widgets.Types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListbarCommand extends js.Object {
  var key: String
  def callback(): Unit
}

object ListbarCommand {
  @scala.inline
  def apply(callback: Callback, key: String): ListbarCommand = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[ListbarCommand]
  }
}

