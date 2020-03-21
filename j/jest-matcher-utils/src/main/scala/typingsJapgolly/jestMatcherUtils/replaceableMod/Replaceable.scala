package typingsJapgolly.jestMatcherUtils.replaceableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replaceable extends js.Object {
  var `object`: js.Any
  var `type`: String
  def forEach(cb: ReplaceableForEachCallBack): Unit
  def get(key: js.Any): js.Any
  def set(key: js.Any, value: js.Any): Unit
}

object Replaceable {
  @scala.inline
  def apply(
    forEach: ReplaceableForEachCallBack => Callback,
    get: js.Any => CallbackTo[js.Any],
    `object`: js.Any,
    set: (js.Any, js.Any) => Callback,
    `type`: String
  ): Replaceable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: typingsJapgolly.jestMatcherUtils.replaceableMod.ReplaceableForEachCallBack) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replaceable]
  }
}

