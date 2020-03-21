package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicIpv4PoolRange extends js.Object {
  /**
    * The number of addresses in the range.
    */
  var AddressCount: js.UndefOr[Integer] = js.native
  /**
    * The number of available addresses in the range.
    */
  var AvailableAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The first IP address in the range.
    */
  var FirstAddress: js.UndefOr[String] = js.native
  /**
    * The last IP address in the range.
    */
  var LastAddress: js.UndefOr[String] = js.native
}

object PublicIpv4PoolRange {
  @scala.inline
  def apply(
    AddressCount: Int | scala.Double = null,
    AvailableAddressCount: Int | scala.Double = null,
    FirstAddress: String = null,
    LastAddress: String = null
  ): PublicIpv4PoolRange = {
    val __obj = js.Dynamic.literal()
    if (AddressCount != null) __obj.updateDynamic("AddressCount")(AddressCount.asInstanceOf[js.Any])
    if (AvailableAddressCount != null) __obj.updateDynamic("AvailableAddressCount")(AvailableAddressCount.asInstanceOf[js.Any])
    if (FirstAddress != null) __obj.updateDynamic("FirstAddress")(FirstAddress.asInstanceOf[js.Any])
    if (LastAddress != null) __obj.updateDynamic("LastAddress")(LastAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicIpv4PoolRange]
  }
}

