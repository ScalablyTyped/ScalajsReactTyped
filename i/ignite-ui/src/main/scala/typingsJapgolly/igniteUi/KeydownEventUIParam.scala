package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeydownEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editor input field.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the event target.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the value of the keyCode.
  	 */
  var key: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object KeydownEventUIParam {
  @scala.inline
  def apply(editorInput: js.Any = null, element: js.Any = null, key: js.Any = null, owner: js.Any = null): KeydownEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeydownEventUIParam]
  }
}

