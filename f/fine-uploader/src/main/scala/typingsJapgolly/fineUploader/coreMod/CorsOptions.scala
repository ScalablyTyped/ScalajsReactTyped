package typingsJapgolly.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorsOptions extends js.Object {
  /**
    * Enable or disable cross-origin requests from IE9 and older where XDomainRequest must be used
    *
    * @default `false`
    */
  var allowXdr: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable cross-domain requests
    *
    * @default `false`
    */
  var expected: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable sending credentials along with each cross-domain request. Ignored if allowXdr is true and IE9 is being used
    *
    * @default `false`
    */
  var sendCredentials: js.UndefOr[Boolean] = js.undefined
}

object CorsOptions {
  @scala.inline
  def apply(
    allowXdr: js.UndefOr[Boolean] = js.undefined,
    expected: js.UndefOr[Boolean] = js.undefined,
    sendCredentials: js.UndefOr[Boolean] = js.undefined
  ): CorsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowXdr)) __obj.updateDynamic("allowXdr")(allowXdr.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCredentials)) __obj.updateDynamic("sendCredentials")(sendCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsOptions]
  }
}

