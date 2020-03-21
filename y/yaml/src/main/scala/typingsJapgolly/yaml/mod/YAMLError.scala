package typingsJapgolly.yaml.mod

import typingsJapgolly.yaml.mod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yaml.mod.YAMLSyntaxError
  - typingsJapgolly.yaml.mod.YAMLSemanticError
  - typingsJapgolly.yaml.mod.YAMLReferenceError
*/
trait YAMLError extends js.Object

object YAMLError {
  @scala.inline
  def YAMLSyntaxError(
    message: String,
    name: typingsJapgolly.yaml.yamlStrings.YAMLSyntaxError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
  @scala.inline
  def YAMLSemanticError(
    message: String,
    name: typingsJapgolly.yaml.yamlStrings.YAMLSemanticError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
  @scala.inline
  def YAMLReferenceError(
    message: String,
    name: typingsJapgolly.yaml.yamlStrings.YAMLReferenceError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
}

