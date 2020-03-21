package typingsJapgolly.d3.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.d3Drag.mod.DragBehavior
import typingsJapgolly.d3Drag.mod.SubjectPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "drag")
@js.native
object drag extends js.Object {
  def apply[GElement /* <: Element */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
}

