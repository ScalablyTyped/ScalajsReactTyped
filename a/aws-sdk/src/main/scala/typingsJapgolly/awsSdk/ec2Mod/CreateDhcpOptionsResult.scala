package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDhcpOptionsResult extends js.Object {
  /**
    * A set of DHCP options.
    */
  var DhcpOptions: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.DhcpOptions] = js.native
}

object CreateDhcpOptionsResult {
  @scala.inline
  def apply(DhcpOptions: DhcpOptions = null): CreateDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (DhcpOptions != null) __obj.updateDynamic("DhcpOptions")(DhcpOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDhcpOptionsResult]
  }
}

