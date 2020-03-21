package typingsJapgolly.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
class Control__ () extends Class {
  def this(options: ControlOptions) = this()
  // Extension methods
  var onAdd: js.UndefOr[js.Function1[/* map */ Map_, HTMLElement]] = js.native
  var onRemove: js.UndefOr[js.Function1[/* map */ Map_, Unit]] = js.native
  var options: ControlOptions = js.native
  def addTo(map: Map_): this.type = js.native
  def getContainer(): js.UndefOr[HTMLElement] = js.native
  def getPosition(): ControlPosition = js.native
  def remove(): this.type = js.native
  def setPosition(position: ControlPosition): this.type = js.native
}

