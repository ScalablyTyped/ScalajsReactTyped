package typingsJapgolly.stellarBase.mod.TransactionBuilder

import typingsJapgolly.stellarBase.AnonMinTime
import typingsJapgolly.stellarBase.mod.Memo
import typingsJapgolly.stellarBase.mod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionBuilderOptions extends js.Object {
  var fee: Double
  var memo: js.UndefOr[Memo[MemoType]] = js.undefined
  var networkPassphrase: js.UndefOr[String] = js.undefined
  var timebounds: js.UndefOr[AnonMinTime] = js.undefined
}

object TransactionBuilderOptions {
  @scala.inline
  def apply(
    fee: Double,
    memo: Memo[MemoType] = null,
    networkPassphrase: String = null,
    timebounds: AnonMinTime = null
  ): TransactionBuilderOptions = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    if (networkPassphrase != null) __obj.updateDynamic("networkPassphrase")(networkPassphrase.asInstanceOf[js.Any])
    if (timebounds != null) __obj.updateDynamic("timebounds")(timebounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionBuilderOptions]
  }
}

