package typingsJapgolly.trezorConnect.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.trezorConnect.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.CommonParamscallbackLogin
  - typingsJapgolly.trezorConnect.mod.LoginChallenge
*/
trait RequestLoginParams extends js.Object

object RequestLoginParams {
  @scala.inline
  def CommonParamscallbackLogin(
    callback: CallbackTo[LoginChallenge],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: AnonInstance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): RequestLoginParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback.toJsFn)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLoginParams]
  }
  @scala.inline
  def LoginChallenge(challengeHidden: String, challengeVisual: String): RequestLoginParams = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestLoginParams]
  }
}

