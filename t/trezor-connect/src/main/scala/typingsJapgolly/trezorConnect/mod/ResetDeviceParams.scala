package typingsJapgolly.trezorConnect.mod

import typingsJapgolly.trezorConnect.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetDeviceParams extends CommonParams {
  var label: js.UndefOr[String] = js.undefined
  var noBackup: js.UndefOr[Boolean] = js.undefined
  var passphraseProtection: js.UndefOr[Boolean] = js.undefined
  var pinProtection: js.UndefOr[Boolean] = js.undefined
  var skipBackup: js.UndefOr[Boolean] = js.undefined
  var strength: js.UndefOr[Double] = js.undefined
  var u2fCounter: js.UndefOr[Double] = js.undefined
}

object ResetDeviceParams {
  @scala.inline
  def apply(
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: AnonInstance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    noBackup: js.UndefOr[Boolean] = js.undefined,
    passphraseProtection: js.UndefOr[Boolean] = js.undefined,
    pinProtection: js.UndefOr[Boolean] = js.undefined,
    skipBackup: js.UndefOr[Boolean] = js.undefined,
    strength: Int | Double = null,
    u2fCounter: Int | Double = null,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): ResetDeviceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(noBackup)) __obj.updateDynamic("noBackup")(noBackup.asInstanceOf[js.Any])
    if (!js.isUndefined(passphraseProtection)) __obj.updateDynamic("passphraseProtection")(passphraseProtection.asInstanceOf[js.Any])
    if (!js.isUndefined(pinProtection)) __obj.updateDynamic("pinProtection")(pinProtection.asInstanceOf[js.Any])
    if (!js.isUndefined(skipBackup)) __obj.updateDynamic("skipBackup")(skipBackup.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (u2fCounter != null) __obj.updateDynamic("u2fCounter")(u2fCounter.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDeviceParams]
  }
}

