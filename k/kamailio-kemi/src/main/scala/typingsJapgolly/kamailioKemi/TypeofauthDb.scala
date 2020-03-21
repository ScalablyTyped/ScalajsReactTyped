package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthDb extends js.Object {
  def auth_check(srealm: String, stable: String, iflags: Double): Double
  def is_subscriber(suri: String, stable: String, iflags: Double): Double
}

object TypeofauthDb {
  @scala.inline
  def apply(
    auth_check: (String, String, Double) => CallbackTo[Double],
    is_subscriber: (String, String, Double) => CallbackTo[Double]
  ): TypeofauthDb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth_check")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => auth_check(t0, t1, t2).runNow()))
    __obj.updateDynamic("is_subscriber")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => is_subscriber(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeofauthDb]
  }
}

