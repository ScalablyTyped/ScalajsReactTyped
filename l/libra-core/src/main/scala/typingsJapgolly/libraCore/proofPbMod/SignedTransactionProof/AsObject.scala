package typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsJapgolly.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var transactionInfo: js.UndefOr[typingsJapgolly.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typingsJapgolly.libraCore.proofPbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typingsJapgolly.libraCore.transactionInfoPbMod.TransactionInfo.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof.asInstanceOf[js.Any])
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

