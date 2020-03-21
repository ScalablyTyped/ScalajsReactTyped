package typingsJapgolly.leafletDraw.mod.Draw

import typingsJapgolly.leaflet.mod.Handler
import typingsJapgolly.leafletDraw.mod.DrawMap
import typingsJapgolly.leafletDraw.mod.DrawOptions.EditHandlerOptions
import typingsJapgolly.leafletDraw.mod.DrawOptions.MarkerOptions
import typingsJapgolly.leafletDraw.mod.DrawOptions.PolygonOptions
import typingsJapgolly.leafletDraw.mod.DrawOptions.PolylineOptions
import typingsJapgolly.leafletDraw.mod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Feature")
@js.native
class Feature () extends Handler {
  def initialize(map: DrawMap, options: EditHandlerOptions): Unit = js.native
  def initialize(map: DrawMap, options: MarkerOptions): Unit = js.native
  def initialize(map: DrawMap, options: PolygonOptions): Unit = js.native
  def initialize(map: DrawMap, options: PolylineOptions): Unit = js.native
  def initialize(map: DrawMap, options: RectangleOptions): Unit = js.native
  def setOptions(options: EditHandlerOptions): Unit = js.native
  def setOptions(options: MarkerOptions): Unit = js.native
  def setOptions(options: PolygonOptions): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
}

