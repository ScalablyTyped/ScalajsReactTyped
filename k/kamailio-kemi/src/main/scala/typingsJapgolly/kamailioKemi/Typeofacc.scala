package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofacc extends js.Object {
  // Equivalent of native kamailio.cfg function: acc_db_request("comment", "dbtable").
  def acc_db_request(comment: String, dbtable: String): Double
  // Equivalent of native kamailio.cfg function: acc_log_request("comment").
  def acc_log_request(comment: String): Double
  // Equivalent of native kamailio.cfg function: acc_request("comment", "dbtable").
  def acc_request(comment: String, dbtable: String): Double
}

object Typeofacc {
  @scala.inline
  def apply(
    acc_db_request: (String, String) => CallbackTo[Double],
    acc_log_request: String => CallbackTo[Double],
    acc_request: (String, String) => CallbackTo[Double]
  ): Typeofacc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acc_db_request")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => acc_db_request(t0, t1).runNow()))
    __obj.updateDynamic("acc_log_request")(js.Any.fromFunction1((t0: java.lang.String) => acc_log_request(t0).runNow()))
    __obj.updateDynamic("acc_request")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => acc_request(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofacc]
  }
}

