package typingsJapgolly.libraCore.mempoolPbMod.AddTransactionWithValidationResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var currentVersion: String
  var status: js.UndefOr[
    typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    currentVersion: String,
    status: typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

