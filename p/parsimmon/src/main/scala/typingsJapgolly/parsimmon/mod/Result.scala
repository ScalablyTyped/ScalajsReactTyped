package typingsJapgolly.parsimmon.mod

import typingsJapgolly.parsimmon.parsimmonBooleans.`false`
import typingsJapgolly.parsimmon.parsimmonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parsimmon.mod.Success[T]
  - typingsJapgolly.parsimmon.mod.Failure
*/
trait Result[T] extends js.Object

object Result {
  @scala.inline
  def Success[T](status: `true`, value: T): Result[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result[T]]
  }
  @scala.inline
  def Failure[T](expected: js.Array[String], index: Index_, status: `false`): Result[T] = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result[T]]
  }
}

