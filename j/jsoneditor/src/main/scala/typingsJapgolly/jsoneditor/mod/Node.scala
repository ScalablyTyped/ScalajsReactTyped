package typingsJapgolly.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var field: String
  var path: JSONPath
  var value: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(field: String, path: JSONPath, value: String = null): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

