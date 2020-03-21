package typingsJapgolly.auth0Lock

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAvatarOptions extends js.Object {
  def displayName(email: String, callback: Auth0LockAvatarDisplayNameCallback): Unit
  def url(email: String, callback: Auth0LockAvatarUrlCallback): Unit
}

object Auth0LockAvatarOptions {
  @scala.inline
  def apply(
    displayName: (String, Auth0LockAvatarDisplayNameCallback) => Callback,
    url: (String, Auth0LockAvatarUrlCallback) => Callback
  ): Auth0LockAvatarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.auth0Lock.Auth0LockAvatarDisplayNameCallback) => displayName(t0, t1).runNow()))
    __obj.updateDynamic("url")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.auth0Lock.Auth0LockAvatarUrlCallback) => url(t0, t1).runNow()))
    __obj.asInstanceOf[Auth0LockAvatarOptions]
  }
}

