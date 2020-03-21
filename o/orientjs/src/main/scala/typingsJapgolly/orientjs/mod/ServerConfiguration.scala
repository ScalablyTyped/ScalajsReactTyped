package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfiguration extends js.Object {
  def get(name: String): String
  def list(): js.Any
  def set(key: String, value: String): String
}

object ServerConfiguration {
  @scala.inline
  def apply(
    get: String => CallbackTo[String],
    list: CallbackTo[js.Any],
    set: (String, String) => CallbackTo[String]
  ): ServerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set(t0, t1).runNow()))
    __obj.asInstanceOf[ServerConfiguration]
  }
}

