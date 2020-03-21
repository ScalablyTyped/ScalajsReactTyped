package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.AnonIdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  def getUser(): AnonIdNumber
  def getUserToken(): String
  def isLoggedIn(): Boolean
  def login(email: String, password: String): js.Promise[Unit]
  def logout(): js.Promise[Unit]
  def ssoLogin(email: String): js.Promise[Unit]
  def tokenLogin(token: String): js.Promise[Unit]
}

object ISession {
  @scala.inline
  def apply(
    getUser: CallbackTo[AnonIdNumber],
    getUserToken: CallbackTo[String],
    isLoggedIn: CallbackTo[Boolean],
    login: (String, String) => CallbackTo[js.Promise[Unit]],
    logout: CallbackTo[js.Promise[Unit]],
    ssoLogin: String => CallbackTo[js.Promise[Unit]],
    tokenLogin: String => CallbackTo[js.Promise[Unit]]
  ): ISession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUser")(getUser.toJsFn)
    __obj.updateDynamic("getUserToken")(getUserToken.toJsFn)
    __obj.updateDynamic("isLoggedIn")(isLoggedIn.toJsFn)
    __obj.updateDynamic("login")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => login(t0, t1).runNow()))
    __obj.updateDynamic("logout")(logout.toJsFn)
    __obj.updateDynamic("ssoLogin")(js.Any.fromFunction1((t0: java.lang.String) => ssoLogin(t0).runNow()))
    __obj.updateDynamic("tokenLogin")(js.Any.fromFunction1((t0: java.lang.String) => tokenLogin(t0).runNow()))
    __obj.asInstanceOf[ISession]
  }
}

