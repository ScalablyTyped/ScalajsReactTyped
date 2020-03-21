package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that contains the HSM that you are deleting.
    */
  var ClusterId: typingsJapgolly.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  /**
    * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniId: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.EniId] = js.native
  /**
    * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The identifier (ID) of the HSM that you are deleting.
    */
  var HsmId: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}

object DeleteHsmRequest {
  @scala.inline
  def apply(ClusterId: ClusterId, EniId: EniId = null, EniIp: IpAddress = null, HsmId: HsmId = null): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (EniId != null) __obj.updateDynamic("EniId")(EniId.asInstanceOf[js.Any])
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp.asInstanceOf[js.Any])
    if (HsmId != null) __obj.updateDynamic("HsmId")(HsmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
}

