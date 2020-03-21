package typingsJapgolly.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid returning boolean values
  * to indicate whether an event was handled or not.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.draftJs.draftJsStrings.handled
  - typingsJapgolly.draftJs.draftJsStrings.`not-handled`
*/
trait DraftHandleValue extends js.Object

object DraftHandleValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handled: typingsJapgolly.draftJs.draftJsStrings.handled = this.cast("handled")
  @scala.inline
  def `not-handled`: typingsJapgolly.draftJs.draftJsStrings.`not-handled` = this.cast("not-handled")
}

