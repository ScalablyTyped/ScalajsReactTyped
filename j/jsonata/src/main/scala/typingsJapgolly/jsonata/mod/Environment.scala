package typingsJapgolly.jsonata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  val async: Boolean
  val timestamp: js.Date
  def bind(name: String, value: js.Any): Unit
  def lookup(name: String): js.Any
}

object Environment {
  @scala.inline
  def apply(
    async: Boolean,
    bind: (String, js.Any) => Callback,
    lookup: String => CallbackTo[js.Any],
    timestamp: js.Date
  ): Environment = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("bind")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => bind(t0, t1).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.asInstanceOf[Environment]
  }
}

