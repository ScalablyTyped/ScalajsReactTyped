package typingsJapgolly.leafletDraw.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "map")
@js.native
object map extends js.Object {
  def apply(element: String | HTMLElement): DrawMap = js.native
  def apply(element: String | HTMLElement, options: MapOptions): DrawMap = js.native
}

