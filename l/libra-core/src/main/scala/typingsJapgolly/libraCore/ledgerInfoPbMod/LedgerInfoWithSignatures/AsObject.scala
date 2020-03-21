package typingsJapgolly.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfo: js.UndefOr[typingsJapgolly.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject] = js.undefined
  var signaturesList: js.Array[typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    signaturesList: js.Array[typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject],
    ledgerInfo: typingsJapgolly.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(signaturesList = signaturesList.asInstanceOf[js.Any])
    if (ledgerInfo != null) __obj.updateDynamic("ledgerInfo")(ledgerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

