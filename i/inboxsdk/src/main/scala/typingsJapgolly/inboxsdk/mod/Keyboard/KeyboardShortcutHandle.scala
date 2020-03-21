package typingsJapgolly.inboxsdk.mod.Keyboard

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardShortcutHandle extends js.Object {
  def remove(): Unit
}

object KeyboardShortcutHandle {
  @scala.inline
  def apply(remove: Callback): KeyboardShortcutHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[KeyboardShortcutHandle]
  }
}

