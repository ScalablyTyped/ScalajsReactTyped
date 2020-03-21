package typingsJapgolly.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendKeyEventParameters extends js.Object {
  /** ID of the context where the key events will be sent, or zero to send key events to non-input field. */
  var contextID: Double
  /** Data on the key event. */
  var keyData: js.Array[KeyboardEvent]
}

object SendKeyEventParameters {
  @scala.inline
  def apply(contextID: Double, keyData: js.Array[KeyboardEvent]): SendKeyEventParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendKeyEventParameters]
  }
}

