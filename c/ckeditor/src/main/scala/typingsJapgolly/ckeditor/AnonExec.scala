package typingsJapgolly.ckeditor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditor.CKEDITOR.dom.elementPath
import typingsJapgolly.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExec extends js.Object {
  def exec(editor: editor): Boolean
  def refresh(editor: editor, path: elementPath): Double
}

object AnonExec {
  @scala.inline
  def apply(exec: editor => CallbackTo[Boolean], refresh: (editor, elementPath) => CallbackTo[Double]): AnonExec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: typingsJapgolly.ckeditor.CKEDITOR.editor) => exec(t0).runNow()))
    __obj.updateDynamic("refresh")(js.Any.fromFunction2((t0: typingsJapgolly.ckeditor.CKEDITOR.editor, t1: typingsJapgolly.ckeditor.CKEDITOR.dom.elementPath) => refresh(t0, t1).runNow()))
    __obj.asInstanceOf[AnonExec]
  }
}

