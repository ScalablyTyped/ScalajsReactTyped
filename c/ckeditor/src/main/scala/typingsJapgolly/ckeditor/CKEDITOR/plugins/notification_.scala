package typingsJapgolly.ckeditor.CKEDITOR.plugins

import typingsJapgolly.ckeditor.CKEDITOR.plugins.notification.options
import typingsJapgolly.ckeditor.CKEDITOR.plugins.notification.updateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notification")
@js.native
class notification_ protected () extends js.Object {
  def this(editor: typingsJapgolly.ckeditor.CKEDITOR.editor, options: options) = this()
  val area: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification.area = js.native
  val duration: Double = js.native
  val editor: typingsJapgolly.ckeditor.CKEDITOR.editor = js.native
  val element: typingsJapgolly.ckeditor.CKEDITOR.dom.element = js.native
  val id: Double = js.native
  val message: String = js.native
  val progress: Double = js.native
  val `type`: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification.`type` = js.native
  def hide(): Unit = js.native
  def isVisible(): Boolean = js.native
  def show(): Unit = js.native
  def update(options: updateOptions): Unit = js.native
}

