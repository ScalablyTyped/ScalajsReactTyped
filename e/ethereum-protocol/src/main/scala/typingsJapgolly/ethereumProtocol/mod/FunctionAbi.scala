package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.ethereumProtocol.mod.AbiType.Constructor
import typingsJapgolly.ethereumProtocol.mod.AbiType.Fallback
import typingsJapgolly.ethereumProtocol.mod.AbiType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ethereumProtocol.mod.MethodAbi
  - typingsJapgolly.ethereumProtocol.mod.ConstructorAbi
  - typingsJapgolly.ethereumProtocol.mod.FallbackAbi
*/
trait FunctionAbi extends AbiDefinition

object FunctionAbi {
  @scala.inline
  def MethodAbi(
    constant: Boolean,
    inputs: js.Array[DataItem],
    name: String,
    outputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: StateMutability,
    `type`: Function
  ): FunctionAbi = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionAbi]
  }
  @scala.inline
  def ConstructorAbi(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): FunctionAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionAbi]
  }
  @scala.inline
  def FallbackAbi(payable: Boolean, `type`: Fallback): FunctionAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionAbi]
  }
}

