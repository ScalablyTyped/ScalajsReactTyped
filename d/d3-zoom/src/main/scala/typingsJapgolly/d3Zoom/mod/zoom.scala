package typingsJapgolly.d3Zoom.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-zoom", "zoom")
@js.native
object zoom extends js.Object {
  def apply[ZoomRefElement /* <: Element */, Datum](): ZoomBehavior[ZoomRefElement, Datum] = js.native
}

