package typingsJapgolly.angularJwt.mod.jwt

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthManagerServiceProvider extends js.Object {
  def authenticate(): Unit
  def checkAuthOnRefresh(): Unit
  def redirectWhenUnauthenticated(): Unit
  def unauthenticate(): Unit
}

object IAuthManagerServiceProvider {
  @scala.inline
  def apply(
    authenticate: Callback,
    checkAuthOnRefresh: Callback,
    redirectWhenUnauthenticated: Callback,
    unauthenticate: Callback
  ): IAuthManagerServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(authenticate.toJsFn)
    __obj.updateDynamic("checkAuthOnRefresh")(checkAuthOnRefresh.toJsFn)
    __obj.updateDynamic("redirectWhenUnauthenticated")(redirectWhenUnauthenticated.toJsFn)
    __obj.updateDynamic("unauthenticate")(unauthenticate.toJsFn)
    __obj.asInstanceOf[IAuthManagerServiceProvider]
  }
}

