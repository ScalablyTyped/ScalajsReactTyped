package typingsJapgolly.yaml.mod

import typingsJapgolly.std.Error
import typingsJapgolly.yaml.mod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSyntaxError
  extends Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSyntaxError: typingsJapgolly.yaml.yamlStrings.YAMLSyntaxError
  var source: Node
}

object YAMLSyntaxError {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.yaml.yamlStrings.YAMLSyntaxError,
    source: Node,
    stack: String = null
  ): YAMLSyntaxError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLSyntaxError]
  }
}

