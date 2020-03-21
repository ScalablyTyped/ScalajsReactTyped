package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoflogSystemd extends js.Object {
  def sd_journal_print(slev: String, stxt: String): Double
  def sd_journal_send_xvap(xname: String): Double
}

object TypeoflogSystemd {
  @scala.inline
  def apply(
    sd_journal_print: (String, String) => CallbackTo[Double],
    sd_journal_send_xvap: String => CallbackTo[Double]
  ): TypeoflogSystemd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sd_journal_print")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sd_journal_print(t0, t1).runNow()))
    __obj.updateDynamic("sd_journal_send_xvap")(js.Any.fromFunction1((t0: java.lang.String) => sd_journal_send_xvap(t0).runNow()))
    __obj.asInstanceOf[TypeoflogSystemd]
  }
}

