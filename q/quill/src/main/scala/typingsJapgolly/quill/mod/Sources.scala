package typingsJapgolly.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.quill.quillStrings.api
  - typingsJapgolly.quill.quillStrings.user
  - typingsJapgolly.quill.quillStrings.silent
*/
trait Sources extends js.Object

object Sources {
  @scala.inline
  def api: typingsJapgolly.quill.quillStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def silent: typingsJapgolly.quill.quillStrings.silent = this.cast("silent")
  @scala.inline
  def user: typingsJapgolly.quill.quillStrings.user = this.cast("user")
}

