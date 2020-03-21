package typingsJapgolly.codemirror.mod

import typingsJapgolly.codemirror.AnonAnchor
import typingsJapgolly.codemirror.codemirrorStrings.beforeSelectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "on")
@js.native
object on_beforeSelectionChange extends js.Object {
  /** Equivalent to the event by the same name as fired on editor instances. */
  def apply(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* selection */ AnonAnchor, Unit]
  ): Unit = js.native
}

