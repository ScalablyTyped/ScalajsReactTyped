package typingsJapgolly.libraCore.mempoolPbMod.GetBlockResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var block: js.UndefOr[typingsJapgolly.libraCore.transactionPbMod.SignedTransactionsBlock.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(block: typingsJapgolly.libraCore.transactionPbMod.SignedTransactionsBlock.AsObject = null): AsObject = {
    val __obj = js.Dynamic.literal()
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

