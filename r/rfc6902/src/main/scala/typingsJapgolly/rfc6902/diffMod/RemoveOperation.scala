package typingsJapgolly.rfc6902.diffMod

import typingsJapgolly.rfc6902.rfc6902Strings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOperation extends Operation {
  var op: remove
  var path: String
}

object RemoveOperation {
  @scala.inline
  def apply(op: remove, path: String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveOperation]
  }
}

