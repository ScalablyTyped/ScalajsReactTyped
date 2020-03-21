package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slickgrid.Slick.Editors.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFactory extends js.Object {
  def getEditor[T](column: Column[T]): Editor[T]
}

object EditorFactory {
  @scala.inline
  def apply(getEditor: Column[js.Any] => CallbackTo[Editor[js.Any]]): EditorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEditor")(js.Any.fromFunction1((t0: typingsJapgolly.slickgrid.Slick.Column[js.Any]) => getEditor(t0).runNow()))
    __obj.asInstanceOf[EditorFactory]
  }
}

