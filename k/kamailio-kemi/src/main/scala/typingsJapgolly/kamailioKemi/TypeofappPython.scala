package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofappPython extends js.Object {
  def exec(method: String): Double
  def exec_p1(method: String, p1: String): Double
}

object TypeofappPython {
  @scala.inline
  def apply(exec: String => CallbackTo[Double], exec_p1: (String, String) => CallbackTo[Double]): TypeofappPython = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: java.lang.String) => exec(t0).runNow()))
    __obj.updateDynamic("exec_p1")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => exec_p1(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofappPython]
  }
}

