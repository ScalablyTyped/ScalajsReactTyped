package typingsJapgolly.leafletDraw.mod.Draw

import typingsJapgolly.leafletDraw.mod.DrawMap
import typingsJapgolly.leafletDraw.mod.DrawOptions.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Marker")
@js.native
class Marker protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: MarkerOptions) = this()
}

