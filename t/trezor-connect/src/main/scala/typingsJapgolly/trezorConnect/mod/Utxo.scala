package typingsJapgolly.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utxo extends js.Object {
   // how much money sent
  var addressPath: js.Tuple2[Double, Double]
   // null == unconfirmed
  var coinbase: Boolean
   // path
  var height: Double | Null
  var index: Double
   // virtual size - segwit concept - same as size in non-segwit
  var own: Boolean
   // index of output IN THE TRANSACTION
  var transactionHash: String
  var tsize: Double
   // hash of the transaction
  var value: Double
   // total size - in case of segwit, total, with segwit data
  var vsize: Double
}

object Utxo {
  @scala.inline
  def apply(
    addressPath: js.Tuple2[Double, Double],
    coinbase: Boolean,
    index: Double,
    own: Boolean,
    transactionHash: String,
    tsize: Double,
    value: Double,
    vsize: Double,
    height: Int | Double = null
  ): Utxo = {
    val __obj = js.Dynamic.literal(addressPath = addressPath.asInstanceOf[js.Any], coinbase = coinbase.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], own = own.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], tsize = tsize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utxo]
  }
}

