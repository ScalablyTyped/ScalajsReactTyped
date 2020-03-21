package typingsJapgolly.freedom.freedom.Storage

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  // Remove all data from storage.
  def clear(): js.Promise[Unit]
  // Fetch a value for a key.
  def get(key: String): js.Promise[String]
  // Fetch array of all keys.
  def keys(): js.Promise[js.Array[String]]
  // Remove a single key. Fulfills promise with previous value, if exists.
  def remove(key: String): js.Promise[String]
  // Sets a value to a key. Fulfills promise with the previous value, if it
  // exists.
  def set(key: String, value: String): js.Promise[String]
}

object Storage {
  @scala.inline
  def apply(
    clear: CallbackTo[js.Promise[Unit]],
    get: String => CallbackTo[js.Promise[String]],
    keys: CallbackTo[js.Promise[js.Array[String]]],
    remove: String => CallbackTo[js.Promise[String]],
    set: (String, String) => CallbackTo[js.Promise[String]]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

