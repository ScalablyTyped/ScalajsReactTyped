package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofauth extends js.Object {
  def auth_challenge(realm: String, flags: Double): Double
  def consume_credentials(): Double
  def has_credentials(srealm: String): Double
  def pv_auth_check(srealm: String, spasswd: String, vflags: Double, vchecks: Double): Double
}

object Typeofauth {
  @scala.inline
  def apply(
    auth_challenge: (String, Double) => CallbackTo[Double],
    consume_credentials: CallbackTo[Double],
    has_credentials: String => CallbackTo[Double],
    pv_auth_check: (String, String, Double, Double) => CallbackTo[Double]
  ): Typeofauth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth_challenge")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => auth_challenge(t0, t1).runNow()))
    __obj.updateDynamic("consume_credentials")(consume_credentials.toJsFn)
    __obj.updateDynamic("has_credentials")(js.Any.fromFunction1((t0: java.lang.String) => has_credentials(t0).runNow()))
    __obj.updateDynamic("pv_auth_check")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double) => pv_auth_check(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Typeofauth]
  }
}

