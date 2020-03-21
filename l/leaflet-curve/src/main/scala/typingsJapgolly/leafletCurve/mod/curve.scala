package typingsJapgolly.leafletCurve.mod

import typingsJapgolly.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "curve")
@js.native
object curve extends js.Object {
  /*
    * Drawing Bezier curves and other complex shapes.
    */
  def apply(path: js.Array[_]): Curve_ = js.native
  def apply(path: js.Array[_], options: PathOptions): Curve_ = js.native
}

