package typingsJapgolly.cassandraDriver.authMod.auth

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def newAuthenticator(endpoint: String, name: String): Authenticator
}

object AuthProvider {
  @scala.inline
  def apply(newAuthenticator: (String, String) => CallbackTo[Authenticator]): AuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAuthenticator")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => newAuthenticator(t0, t1).runNow()))
    __obj.asInstanceOf[AuthProvider]
  }
}

