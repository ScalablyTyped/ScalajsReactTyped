package typingsJapgolly.trezorConnect.mod

import typingsJapgolly.trezorConnect.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignMessageParams extends CommonParams {
  var coin: js.UndefOr[String] = js.undefined
  var message: String
  var path: String | js.Array[Double]
}

object SignMessageParams {
  @scala.inline
  def apply(
    message: String,
    path: String | js.Array[Double],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    coin: String = null,
    device: AnonInstance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): SignMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (coin != null) __obj.updateDynamic("coin")(coin.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignMessageParams]
  }
}

