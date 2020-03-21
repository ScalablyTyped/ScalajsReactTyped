package typingsJapgolly.codemirror.mod

import typingsJapgolly.codemirror.AnonAnchor
import typingsJapgolly.codemirror.codemirrorStrings.beforeSelectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "off")
@js.native
object off_beforeSelectionChange extends js.Object {
  def apply(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* selection */ AnonAnchor, Unit]
  ): Unit = js.native
}

