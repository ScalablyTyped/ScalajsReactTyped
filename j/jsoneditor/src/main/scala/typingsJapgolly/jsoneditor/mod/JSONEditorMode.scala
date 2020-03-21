package typingsJapgolly.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsoneditor.jsoneditorStrings.tree
  - typingsJapgolly.jsoneditor.jsoneditorStrings.view
  - typingsJapgolly.jsoneditor.jsoneditorStrings.form
  - typingsJapgolly.jsoneditor.jsoneditorStrings.code
  - typingsJapgolly.jsoneditor.jsoneditorStrings.text
*/
trait JSONEditorMode extends js.Object

object JSONEditorMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsJapgolly.jsoneditor.jsoneditorStrings.code = this.cast("code")
  @scala.inline
  def form: typingsJapgolly.jsoneditor.jsoneditorStrings.form = this.cast("form")
  @scala.inline
  def text: typingsJapgolly.jsoneditor.jsoneditorStrings.text = this.cast("text")
  @scala.inline
  def tree: typingsJapgolly.jsoneditor.jsoneditorStrings.tree = this.cast("tree")
  @scala.inline
  def view: typingsJapgolly.jsoneditor.jsoneditorStrings.view = this.cast("view")
}

