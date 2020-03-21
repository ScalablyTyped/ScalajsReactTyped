package typingsJapgolly.chromeApps.chrome.usb

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
trait ConfigDescriptor extends js.Object {
  /**
    * Is this the active configuration?
    * @since Chrome 47.
    */
  var active: Boolean
  /** The configuration number. */
  var configurationValue: integer
  /** Description of the configuration. */
  var description: js.UndefOr[String] = js.undefined
  /** Extra descriptor data associated with this configuration. */
  var extra_data: scala.scalajs.js.typedarray.ArrayBuffer
  /** Available interfaces. */
  var interfaces: js.Array[InterfaceDescriptor]
  /** The maximum power needed by this device in milliamps (mA). */
  var maxPower: integer
  /** The device supports remote wakeup. */
  var remoteWakeup: Boolean
  /** The device is self-powered. */
  var selfPowered: Boolean
}

object ConfigDescriptor {
  @scala.inline
  def apply(
    active: Boolean,
    configurationValue: integer,
    extra_data: scala.scalajs.js.typedarray.ArrayBuffer,
    interfaces: js.Array[InterfaceDescriptor],
    maxPower: integer,
    remoteWakeup: Boolean,
    selfPowered: Boolean,
    description: String = null
  ): ConfigDescriptor = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], configurationValue = configurationValue.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], maxPower = maxPower.asInstanceOf[js.Any], remoteWakeup = remoteWakeup.asInstanceOf[js.Any], selfPowered = selfPowered.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDescriptor]
  }
}

