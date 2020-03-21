package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/epsg3857", JSImport.Namespace)
@js.native
object epsg3857Mod extends js.Object {
  val EXTENT: Extent = js.native
  val HALF_SIZE: Double = js.native
  val PROJECTIONS: js.Array[default] = js.native
  val RADIUS: Double = js.native
  val WORLD_EXTENT: Extent = js.native
  def fromEPSG4326(input: js.Array[Double]): js.Array[Double] = js.native
  def fromEPSG4326(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = js.native
  def fromEPSG4326(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = js.native
  def toEPSG4326(input: js.Array[Double]): js.Array[Double] = js.native
  def toEPSG4326(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = js.native
  def toEPSG4326(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = js.native
}

