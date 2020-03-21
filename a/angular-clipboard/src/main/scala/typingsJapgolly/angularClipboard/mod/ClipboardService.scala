package typingsJapgolly.angularClipboard.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardService extends js.Object {
  /**
    * tells us whether or not angular-clipboard is supported
    */
  var supported: Boolean
  /**
    * copies text to a clipboard
    * @param text the text to be copied to the clipboard
    */
  def copyText(text: String): Unit
}

object ClipboardService {
  @scala.inline
  def apply(copyText: String => Callback, supported: Boolean): ClipboardService = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.updateDynamic("copyText")(js.Any.fromFunction1((t0: java.lang.String) => copyText(t0).runNow()))
    __obj.asInstanceOf[ClipboardService]
  }
}

