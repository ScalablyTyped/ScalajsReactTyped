package typingsJapgolly.codemirror.mod

import typingsJapgolly.codemirror.codemirrorStrings.cursorActivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "on")
@js.native
object on_cursorActivity extends js.Object {
  /** Fired whenever the cursor or selection in this document changes. */
  def apply(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = js.native
}

