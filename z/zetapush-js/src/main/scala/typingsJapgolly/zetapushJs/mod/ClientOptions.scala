package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends Options {
  def authentication(): AbstractHandshake
}

object ClientOptions {
  @scala.inline
  def apply(
    authentication: CallbackTo[AbstractHandshake],
    sandboxId: String,
    apiUrl: String = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    transports: js.Array[_] = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.updateDynamic("authentication")(authentication.toJsFn)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

