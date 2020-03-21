package typingsJapgolly.acl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoOp extends js.Object {
  def end(): Unit
  def params(types: String*): NoOp
}

object NoOp {
  @scala.inline
  def apply(end: japgolly.scalajs.react.Callback, params: /* repeated */ String => CallbackTo[NoOp]): NoOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("params")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => params(t0).runNow()))
    __obj.asInstanceOf[NoOp]
  }
}

