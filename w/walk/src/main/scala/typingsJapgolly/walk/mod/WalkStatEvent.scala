package typingsJapgolly.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.walk.walkStrings.file
  - typingsJapgolly.walk.walkStrings.directory
*/
trait WalkStatEvent extends js.Object

object WalkStatEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsJapgolly.walk.walkStrings.directory = this.cast("directory")
  @scala.inline
  def file: typingsJapgolly.walk.walkStrings.file = this.cast("file")
}

