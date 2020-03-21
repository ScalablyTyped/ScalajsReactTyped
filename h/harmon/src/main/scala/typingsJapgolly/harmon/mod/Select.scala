package typingsJapgolly.harmon.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends js.Object {
  var query: String
  def func(node: js.Any): js.Any
}

object Select {
  @scala.inline
  def apply(func: js.Any => CallbackTo[js.Any], query: String): Select = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("func")(js.Any.fromFunction1((t0: js.Any) => func(t0).runNow()))
    __obj.asInstanceOf[Select]
  }
}

