package typingsJapgolly.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  /** Optional flag for sending an indication instead of a notification. */
  var shouldIndicate: Boolean
  /** New value of the characteristic. */
  var value: scala.scalajs.js.typedarray.ArrayBuffer
}

object INotification {
  @scala.inline
  def apply(shouldIndicate: Boolean, value: scala.scalajs.js.typedarray.ArrayBuffer): INotification = {
    val __obj = js.Dynamic.literal(shouldIndicate = shouldIndicate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotification]
  }
}

