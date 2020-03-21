package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonArcType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineGeometry")
@js.native
class PolylineGeometry protected () extends Packable {
  def this(options: AnonArcType) = this()
}

/* static members */
@JSImport("cesium", "PolylineGeometry")
@js.native
object PolylineGeometry extends js.Object {
  def createGeometry(polylineGeometry: PolylineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): PolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineGeometry): PolylineGeometry = js.native
}

