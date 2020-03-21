package typingsJapgolly.leafletRastercoords

import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RasterCoords protected () extends js.Object {
    def this(map: Map_, imgsize: js.Array[Double]) = this()
    def this(map: Map_, imgsize: js.Array[Double], tilesize: Double) = this()
    def project(coords: LatLngExpression): Point_ = js.native
    def setMaxBounds(): Unit = js.native
    def unproject(coords: PointExpression): LatLng_ = js.native
    def zoomLevel(): Double = js.native
  }
  
}

