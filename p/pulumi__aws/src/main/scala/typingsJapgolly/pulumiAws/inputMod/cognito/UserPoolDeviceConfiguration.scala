package typingsJapgolly.pulumiAws.inputMod.cognito

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDeviceConfiguration extends js.Object {
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var challengeRequiredOnNewDevice: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If true, a device is only remembered on user prompt.
    */
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[Input[Boolean]] = js.native
}

object UserPoolDeviceConfiguration {
  @scala.inline
  def apply(
    challengeRequiredOnNewDevice: Input[Boolean] = null,
    deviceOnlyRememberedOnUserPrompt: Input[Boolean] = null
  ): UserPoolDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (challengeRequiredOnNewDevice != null) __obj.updateDynamic("challengeRequiredOnNewDevice")(challengeRequiredOnNewDevice.asInstanceOf[js.Any])
    if (deviceOnlyRememberedOnUserPrompt != null) __obj.updateDynamic("deviceOnlyRememberedOnUserPrompt")(deviceOnlyRememberedOnUserPrompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDeviceConfiguration]
  }
}

