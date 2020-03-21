package typingsJapgolly.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTypes.jestTypesStrings.skip
  - typingsJapgolly.jestTypes.jestTypesStrings.done
  - typingsJapgolly.jestTypes.jestTypesStrings.todo
*/
trait TestStatus extends js.Object

object TestStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typingsJapgolly.jestTypes.jestTypesStrings.done = this.cast("done")
  @scala.inline
  def skip: typingsJapgolly.jestTypes.jestTypesStrings.skip = this.cast("skip")
  @scala.inline
  def todo: typingsJapgolly.jestTypes.jestTypesStrings.todo = this.cast("todo")
}

