package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxData extends CallTxDataBase {
  var from: String
}

object TxData {
  @scala.inline
  def apply(
    from: String,
    data: String = null,
    gas: Double | String | default = null,
    gasPrice: Double | String | default = null,
    nonce: Int | Double = null,
    to: String = null,
    value: Double | String | default = null
  ): TxData = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxData]
  }
}

