package typingsJapgolly.ethers.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ethers.ethersStrings.call
import typingsJapgolly.ethers.ethersStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDescription extends js.Object {
  val inputs: js.Array[ParamType]
  val name: String
  val outputs: js.Array[ParamType]
  val payable: Boolean
  val sighash: String
  val signature: String
  val `type`: call | transaction
  def decode(data: String): js.Any
  def encode(params: js.Array[_]): String
}

object FunctionDescription {
  @scala.inline
  def apply(
    decode: String => CallbackTo[js.Any],
    encode: js.Array[js.Any] => CallbackTo[String],
    inputs: js.Array[ParamType],
    name: String,
    outputs: js.Array[ParamType],
    payable: Boolean,
    sighash: String,
    signature: String,
    `type`: call | transaction
  ): FunctionDescription = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], sighash = sighash.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Array[js.Any]) => encode(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDescription]
  }
}

