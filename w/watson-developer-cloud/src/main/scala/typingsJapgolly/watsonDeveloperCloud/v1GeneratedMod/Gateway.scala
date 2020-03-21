package typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object describing a specific gateway. */
trait Gateway extends js.Object {
  /** The gateway ID of the gateway. */
  var gateway_id: js.UndefOr[String] = js.undefined
  /** The user defined name of the gateway. */
  var name: js.UndefOr[String] = js.undefined
  /** The current status of the gateway. `connected` means the gateway is connected to the remotly installed gateway. `idle` means this gateway is not currently in use. */
  var status: js.UndefOr[String] = js.undefined
  /** The generated **token** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token: js.UndefOr[String] = js.undefined
  /** The generated **token_id** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token_id: js.UndefOr[String] = js.undefined
}

object Gateway {
  @scala.inline
  def apply(
    gateway_id: String = null,
    name: String = null,
    status: String = null,
    token: String = null,
    token_id: String = null
  ): Gateway = {
    val __obj = js.Dynamic.literal()
    if (gateway_id != null) __obj.updateDynamic("gateway_id")(gateway_id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (token_id != null) __obj.updateDynamic("token_id")(token_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gateway]
  }
}

