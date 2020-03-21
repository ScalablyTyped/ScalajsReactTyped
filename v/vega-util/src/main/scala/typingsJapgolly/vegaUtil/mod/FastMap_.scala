package typingsJapgolly.vegaUtil.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastMap_ extends js.Object {
  var empty: Double
  var size: Double
  def clean(): Unit
  def delete(f: String): Unit
  def get(f: String): js.Any
  def has(f: String): Boolean
  def set(f: String, v: js.Any): Unit
}

object FastMap_ {
  @scala.inline
  def apply(
    clean: Callback,
    delete: String => Callback,
    empty: Double,
    get: String => CallbackTo[js.Any],
    has: String => CallbackTo[Boolean],
    set: (String, js.Any) => Callback,
    size: Double
  ): FastMap_ = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clean")(clean.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[FastMap_]
  }
}

