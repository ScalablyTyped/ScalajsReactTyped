package typingsJapgolly.fastJsonPatch.coreMod

import typingsJapgolly.fastJsonPatch.fastJsonPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperation[T] extends BaseOperation {
  var op: test
  var value: T
}

object TestOperation {
  @scala.inline
  def apply[T](op: test, path: String, value: T): TestOperation[T] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestOperation[T]]
  }
}

