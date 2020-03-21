package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateClientVpnTargetNetworkResult extends js.Object {
  /**
    * The unique ID of the target network association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
}

object AssociateClientVpnTargetNetworkResult {
  @scala.inline
  def apply(AssociationId: String = null, Status: AssociationStatus = null): AssociateClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateClientVpnTargetNetworkResult]
  }
}

