package typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountStatesList: js.Array[typingsJapgolly.libraCore.transactionPbMod.AccountState.AsObject]
  var eventsList: js.Array[typingsJapgolly.libraCore.eventsPbMod.Event.AsObject]
  var gasUsed: String
  var signedTxn: js.UndefOr[typingsJapgolly.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    accountStatesList: js.Array[typingsJapgolly.libraCore.transactionPbMod.AccountState.AsObject],
    eventsList: js.Array[typingsJapgolly.libraCore.eventsPbMod.Event.AsObject],
    gasUsed: String,
    signedTxn: typingsJapgolly.libraCore.transactionPbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
    if (signedTxn != null) __obj.updateDynamic("signedTxn")(signedTxn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

