package typingsJapgolly.libraCore.getWithProofPbMod.GetTransactionsResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var txnListWithProof: js.UndefOr[typingsJapgolly.libraCore.transactionPbMod.TransactionListWithProof.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    txnListWithProof: typingsJapgolly.libraCore.transactionPbMod.TransactionListWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (txnListWithProof != null) __obj.updateDynamic("txnListWithProof")(txnListWithProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

