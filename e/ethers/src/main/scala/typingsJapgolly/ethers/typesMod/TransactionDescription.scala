package typingsJapgolly.ethers.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionDescription extends js.Object {
  val args: js.Array[_]
  val name: String
  val sighash: String
  val signature: String
  val value: BigNumber
  def decode(data: String): js.Any
}

object TransactionDescription {
  @scala.inline
  def apply(
    args: js.Array[_],
    decode: String => CallbackTo[js.Any],
    name: String,
    sighash: String,
    signature: String,
    value: BigNumber
  ): TransactionDescription = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sighash = sighash.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.asInstanceOf[TransactionDescription]
  }
}

