package typingsJapgolly.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.codemirror.codemirrorStrings.textarea
  - typingsJapgolly.codemirror.codemirrorStrings.contenteditable
*/
trait InputStyle extends js.Object

object InputStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contenteditable: typingsJapgolly.codemirror.codemirrorStrings.contenteditable = this.cast("contenteditable")
  @scala.inline
  def textarea: typingsJapgolly.codemirror.codemirrorStrings.textarea = this.cast("textarea")
}

