package typingsJapgolly.jsonpointer.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPointer extends js.Object {
  /**
    * Looks up a JSON pointer in an object
    */
  def get(`object`: js.Object): js.Any
  /**
    * Set a value for a JSON pointer on object
    */
  def set(`object`: js.Object, value: js.Any): Unit
}

object JSONPointer {
  @scala.inline
  def apply(get: js.Object => CallbackTo[js.Any], set: (js.Object, js.Any) => Callback): JSONPointer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Object) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Object, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[JSONPointer]
  }
}

