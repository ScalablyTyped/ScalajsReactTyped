package typingsJapgolly.inboxsdk.mod.Keyboard

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInstance extends js.Object {
  def createShortcutHandle(keyboardShortcutDescriptor: KeyboardShortcutDescriptor): KeyboardShortcutHandle
}

object KeyboardInstance {
  @scala.inline
  def apply(createShortcutHandle: KeyboardShortcutDescriptor => CallbackTo[KeyboardShortcutHandle]): KeyboardInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createShortcutHandle")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Keyboard.KeyboardShortcutDescriptor) => createShortcutHandle(t0).runNow()))
    __obj.asInstanceOf[KeyboardInstance]
  }
}

