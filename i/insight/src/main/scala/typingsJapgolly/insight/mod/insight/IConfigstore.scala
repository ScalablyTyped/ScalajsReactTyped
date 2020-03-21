package typingsJapgolly.insight.mod.insight

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigstore extends js.Object {
  var all: js.Any
  var path: String
  def del(key: String): Unit
  def get(key: String): js.Any
  def set(key: String, `val`: js.Any): Unit
}

object IConfigstore {
  @scala.inline
  def apply(
    all: js.Any,
    del: String => Callback,
    get: String => CallbackTo[js.Any],
    path: String,
    set: (String, js.Any) => Callback
  ): IConfigstore = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("del")(js.Any.fromFunction1((t0: java.lang.String) => del(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[IConfigstore]
  }
}

