package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthRadius extends js.Object {
  def proxy_authorize(srealm: String): Double
  def proxy_authorize_user(srealm: String, suser: String): Double
  def www_authorize(srealm: String): Double
  def www_authorize_user(srealm: String, suser: String): Double
}

object TypeofauthRadius {
  @scala.inline
  def apply(
    proxy_authorize: String => CallbackTo[Double],
    proxy_authorize_user: (String, String) => CallbackTo[Double],
    www_authorize: String => CallbackTo[Double],
    www_authorize_user: (String, String) => CallbackTo[Double]
  ): TypeofauthRadius = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("proxy_authorize")(js.Any.fromFunction1((t0: java.lang.String) => proxy_authorize(t0).runNow()))
    __obj.updateDynamic("proxy_authorize_user")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => proxy_authorize_user(t0, t1).runNow()))
    __obj.updateDynamic("www_authorize")(js.Any.fromFunction1((t0: java.lang.String) => www_authorize(t0).runNow()))
    __obj.updateDynamic("www_authorize_user")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => www_authorize_user(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofauthRadius]
  }
}

