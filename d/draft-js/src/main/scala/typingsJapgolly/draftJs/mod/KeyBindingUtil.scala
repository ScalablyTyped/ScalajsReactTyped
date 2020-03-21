package typingsJapgolly.draftJs.mod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "KeyBindingUtil")
@js.native
class KeyBindingUtil ()
  extends typingsJapgolly.draftJs.mod.Draft.Component.Utils.KeyBindingUtil

/* static members */
@JSImport("draft-js", "KeyBindingUtil")
@js.native
object KeyBindingUtil extends js.Object {
  def hasCommandModifier(e: ReactKeyboardEventFrom[js.Object with Element]): Boolean = js.native
  /**
    * Check whether the ctrlKey modifier is *not* being used in conjunction with
    * the altKey modifier. If they are combined, the result is an `altGraph`
    * key modifier, which should not be handled by this set of key bindings.
    */
  def isCtrlKeyCommand(e: ReactKeyboardEventFrom[js.Object with Element]): Boolean = js.native
  def isOptionKeyCommand(e: ReactKeyboardEventFrom[js.Object with Element]): Boolean = js.native
  def isSoftNewlineEvent(e: ReactKeyboardEventFrom[js.Object with Element]): Boolean = js.native
}

