package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowAssignment
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var node: Expression | VariableDeclaration | BindingElement
}

object FlowAssignment {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: Expression | VariableDeclaration | BindingElement,
    id: Int | Double = null
  ): FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowAssignment]
  }
}

