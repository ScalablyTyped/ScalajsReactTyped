package typingsJapgolly.leafletDraw.mod.Draw

import typingsJapgolly.leaflet.mod.Class
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leafletDraw.AnonSubtext
import typingsJapgolly.leafletDraw.mod.DrawMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Tooltip")
@js.native
class Tooltip protected () extends Class {
  def this(map: DrawMap) = this()
  def dispose(): Unit = js.native
  def removeError(): Tooltip = js.native
  def showAsError(): Tooltip = js.native
  def updateContent(): Tooltip = js.native
  def updateContent(labelText: AnonSubtext): Tooltip = js.native
  def updatePosition(latlng: LatLng_): Tooltip = js.native
}

