package typingsJapgolly.backlogJs.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.backlogJs.backlogJsStrings.BacklogApiError
  - typingsJapgolly.backlogJs.backlogJsStrings.BacklogAuthError
  - typingsJapgolly.backlogJs.backlogJsStrings.UnexpectedError
*/
trait BacklogErrorNameType extends js.Object

object BacklogErrorNameType {
  @scala.inline
  def BacklogApiError: typingsJapgolly.backlogJs.backlogJsStrings.BacklogApiError = this.cast("BacklogApiError")
  @scala.inline
  def BacklogAuthError: typingsJapgolly.backlogJs.backlogJsStrings.BacklogAuthError = this.cast("BacklogAuthError")
  @scala.inline
  def UnexpectedError: typingsJapgolly.backlogJs.backlogJsStrings.UnexpectedError = this.cast("UnexpectedError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

