package typingsJapgolly.asana.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.asana.mod.auth.Authenticator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to configure the client */
trait ClientOptions extends DispatcherOptions {
  var asanaBaseUrl: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String | Double] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var defaultHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    asanaBaseUrl: String = null,
    authenticator: Authenticator = null,
    clientId: String | Double = null,
    clientSecret: String = null,
    defaultHeaders: StringDictionary[String] = null,
    handleUnauthorized: js.UndefOr[CallbackTo[Boolean | typingsJapgolly.bluebird.mod.^[Boolean]]] = js.undefined,
    redirectUri: String = null,
    requestTimeout: String = null,
    retryOnRateLimit: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl.asInstanceOf[js.Any])
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (defaultHeaders != null) __obj.updateDynamic("defaultHeaders")(defaultHeaders.asInstanceOf[js.Any])
    handleUnauthorized.foreach(p => __obj.updateDynamic("handleUnauthorized")(p.toJsFn))
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnRateLimit)) __obj.updateDynamic("retryOnRateLimit")(retryOnRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

