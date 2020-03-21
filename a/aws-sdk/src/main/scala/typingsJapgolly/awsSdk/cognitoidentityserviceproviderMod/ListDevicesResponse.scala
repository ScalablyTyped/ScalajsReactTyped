package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevicesResponse extends js.Object {
  /**
    * The devices returned in the list devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.native
  /**
    * The pagination token for the list device response.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
}

object ListDevicesResponse {
  @scala.inline
  def apply(Devices: DeviceListType = null, PaginationToken: SearchPaginationTokenType = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

