package typingsJapgolly.codemirror.mod

import typingsJapgolly.codemirror.AnonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "innerMode")
@js.native
object innerMode extends js.Object {
  /** Given a state object, returns a {state, mode} object with the inner mode and its state for the current position. */
  def apply(mode: Mode[_], state: js.Any): AnonMode = js.native
}

