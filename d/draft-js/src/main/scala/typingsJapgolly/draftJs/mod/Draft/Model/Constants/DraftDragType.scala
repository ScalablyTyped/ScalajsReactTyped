package typingsJapgolly.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid passing boolean arguments
  * around to indicate whether a drag type is internal or external.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.draftJs.draftJsStrings.internal
  - typingsJapgolly.draftJs.draftJsStrings.external
*/
trait DraftDragType extends js.Object

object DraftDragType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsJapgolly.draftJs.draftJsStrings.external = this.cast("external")
  @scala.inline
  def internal: typingsJapgolly.draftJs.draftJsStrings.internal = this.cast("internal")
}

