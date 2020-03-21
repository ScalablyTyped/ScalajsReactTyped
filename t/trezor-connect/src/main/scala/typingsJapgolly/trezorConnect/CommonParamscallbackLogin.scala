package typingsJapgolly.trezorConnect

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.trezorConnect.mod.LoginChallenge
import typingsJapgolly.trezorConnect.mod.RequestLoginParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined trezor-connect.trezor-connect.CommonParams & {callback (): trezor-connect.trezor-connect.LoginChallenge} */
trait CommonParamscallbackLogin extends RequestLoginParams {
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined
  var device: js.UndefOr[AnonInstance] = js.undefined
  var keepSession: js.UndefOr[Boolean] = js.undefined
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  def callback(): LoginChallenge
}

object CommonParamscallbackLogin {
  @scala.inline
  def apply(
    callback: CallbackTo[LoginChallenge],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: AnonInstance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): CommonParamscallbackLogin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback.toJsFn)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonParamscallbackLogin]
  }
}

