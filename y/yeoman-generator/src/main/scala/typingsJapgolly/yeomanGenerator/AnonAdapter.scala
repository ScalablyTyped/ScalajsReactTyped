package typingsJapgolly.yeomanGenerator

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdapter extends js.Object {
  var adapter: AnonPromptModule
  def error(e: js.Error*): Unit
}

object AnonAdapter {
  @scala.inline
  def apply(adapter: AnonPromptModule, error: /* repeated */ js.Error => Callback): AnonAdapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Error) => error(t0).runNow()))
    __obj.asInstanceOf[AnonAdapter]
  }
}

