package typingsJapgolly.fastJsonPatch.coreMod

import typingsJapgolly.fastJsonPatch.fastJsonPatchStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOperation[T] extends BaseOperation {
  var op: add
  var value: T
}

object AddOperation {
  @scala.inline
  def apply[T](op: add, path: String, value: T): AddOperation[T] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddOperation[T]]
  }
}

