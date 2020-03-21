package typingsJapgolly.yaml.mod

import typingsJapgolly.std.Error
import typingsJapgolly.yaml.mod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSemanticError
  extends Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSemanticError: typingsJapgolly.yaml.yamlStrings.YAMLSemanticError
  var source: Node
}

object YAMLSemanticError {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.yaml.yamlStrings.YAMLSemanticError,
    source: Node,
    stack: String = null
  ): YAMLSemanticError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLSemanticError]
  }
}

