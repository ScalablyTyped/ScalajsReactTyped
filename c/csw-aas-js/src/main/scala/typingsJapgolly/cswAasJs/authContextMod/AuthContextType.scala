package typingsJapgolly.cswAasJs.authContextMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cswAasJs.authMod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextType extends js.Object {
  var auth: Auth | Null
  def login(): Unit
  def logout(): Unit
}

object AuthContextType {
  @scala.inline
  def apply(login: Callback, logout: Callback, auth: Auth = null): AuthContextType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("login")(login.toJsFn)
    __obj.updateDynamic("logout")(logout.toJsFn)
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContextType]
  }
}

