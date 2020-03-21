package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofexec extends js.Object {
  def exec_avp(cmd: String): Double
  def exec_dset(cmd: String): Double
  def exec_msg(cmd: String): Double
}

object Typeofexec {
  @scala.inline
  def apply(
    exec_avp: String => CallbackTo[Double],
    exec_dset: String => CallbackTo[Double],
    exec_msg: String => CallbackTo[Double]
  ): Typeofexec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec_avp")(js.Any.fromFunction1((t0: java.lang.String) => exec_avp(t0).runNow()))
    __obj.updateDynamic("exec_dset")(js.Any.fromFunction1((t0: java.lang.String) => exec_dset(t0).runNow()))
    __obj.updateDynamic("exec_msg")(js.Any.fromFunction1((t0: java.lang.String) => exec_msg(t0).runNow()))
    __obj.asInstanceOf[Typeofexec]
  }
}

