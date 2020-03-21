package typingsJapgolly.angularOauth2.mod.oauth2

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthProvider extends js.Object {
  def configure(params: OAuthConfig): OAuthConfig
}

object OAuthProvider {
  @scala.inline
  def apply(configure: OAuthConfig => CallbackTo[OAuthConfig]): OAuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.angularOauth2.mod.oauth2.OAuthConfig) => configure(t0).runNow()))
    __obj.asInstanceOf[OAuthProvider]
  }
}

