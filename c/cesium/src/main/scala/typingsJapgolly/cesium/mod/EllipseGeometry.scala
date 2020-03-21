package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseGeometry")
@js.native
class EllipseGeometry protected () extends Packable {
  def this(options: AnonHeight) = this()
}

/* static members */
@JSImport("cesium", "EllipseGeometry")
@js.native
object EllipseGeometry extends js.Object {
  def createGeometry(ellipseGeometry: EllipseGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): EllipseGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseGeometry): EllipseGeometry = js.native
}

