package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shortcut option is an object contains initial settings for the Shortcut.
  */
@js.native
trait ShortcutOption extends js.Object {
  /**
    * {Function} (Optional) A callback when the hotkey is triggered.
    */
  var active: js.Function = js.native
  /**
    * {string} Key combinations of the shortcut, such as "ctrl+shift+a".
    */
  var key: String = js.native
  /**
    * {Function} (Optional) A callback when failed to register the hotkey.
    *
    * @param msg {string} Failure message
    */
  def failed(): js.Any = js.native
  def failed(msg: String): js.Any = js.native
}

