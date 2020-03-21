package typingsJapgolly.draftJs.mod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "getDefaultKeyBinding")
@js.native
object getDefaultKeyBinding extends js.Object {
  /**
    * Retrieve a bound key command for the given event.
    */
  def apply(e: ReactKeyboardEventFrom[js.Object with Element]): DraftEditorCommand | Null = js.native
}

