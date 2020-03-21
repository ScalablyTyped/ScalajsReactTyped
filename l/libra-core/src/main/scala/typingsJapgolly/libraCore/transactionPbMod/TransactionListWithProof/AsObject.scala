package typingsJapgolly.libraCore.transactionPbMod.TransactionListWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsForVersions: js.UndefOr[typingsJapgolly.libraCore.eventsPbMod.EventsForVersions.AsObject] = js.undefined
  var firstTransactionVersion: js.UndefOr[typingsJapgolly.googleProtobuf.wrappersPbMod.UInt64Value.AsObject] = js.undefined
  var infosList: js.Array[typingsJapgolly.libraCore.transactionInfoPbMod.TransactionInfo.AsObject]
  var proofOfFirstTransaction: js.UndefOr[typingsJapgolly.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var proofOfLastTransaction: js.UndefOr[typingsJapgolly.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var transactionsList: js.Array[typingsJapgolly.libraCore.transactionPbMod.SignedTransaction.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    infosList: js.Array[typingsJapgolly.libraCore.transactionInfoPbMod.TransactionInfo.AsObject],
    transactionsList: js.Array[typingsJapgolly.libraCore.transactionPbMod.SignedTransaction.AsObject],
    eventsForVersions: typingsJapgolly.libraCore.eventsPbMod.EventsForVersions.AsObject = null,
    firstTransactionVersion: typingsJapgolly.googleProtobuf.wrappersPbMod.UInt64Value.AsObject = null,
    proofOfFirstTransaction: typingsJapgolly.libraCore.proofPbMod.AccumulatorProof.AsObject = null,
    proofOfLastTransaction: typingsJapgolly.libraCore.proofPbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(infosList = infosList.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
    if (eventsForVersions != null) __obj.updateDynamic("eventsForVersions")(eventsForVersions.asInstanceOf[js.Any])
    if (firstTransactionVersion != null) __obj.updateDynamic("firstTransactionVersion")(firstTransactionVersion.asInstanceOf[js.Any])
    if (proofOfFirstTransaction != null) __obj.updateDynamic("proofOfFirstTransaction")(proofOfFirstTransaction.asInstanceOf[js.Any])
    if (proofOfLastTransaction != null) __obj.updateDynamic("proofOfLastTransaction")(proofOfLastTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

