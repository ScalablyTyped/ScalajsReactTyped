package typingsJapgolly.ably.mod.Types

import typingsJapgolly.ably.ablyStrings.android
import typingsJapgolly.ably.ablyStrings.browser
import typingsJapgolly.ably.ablyStrings.car
import typingsJapgolly.ably.ablyStrings.desktop
import typingsJapgolly.ably.ablyStrings.embedded
import typingsJapgolly.ably.ablyStrings.ios
import typingsJapgolly.ably.ablyStrings.other
import typingsJapgolly.ably.ablyStrings.phone
import typingsJapgolly.ably.ablyStrings.tablet
import typingsJapgolly.ably.ablyStrings.tv
import typingsJapgolly.ably.ablyStrings.watch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDetails extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var deviceSecret: js.UndefOr[String] = js.undefined
  var formFactor: phone | tablet | desktop | tv | watch | car | embedded | other
  var id: String
  var metadata: js.UndefOr[js.Any] = js.undefined
  var platform: android | ios | browser
  var push: DevicePushDetails
}

object DeviceDetails {
  @scala.inline
  def apply(
    formFactor: phone | tablet | desktop | tv | watch | car | embedded | other,
    id: String,
    platform: android | ios | browser,
    push: DevicePushDetails,
    clientId: String = null,
    deviceSecret: String = null,
    metadata: js.Any = null
  ): DeviceDetails = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (deviceSecret != null) __obj.updateDynamic("deviceSecret")(deviceSecret.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDetails]
  }
}

