package typingsJapgolly.store

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreJsStorage extends js.Object {
  var name: String
  def clearAll(): Unit
  def each(callback: js.Function2[/* val */ String, /* key */ String, _]): Unit
  def read(key: String): String | Null
  def remove(key: String): Unit
  def write(key: String, data: String): Unit
}

object StoreJsStorage {
  @scala.inline
  def apply(
    clearAll: Callback,
    each: js.Function2[/* val */ String, /* key */ String, js.Any] => Callback,
    name: String,
    read: String => CallbackTo[String | Null],
    remove: String => Callback,
    write: (String, String) => Callback
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("clearAll")(clearAll.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function2[/* val */ java.lang.String, /* key */ java.lang.String, js.Any]) => each(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: java.lang.String) => read(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => write(t0, t1).runNow()))
    __obj.asInstanceOf[StoreJsStorage]
  }
}

