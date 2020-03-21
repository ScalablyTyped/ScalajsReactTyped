package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorDecorationType extends js.Object {
  /**
  		 * Internal representation of the handle.
  		 */
  val key: String
  /**
  		 * Remove this decoration type and all decorations on all text editors using it.
  		 */
  def dispose(): Unit
}

object TextEditorDecorationType {
  @scala.inline
  def apply(dispose: Callback, key: String): TextEditorDecorationType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[TextEditorDecorationType]
  }
}

