package typingsJapgolly.ckeditor.CKEDITOR.plugins.balloontoolbar

import typingsJapgolly.ckeditor.CKEDITOR.dom.selection
import typingsJapgolly.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.balloontoolbar.contextManager")
@js.native
class contextManager protected () extends js.Object {
  def this(editor: editor) = this()
  var editor: typingsJapgolly.ckeditor.CKEDITOR.editor = js.native
  def add(context: context): Unit = js.native
  def check(): Unit = js.native
  def check(selection: selection): Unit = js.native
  def create(options: contextDefinition): context = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
}

