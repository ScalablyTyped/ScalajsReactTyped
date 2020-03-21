package typingsJapgolly.ckeditor.CKEDITOR.plugins.notification

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditor.CKEDITOR.dom.element
import typingsJapgolly.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait area extends js.Object {
  val editor: typingsJapgolly.ckeditor.CKEDITOR.editor
  val element: typingsJapgolly.ckeditor.CKEDITOR.dom.element
  val notifications: js.Array[typingsJapgolly.ckeditor.CKEDITOR.plugins.notification]
  def add(notification: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification): Unit
  def remove(notification: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification): Unit
}

object area {
  @scala.inline
  def apply(
    add: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification => Callback,
    editor: editor,
    element: element,
    notifications: js.Array[typingsJapgolly.ckeditor.CKEDITOR.plugins.notification],
    remove: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification => Callback
  ): area = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification) => add(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.ckeditor.CKEDITOR.plugins.notification) => remove(t0).runNow()))
    __obj.asInstanceOf[area]
  }
}

