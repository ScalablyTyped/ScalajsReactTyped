package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.ethereumProtocol.mod.AbiType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodAbi extends FunctionAbi {
  var constant: Boolean
  var inputs: js.Array[DataItem]
  var name: String
  var outputs: js.Array[DataItem]
  var payable: Boolean
  var stateMutability: StateMutability
  var `type`: Function
}

object MethodAbi {
  @scala.inline
  def apply(
    constant: Boolean,
    inputs: js.Array[DataItem],
    name: String,
    outputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: StateMutability,
    `type`: Function
  ): MethodAbi = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodAbi]
  }
}

