package typingsJapgolly.telebot.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait module extends js.Object {
  var defaultConfig: js.Any
  var id: String
  def plugin(args: js.Any*): Unit
}

object module {
  @scala.inline
  def apply(defaultConfig: js.Any, id: String, plugin: /* repeated */ js.Any => Callback): module = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("plugin")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => plugin(t0).runNow()))
    __obj.asInstanceOf[module]
  }
}

