package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
}

object SchemaSubnetworksSetPrivateIpGoogleAccessRequest {
  @scala.inline
  def apply(privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined): SchemaSubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(privateIpGoogleAccess)) __obj.updateDynamic("privateIpGoogleAccess")(privateIpGoogleAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubnetworksSetPrivateIpGoogleAccessRequest]
  }
}

