package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDefaultSubnetResult extends js.Object {
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.Subnet] = js.native
}

object CreateDefaultSubnetResult {
  @scala.inline
  def apply(Subnet: Subnet = null): CreateDefaultSubnetResult = {
    val __obj = js.Dynamic.literal()
    if (Subnet != null) __obj.updateDynamic("Subnet")(Subnet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDefaultSubnetResult]
  }
}

