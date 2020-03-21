package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionList extends IDisposable {
  val actions: js.Array[CodeAction]
}

object CodeActionList {
  @scala.inline
  def apply(actions: js.Array[CodeAction], dispose: Callback): CodeActionList = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[CodeActionList]
  }
}

