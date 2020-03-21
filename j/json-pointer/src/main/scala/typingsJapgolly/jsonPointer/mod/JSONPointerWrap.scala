package typingsJapgolly.jsonPointer.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPointerWrap extends js.Object {
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  def dict(): js.Object
  /**
    *  Looks up a JSON pointer in an object.
    */
  def get(pointer: String): js.Any
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  def has(pointer: String): Boolean
  /**
    *  Removes an attribute of object referenced by pointer
    */
  def remove(pointer: String): Unit
  /**
    *  Set a value for a JSON pointer on object.
    */
  def set(pointer: String, value: js.Any): Unit
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  def walk(iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit
}

object JSONPointerWrap {
  @scala.inline
  def apply(
    dict: CallbackTo[js.Object],
    get: String => CallbackTo[js.Any],
    has: String => CallbackTo[Boolean],
    remove: String => Callback,
    set: (String, js.Any) => Callback,
    walk: js.Function2[/* value */ js.Any, /* key */ String, Unit] => Callback
  ): JSONPointerWrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dict")(dict.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("walk")(js.Any.fromFunction1((t0: js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Unit]) => walk(t0).runNow()))
    __obj.asInstanceOf[JSONPointerWrap]
  }
}

