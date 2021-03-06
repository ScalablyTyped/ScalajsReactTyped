package typingsJapgolly.std

import typingsJapgolly.std.stdBooleans.`false`
import typingsJapgolly.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.ReadableStreamReadValueResult[T]
  - typingsJapgolly.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends js.Object

object ReadableStreamReadResult {
  @scala.inline
  def ReadableStreamReadValueResult[T](done: `false`, value: T): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
  @scala.inline
  def ReadableStreamReadDoneResult[T](done: `true`, value: T = null): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
}

