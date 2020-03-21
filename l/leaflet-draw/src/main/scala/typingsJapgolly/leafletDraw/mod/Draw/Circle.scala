package typingsJapgolly.leafletDraw.mod.Draw

import typingsJapgolly.leafletDraw.mod.DrawMap
import typingsJapgolly.leafletDraw.mod.DrawOptions.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.Circle")
@js.native
class Circle protected () extends SimpleShape {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: CircleOptions) = this()
}

