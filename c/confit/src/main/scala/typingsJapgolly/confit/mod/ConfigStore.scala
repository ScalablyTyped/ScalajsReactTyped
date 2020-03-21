package typingsJapgolly.confit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStore extends js.Object {
  def get(name: String): js.Any
  def set[T](name: String, newValue: T): T
  def use(newSettings: js.Object): Unit
}

object ConfigStore {
  @scala.inline
  def apply(
    get: String => CallbackTo[js.Any],
    set: (String, js.Any) => CallbackTo[js.Any],
    use: js.Object => Callback
  ): ConfigStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("use")(js.Any.fromFunction1((t0: js.Object) => use(t0).runNow()))
    __obj.asInstanceOf[ConfigStore]
  }
}

