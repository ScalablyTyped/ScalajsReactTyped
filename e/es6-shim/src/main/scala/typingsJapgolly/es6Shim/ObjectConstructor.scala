package typingsJapgolly.es6Shim

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param sources One or more source objects to copy properties from.
    */
  def assign(target: js.Any, sources: js.Any*): js.Any
  /**
    * Returns true if the values are the same value, false otherwise.
    * @param value1 The first value.
    * @param value2 The second value.
    */
  def is(value1: js.Any, value2: js.Any): Boolean
  /**
    * Sets the prototype of a specified object o to  object proto or null. Returns the object o.
    * @param o The object to change its prototype.
    * @param proto The value of the new prototype or null.
    * @remarks Requires `__proto__` support.
    */
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any
}

object ObjectConstructor {
  @scala.inline
  def apply(
    assign: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    is: (js.Any, js.Any) => CallbackTo[Boolean],
    setPrototypeOf: (js.Any, js.Any) => CallbackTo[js.Any]
  ): ObjectConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assign")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => assign(t0, t1).runNow()))
    __obj.updateDynamic("is")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => is(t0, t1).runNow()))
    __obj.updateDynamic("setPrototypeOf")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => setPrototypeOf(t0, t1).runNow()))
    __obj.asInstanceOf[ObjectConstructor]
  }
}

