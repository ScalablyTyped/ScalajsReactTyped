package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonPolylinePositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
class PolylineVolumeGeometry protected () extends Packable {
  def this(options: AnonPolylinePositions) = this()
}

/* static members */
@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
object PolylineVolumeGeometry extends js.Object {
  def createGeometry(polylineVolumeGeometry: PolylineVolumeGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): PolylineVolumeGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeGeometry): PolylineVolumeGeometry = js.native
}

