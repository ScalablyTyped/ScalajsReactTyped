package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorAction extends js.Object {
  val alias: String
  val id: String
  val label: String
  def isSupported(): Boolean
  def run(): js.Promise[Unit]
}

object IEditorAction {
  @scala.inline
  def apply(
    alias: String,
    id: String,
    isSupported: CallbackTo[Boolean],
    label: String,
    run: CallbackTo[js.Promise[Unit]]
  ): IEditorAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("isSupported")(isSupported.toJsFn)
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[IEditorAction]
  }
}

