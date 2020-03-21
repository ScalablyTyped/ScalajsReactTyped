package typingsJapgolly.hexo.mod.extend

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Helper extends js.Object {
  def register(name: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit
}

object Helper {
  @scala.inline
  def apply(register: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback): Helper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => register(t0, t1).runNow()))
    __obj.asInstanceOf[Helper]
  }
}

