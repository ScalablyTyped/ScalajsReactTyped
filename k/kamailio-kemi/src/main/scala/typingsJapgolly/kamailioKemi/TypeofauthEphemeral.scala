package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthEphemeral extends js.Object {
  def autheph_authenticate(susername: String, spassword: String): Double
  def autheph_check(srealm: String): Double
  def autheph_proxy(srealm: String): Double
  def autheph_www(srealm: String): Double
  def autheph_www_method(srealm: String, smethod: String): Double
}

object TypeofauthEphemeral {
  @scala.inline
  def apply(
    autheph_authenticate: (String, String) => CallbackTo[Double],
    autheph_check: String => CallbackTo[Double],
    autheph_proxy: String => CallbackTo[Double],
    autheph_www: String => CallbackTo[Double],
    autheph_www_method: (String, String) => CallbackTo[Double]
  ): TypeofauthEphemeral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autheph_authenticate")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => autheph_authenticate(t0, t1).runNow()))
    __obj.updateDynamic("autheph_check")(js.Any.fromFunction1((t0: java.lang.String) => autheph_check(t0).runNow()))
    __obj.updateDynamic("autheph_proxy")(js.Any.fromFunction1((t0: java.lang.String) => autheph_proxy(t0).runNow()))
    __obj.updateDynamic("autheph_www")(js.Any.fromFunction1((t0: java.lang.String) => autheph_www(t0).runNow()))
    __obj.updateDynamic("autheph_www_method")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => autheph_www_method(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofauthEphemeral]
  }
}

