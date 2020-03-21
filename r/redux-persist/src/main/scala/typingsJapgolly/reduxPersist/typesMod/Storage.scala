package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def getItem(key: String, args: js.Any*): js.Any
  def removeItem(key: String, args: js.Any*): js.Any
  def setItem(key: String, value: js.Any, args: js.Any*): js.Any
}

object Storage {
  @scala.inline
  def apply(
    getItem: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    removeItem: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    setItem: (String, js.Any, /* repeated */ js.Any) => CallbackTo[js.Any]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => getItem(t0, t1).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => removeItem(t0, t1).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: /* repeated */ js.Any) => setItem(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

