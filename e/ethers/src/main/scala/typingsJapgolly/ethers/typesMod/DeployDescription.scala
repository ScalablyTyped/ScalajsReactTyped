package typingsJapgolly.ethers.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployDescription extends js.Object {
  val inputs: js.Array[ParamType]
  val payable: Boolean
  def encode(bytecode: String, params: js.Array[_]): String
}

object DeployDescription {
  @scala.inline
  def apply(
    encode: (String, js.Array[js.Any]) => CallbackTo[String],
    inputs: js.Array[ParamType],
    payable: Boolean
  ): DeployDescription = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => encode(t0, t1).runNow()))
    __obj.asInstanceOf[DeployDescription]
  }
}

