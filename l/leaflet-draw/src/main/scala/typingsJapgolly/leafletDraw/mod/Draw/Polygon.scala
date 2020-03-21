package typingsJapgolly.leafletDraw.mod.Draw

import typingsJapgolly.leafletDraw.mod.DrawMap
import typingsJapgolly.leafletDraw.mod.DrawOptions.PolygonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Polygon")
@js.native
class Polygon protected () extends Polyline {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: PolygonOptions) = this()
}

