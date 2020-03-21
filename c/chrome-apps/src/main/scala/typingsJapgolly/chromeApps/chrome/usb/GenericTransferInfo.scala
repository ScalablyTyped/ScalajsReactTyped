package typingsJapgolly.chromeApps.chrome.usb

import typingsJapgolly.chromeApps.AnonIN
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings.in
import typingsJapgolly.chromeApps.chromeAppsStrings.out
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /**
    * The transfer direction ('in' or 'out').
    * @see Direction
    */
  var direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]]
  /** The target endpoint address. The interface containing this endpoint must be claimed. */
  var endpoint: integer
  /** The maximum number of bytes to receive (required only by input transfers). */
  var length: js.UndefOr[integer] = js.undefined
  /**
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.undefined
}

object GenericTransferInfo {
  @scala.inline
  def apply(
    direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]],
    endpoint: integer,
    data: scala.scalajs.js.typedarray.ArrayBuffer = null,
    length: Int | Double = null,
    timeout: Int | Double = null
  ): GenericTransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransferInfo]
  }
}

