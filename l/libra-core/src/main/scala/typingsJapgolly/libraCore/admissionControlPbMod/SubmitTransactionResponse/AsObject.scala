package typingsJapgolly.libraCore.admissionControlPbMod.SubmitTransactionResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var acStatus: js.UndefOr[typingsJapgolly.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject] = js.undefined
  var mempoolStatus: js.UndefOr[
    typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject
  ] = js.undefined
  var validatorId: scala.scalajs.js.typedarray.Uint8Array | String
  var vmStatus: js.UndefOr[typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    validatorId: scala.scalajs.js.typedarray.Uint8Array | String,
    acStatus: typingsJapgolly.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject = null,
    mempoolStatus: typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject = null,
    vmStatus: typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(validatorId = validatorId.asInstanceOf[js.Any])
    if (acStatus != null) __obj.updateDynamic("acStatus")(acStatus.asInstanceOf[js.Any])
    if (mempoolStatus != null) __obj.updateDynamic("mempoolStatus")(mempoolStatus.asInstanceOf[js.Any])
    if (vmStatus != null) __obj.updateDynamic("vmStatus")(vmStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

