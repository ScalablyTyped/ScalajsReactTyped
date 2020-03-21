package typingsJapgolly.codemirror.mod

import typingsJapgolly.codemirror.codemirrorStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "on")
@js.native
object on_delete extends js.Object {
  /** Will be fired when the line object is deleted. A line object is associated with the start of the line.
    Mostly useful when you need to find out when your gutter markers on a given line are removed. */
  def apply(line: LineHandle, eventName: delete, handler: js.Function0[Unit]): Unit = js.native
}

