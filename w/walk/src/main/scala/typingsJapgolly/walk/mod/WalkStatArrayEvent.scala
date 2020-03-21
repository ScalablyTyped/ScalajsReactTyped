package typingsJapgolly.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.walk.walkStrings.files
  - typingsJapgolly.walk.walkStrings.directories
  - typingsJapgolly.walk.walkStrings.errors
  - typingsJapgolly.walk.walkStrings.nodeError
  - typingsJapgolly.walk.walkStrings.directoryError
*/
trait WalkStatArrayEvent extends js.Object

object WalkStatArrayEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directories: typingsJapgolly.walk.walkStrings.directories = this.cast("directories")
  @scala.inline
  def directoryError: typingsJapgolly.walk.walkStrings.directoryError = this.cast("directoryError")
  @scala.inline
  def errors: typingsJapgolly.walk.walkStrings.errors = this.cast("errors")
  @scala.inline
  def files: typingsJapgolly.walk.walkStrings.files = this.cast("files")
  @scala.inline
  def nodeError: typingsJapgolly.walk.walkStrings.nodeError = this.cast("nodeError")
}

