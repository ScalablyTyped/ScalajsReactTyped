package typingsJapgolly.diLite.DiLite

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def invokeStmt(args: js.Any, op: String): String
}

object Utils {
  @scala.inline
  def apply(invokeStmt: (js.Any, String) => CallbackTo[String]): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invokeStmt")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => invokeStmt(t0, t1).runNow()))
    __obj.asInstanceOf[Utils]
  }
}

