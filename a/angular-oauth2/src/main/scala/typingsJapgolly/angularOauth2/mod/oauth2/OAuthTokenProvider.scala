package typingsJapgolly.angularOauth2.mod.oauth2

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenProvider extends js.Object {
  def configure(params: OAuthTokenConfig): OAuthTokenConfig
}

object OAuthTokenProvider {
  @scala.inline
  def apply(configure: OAuthTokenConfig => CallbackTo[OAuthTokenConfig]): OAuthTokenProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.angularOauth2.mod.oauth2.OAuthTokenConfig) => configure(t0).runNow()))
    __obj.asInstanceOf[OAuthTokenProvider]
  }
}

