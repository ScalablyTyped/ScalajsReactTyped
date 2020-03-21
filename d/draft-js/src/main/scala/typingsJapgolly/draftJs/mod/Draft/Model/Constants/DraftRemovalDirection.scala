package typingsJapgolly.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid passing boolean arguments
  * around to indicate whether a deletion is forward or backward.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.draftJs.draftJsStrings.backward
  - typingsJapgolly.draftJs.draftJsStrings.forward
*/
trait DraftRemovalDirection extends js.Object

object DraftRemovalDirection {
  @scala.inline
  def backward: typingsJapgolly.draftJs.draftJsStrings.backward = this.cast("backward")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forward: typingsJapgolly.draftJs.draftJsStrings.forward = this.cast("forward")
}

