package typingsJapgolly.yaml.mod

import typingsJapgolly.std.Error
import typingsJapgolly.yaml.mod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLReferenceError
  extends Error
     with YAMLError {
  @JSName("name")
  var name_YAMLReferenceError: typingsJapgolly.yaml.yamlStrings.YAMLReferenceError
  var source: Node
}

object YAMLReferenceError {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.yaml.yamlStrings.YAMLReferenceError,
    source: Node,
    stack: String = null
  ): YAMLReferenceError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLReferenceError]
  }
}

